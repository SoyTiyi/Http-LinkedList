package edu.escuelaing.arep.app;

import java.lang.Math;

public class Statics {
	private LinkedList linkedList;

	/**
	 * Este es el constructor vacio el cual inicializa el objeto
	 */
	public Statics(){
		linkedList = new LinkedList();
	}

	/**
	 * Este es el constructor que recibe ya la lista con los valores
	 * @param linkedList
	 */
	public Statics(LinkedList linkedList) {
		this.linkedList = linkedList;
	}

	/**
	 * Este metodo lee el json y añade a la lista cada valor
	 * @param json json en formato String
	 */
	public void readJSON (String json) {
		linkedList = new LinkedList();
		String[] jsonList = json.replace("\"", "").replace("]", "").replace("[", "").split(",");
		for (int i = 0; i < jsonList.length; i++) {
			double value = Double.parseDouble(jsonList[i]);
			linkedList.add(value);
		}
	}

	/**
	 * Este metodo nos calcula la media de los valores que se encuentran en la lista 
	 * @param numbers de tipo LinkedList
	 * @return mean de tipo Double
	 */
	public Double mean(){
		LinkedList numbers = linkedList;
		Double  sum=0.0;
		for(int i=0; i<numbers.size(); i++){
			sum += numbers.get(i);
		}
		/* System.out.println((Math.floor(sum/ numbers.size() * 100) / 100)); */
		return (Math.floor(sum/ numbers.size() * 100) / 100);
	}

	/**
	 * Este metodo calcula la desviacion estandar de la población de datos
	 * @param numbers de tipo LinkedList
	 * @return standard desviation de tipo Double
	 */
	public Double standardDesviation(){
		LinkedList numbers = linkedList;
		Double mean = mean();
		Double temp = 0.0;
		for(int i=0; i<numbers.size(); i++){
			temp+= Math.pow(numbers.get(i)-mean, 2);
		}
		/* System.out.println(temp + " Sumatoria"); */
		Double inSide = temp/(numbers.size()-1);
		return (Math.floor(Math.sqrt(inSide) * 100) / 100);
	}
}
