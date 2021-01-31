package edu.escuelaing.arep.app.Spark;
import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.staticFiles;
import edu.escuelaing.arep.app.Statics;

public class SparkWebApp {
    
    public static void main(String[] args){
        port(getPort());
		staticFiles.location("/public");
		post("/calc", (request, response) -> {
            
            Statics statics = new Statics();
            statics.readJSON(request.body());
			
			return "{\"media\":" + statics.mean() + ", \"desviacion\":" + statics.standardDesviation() + "}";
		});

    }

    static int getPort(){
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}
