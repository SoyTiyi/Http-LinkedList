package edu.escuelaing.arep.app;

public class Main {
    LinkedList linkedList;
    public static void main(String[] args) {
        System.out.println("My Own LinkedLIst");
        new Main();
    }

    public Main(){
        linkedList = new LinkedList();
        banner();
        addFirstElementsToList();
        showLinkedList();
        showMean();
        showStandardDesviation();
     }

     public void banner(){
        System.out.println("################ Taller GIT y MVN #################");
        System.out.println("################ Santiago Martinez ################");
        System.out.println("################        Arep       ################");
     }
 
     public void addFirstElementsToList(){
         linkedList.add(160.0);
         linkedList.add(591.0);
         linkedList.add(114.0);
         linkedList.add(229.0);
         linkedList.add(230.0);
         linkedList.add(270.0);
         linkedList.add(128.0);
         linkedList.add(1657.0);
         linkedList.add(624.0);
         linkedList.add(1503.0);
     }
 
     public void showLinkedList(){
         String result = "";
         for(int i=0; i<linkedList.size(); i++){
            if(i==(linkedList.size()-1)){
                result += linkedList.get(i)+"->null";
            }
            else{
                result += linkedList.get(i)+"->";
            }
         }
         System.out.println(result);
     }

     public void showMean(){
         System.out.println("Mean: "+Statics.mean(linkedList));
     }

     public void showStandardDesviation(){
        System.out.println("Standard Desviation: "+Statics.standardDesviation(linkedList));   
        System.out.println("###################################################");
     }
}
