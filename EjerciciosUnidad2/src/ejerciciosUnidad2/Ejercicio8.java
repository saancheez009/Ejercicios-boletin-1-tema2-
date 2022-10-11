package ejerciciosUnidad2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaramos la variable número
		double numero;
		//Introducimos e importamos el scanner 
		Scanner sc = new Scanner(System.in);
		//Le pedimos al usuario que introuzca un número real
		System.out.println("Por favor introduzca un número real:");
		numero = sc.nextDouble();
		//Le mostramos al usuario si su nota es insufiiente, suficiente,bien, notable o sobresaliente.
		if (numero>=0 && numero<5) {
			System.out.println("INSUFICIENTE");
		} else if (numero>=5 && numero<6) {
			System.out.println("SUFICIENTE");
		} else if (numero>=6 && numero<7) {
			System.out.println("BIEN");
			} else if (numero>=7 && numero<9) {
				System.out.println("NOTABLE");
		} else if (numero>=9 && numero<=10) {
			System.out.println("SOBRESALIENTE");
		}
		sc.close();//cerramos el scanner
	}

}
