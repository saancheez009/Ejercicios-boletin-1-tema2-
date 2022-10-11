package ejerciciosUnidad2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaramos las variables numero y numF
		int numero;
		int numF;
		// Importamos el scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		//Le pedimos al usuario que introduzca un número para averiguar si es par o impar
		System.out.println("Por favor introduzca un número:");
		numero = sc.nextInt();
		//declaramos que si el número se divide entre 2 y el resto es=0 el número es par
		numF= numero%2;
		
		if (numF==0) { //si el resto es 0, el número es par
			System.out.println("par");
		} else {  // si no se ha cumplido el if es impar 
			System.out.println("impar"); //si el resto no es 0 el número es impar
		}
	    sc.close(); // cerramos el scanner

	}

}
