package ejerciciosUnidad2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Intriducimos la variable numDecimal
		double numDecimal;
		//introducimos e importamos el scanner
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario que introduzca un número decimal
       System.out.println("Por favor introduzca un número decimal");
       numDecimal = sc.nextDouble();
       // declaramos que cualquier número distinto de 0, 1 y >-1,<0, >0, >-1,<1 es casi cero 
       if (numDecimal<1 && numDecimal!=0 && numDecimal>-1 ) {
       System.out.println("Es un número casi cero");
	} else {
		System.out.println("No es un número casi cero");// si no cumple esas condiciones, no es casi cero
	}
sc.close();// cerramos el scanner
	}
}


