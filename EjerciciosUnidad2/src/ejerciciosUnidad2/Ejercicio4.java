package ejerciciosUnidad2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// introducimos las variables num1 y num2
		 	int num1;
	        int num2;
			// introducimos el scanner y lo importamos
		   Scanner sc = new Scanner(System.in);
		   // Le pedimos al usuario que introduzca dos número
	       System.out.println("Por favor introduzca un número: ");
	       num1 = sc.nextInt();
	       System.out.println("Por favor introduzca otro número: ");
	       num2 = sc.nextInt();
	       // declaramos que si num1 es menos que num2 se cumple el if pero si no se cumple, num 2 es menor  que num 1
	       if (num1<num2) {
	    	   System.out.println("El número "+num1+" es menor que "+num2+".");
	       } else {
		       System.out.println("El número "+num2+" es menor que "+num1+".");
	}
	       sc.close(); // cerramos el scanner
		}

	}

        
	
