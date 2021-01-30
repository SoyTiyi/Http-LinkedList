package edu.escuelaing.arep.app;

public class LinkedList {
    public Node first;
    public Node last;


    /**
     * Este metodo añade un nuevo elemento a nuestra custom LinkedList
     * @param value, is el valor que tiene el nuevo nodo
     */
    public void add(Double value) {
        Node newNode = new Node(value);
        if (first == null) {
            first = newNode;
        } else {
            if (last == null) {
                first.setNextNode(newNode);
                last = newNode;
            } else {
                last.setNextNode(newNode);
                last = newNode;
            }
        }
    }

    /**
     * Este metodo nos retorna el valor total de la suma de los valores de la LinkedList
     * @return result, es el resultado de la suma de todos los valores que contiene cada nodo en la lista 
     */
    public Double getSumOfValues() {
        Double result = 0.0;
        if (first != null) {
            result += first.getValue();
            if (!first.getNextNode().equals(null)) {
                Node next = first.getNextNode();
                while (next != null) {
                    result += next.getValue();
                    next = next.getNextNode();
                }
            }
            return result;
        }
        return result;
    }

    /**
     * Este metodo retorna la longitud de la linkedlist
     * @return result es un entero que nos indica la longitud de la lista 
     */
    public int size() {
        int result = 0;
        if (first != null) {
            result++;
            Node next = first.getNextNode();
            while (next != null) {
                result++;
                next = next.getNextNode();
            }
        }
        return result;
    }

    /**
     * Este metodo nos retorna el valor del nodo dependiendo de la posicion que ingrese 
     * @param index posicion en la lista 
     * @return valor del nodo en la posicion index
     */
    public Double get(int index) {
        if (first != null) {
            if (index == 0) {
                return first.getValue();
            } else {
                int i = 0;
                Node next = first.getNextNode();
                Double value = null;
                while (i != index) {
                    i++;
                    value = next.getValue();
                    next = next.getNextNode();
                }
                return value;
            }
        } else {
            return null;
        }
    }

}
