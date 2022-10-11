package ejerciciosUnidad2;

import java.util.Scanner;

public class Ejecicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Declaramos las variables del número 1 y número dos introducidos por el usuario
		int num1;
		int num2;
		// importamos el scanner para leer el ejercicio
		Scanner sc = new Scanner(System.in);
		//Le pedimos al usuario que introduzca dos números enteros
	    System.out.println("Por favor introduzca un número entero:");
	    num1 = sc.nextInt();
	    System.out.println("Por favor introduzca un número entero:");
	    num2 = sc.nextInt();
	    //Declaramos que si num1 es igual a num2los números, son iguales, y si no se cumple eso, los números no son iguales.
	    if (num1==num2) {
	    	System.out.println("Los números introducidos son iguales");
	    } else {
	    	System.out.println("Los números introducidos no son iguales");
	    }
	    
	    sc.close(); //cerramos el scanner
	}

}
