package edu.escuelaing.arep.app;

import java.lang.Math;


class Statics {

	/**
	 * Este metodo nos calcula la media de los valores que se encuentran en la lista 
	 * @param numbers de tipo LinkedList
	 * @return mean de tipo Double
	 */
	public static Double mean(LinkedList numbers){
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
	public static Double standardDesviation(LinkedList numbers){
		Double mean = mean(numbers);
		Double temp = 0.0;
		for(int i=0; i<numbers.size(); i++){
			temp+= Math.pow(numbers.get(i)-mean, 2);
		}
		/* System.out.println(temp + " Sumatoria"); */
		Double inSide = temp/(numbers.size()-1);
		return (Math.floor(Math.sqrt(inSide) * 100) / 100);
	}
}
