package edu.escuelaing.arep.app;

public class Node {

    public Double value;
    public Node nextNode;

    /**
     * Este metodo es el constructor del nodo
     * @param value valor que contiene el nodo
     */
    public Node(Double value){
        this.value = value;
    }

    /**
     * Constructor vacio
     */
    public Node(){}

    /**
     * Metodo que retorna el valor del nodo
     * @return value es un Double
     */
    public Double getValue(){
        return this.value;
    }

    /**
     * Metodo que cambia el valor del nodo
     * @param value nuevo valor Double para el nodo
     */
    public void setValue(Double value){
        this.value = value;
    }

    /**
     * Metodo que retorna el nodo siguiente
     * @return nextNode de tipo Node
     */
    public Node getNextNode(){
        return nextNode;
    }

    /**
     * Metodo que cambia el siguiente nodo
     * @param nextNode de tipo Node
     */
    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }
    
}
