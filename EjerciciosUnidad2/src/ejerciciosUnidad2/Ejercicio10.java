package ejerciciosUnidad2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaramos e introducimos las variables num1 , num2 y num3
		int num1;
		int num2;
		int num3;
		//Introducimos e importamos el scanner para poder leer el teclado
		Scanner sc = new Scanner(System.in);
		//Le pedimos al usuario que por favor introduzca tres números 
		System.out.println("Por favor introduzca un número: ");
		num1 = sc.nextInt();
		System.out.println("Por favor introduzca un número: ");
		num2 = sc.nextInt();
		System.out.println("Por favor introduzca un número: ");
		num3 = sc.nextInt();
		// Declaramos dos condiciones, un es que la suma de los dos primeros números escritos por el usuario es igual al tercer número y si esto no se cumple , la suma de los dos primero números no es igual al tercer número introducido.
		if (num1+num2==num3) {
			System.out.println("La suma de los dos primeros números , es igual al tercer número introducido: "+num1+" + "+num2+" = "+num3);
		} else {
			System.out.println("La suma de los dos primeros números, no es igual al tercer número introducido");
		}
		sc.close();//cerramos el scanner
	}

}
