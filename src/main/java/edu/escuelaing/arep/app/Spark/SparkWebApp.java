package edu.escuelaing.arep.app.Spark;

import static spark.Spark.*;

public class SparkWebApp {
    
    public static void main(String[] args){
        get("/hello", (req,res) -> "Hello Heroku");
    }

    public static int getPort(){
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}
