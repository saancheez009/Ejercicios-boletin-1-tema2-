package ejerciciosUnidad2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Introducimos la variable número
		int numero;
		// introducimos e importamos el scaner para leer el texto
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario que introduzca un número entre 0 y 99.999 para mostrarle las cifras que tiene 
		System.out.println("Por favor introduzca un número entre 0 y 99.999 para poder mostrarle a continuación cuantas cifras tiene:");
		numero= sc.nextInt();
		// Declaramos que si el numero es menor a 10 y mayor que 0 el número tiene una cifra
		if (numero>0 && numero<10) {
			System.out.println("El número tiene una cifra"); //Mostramos las cifras que tiene el número introducido
		} else if (numero>=10 && numero<=99) { 
			// Declaramos que si el numero es mayor o igual a 10 y menor que 100 el número tiene dos cifras
			System.out.println("El número tiene dos cifras"); //Mostramos las cifras que tiene el número introducido
		} else if (numero>=100 && numero<=999) {  
			// Declaramos que si el numero es mayor o igual a 100 y y menor que 1000 el número tiene tres cifras
			System.out.println("El número tiene tres cifras"); //Mostramos las cifras que tiene el número introducido
		} else if (numero>=1000 && numero<=9999) {
			// Declaramos que si el numero es mayor o igual a 1000 y y menor que 10000 el número tiene cuatro cifras
			System.out.println("El número tiene cuatro cifras");//Mostramos las cifras que tiene el número introducido
		} else if (numero>=10000 && numero<=99999) {
			// Declaramos que si el numero es mayor o igual a 10000 y y menor o igual a 99999 el número tiene cinco cifras
			System.out.println("El número tiene cinco cifras");//Mostramos las cifras que tiene el número introducido
		}
		sc.close(); // Cerramos el scanner
	}

}
