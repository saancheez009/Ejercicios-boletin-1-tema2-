package ejerciciosUnidad2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaramos tres variables, num1, num2, num3
		int num1;
		int num2;
		int num3;
		// introducimos e importamos el scanner
		Scanner sc = new Scanner(System.in);
		//Le pedimos al usuario que introduzca tres números 
		System.out.println("Por favor introduzca un número: ");
		
		num1 = sc.nextInt();
		
		System.out.println("Por favor introduzca un número: ");
		
		num2 = sc.nextInt();

		System.out.println("Por favor introduzca un número: ");
		
		num3 = sc.nextInt();
		// declaramos todos los condicionales 
		if (num1>num2 && num2>num3) {
				System.out.println(num1+","+num2+","+num3);
		}else {
				if(num1>num3 && num3>num2)
				System.out.println(num1+","+num3+","+num2);
			else {
		     if (num3>num1 && num1>num2) {
			System.out.println(num3+","+num1+","+num2);
		     } else {
			   if (num3>num2 && num2>num1) {
			System.out.println(num3+","+num2+","+num1);
			   }else {
				if (num2>num1 && num1>num3) {   
					System.out.println(num2+","+num1+","+num3);
			   }else {
				   if (num2>num3 && num3>num1) {
					   System.out.println(num2+","+num3+","+num1);
				   }
			   }
			   }
		     }
		}
	}
		sc.close(); //cerramos el scanner
}
}
