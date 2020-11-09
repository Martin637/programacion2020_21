/*
 * uso de los métodos hasNext...
 */

import java.util.Scanner;

public class Ejercicio3_1 {
	
	public static void main (String[] args) {
		int contador = 0, suma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce números enteros, teclea fin para acabar");
		while (sc.hasNextInt()) {
			int numero = sc.nextInt();
			System.out.printf("Nº entero leído: %d%n", numero);
			contador++;
			suma += numero;
		}
		double media = suma / contador;
		System.out.printf("Introducidos %d número y la media vale %.2f%n", 
				contador, media);
	}
}

