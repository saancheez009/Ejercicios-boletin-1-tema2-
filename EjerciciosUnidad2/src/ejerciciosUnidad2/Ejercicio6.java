package ejerciciosUnidad2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaramos las variables a, b, c, raíz y x1 y x2
		int a;
		int b;
		int c;
		double x1;
		double x2;
		double raiz;
		//Introducimos e importamos el scanner para leer el texto
		Scanner sc = new Scanner(System.in);
		//Le pedimos al usuarioque introduzca un valor a "a"
		System.out.println("Por favor introduzca un valor para a: ");
		
		a = sc.nextInt();
		
		//Le pedimos al usuarioque introduzca un valor a "b"
		System.out.println("Por favor introduzca un valor para b: ");
		
		b = sc.nextInt();
		
		//Le pedimos al usuarioque introduzca un valor a "c"
		System.out.println("Por favor introduzca un valor para c: ");
		
		c = sc.nextInt();
		
		//Calculamos la raíz de la ecuación
		raiz = ((b*b)-4*a*c);
		//Calculamos x1  y x2
		x1 = (-b + Math.sqrt(raiz))/(2*a);
		x2 = (-b - Math.sqrt(raiz))/(2*a);
		//Declaramos que si la raíz es negativa, osea menor que 0 . La ecuación no tiene solución
		if (raiz <0) {
			System.out.println("NO HAY SOLUCIÓN");// Mostramos que no tiene solución al cumplirse el condicional.
		} else {
			System.out.println("X1 es= "+x1); //mostramos la solución de x1
			System.out.println("X2 es: "+x2) ; //mostramos la solución de x2
		}
		sc.close(); //Cerramos el scanner
		}
		
	}


