package ejerciciosUnidad2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Introducimos las variables piedra, papel, tijera, jugador1 y jugador2
		final int PIEDRA = 1;
		final int PAPEL = 2;
		final int TIJERA = 3;
		
		int jugador1, jugador2;
		//Introducimos e importamos el scanner para leer el texto
		Scanner sc = new Scanner(System.in);
		// Le pedimos al jugador 1 que introduzca piedra, papel o tijera
		System.out.println("Jugador 1 elija: PIEDRA(1), PAPEL(2) O TIJERA(3).");
		jugador1= sc.nextInt();
		// Le pedimos al jugador 2 que introduzca piedra, papel o tijera
		System.out.println("Jugador 2 elija: PIEDRA(1), PAPEL(2) O TIJERA(3).");
		jugador2= sc.nextInt();
		// Si el jugador uno elige piedra, papel y tijera, y el dos elige tijera, piedra y papel. El jugador 1 gana 
		if (jugador1==PIEDRA && jugador2==TIJERA|| jugador1==PAPEL && jugador2==PIEDRA||jugador1==TIJERA && jugador2==PAPEL) {
			System.out.println("Jugador 1 Gana");
		} else if (jugador1==jugador2) { // si el jugador 1 y 2 eligen lo mismo es empate 
			System.out.println("Empate");
		} else {
			System.out.println("Jugador 2 gana"); // si lo de la primera condición no se cumple, gana el jugador 2
		}
		sc.close(); // Cerramos el scanner 
}
}
	
