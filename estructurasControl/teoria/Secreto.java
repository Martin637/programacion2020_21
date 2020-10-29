/*
 * Descubrir un número secreto 
 */


public class Secreto {
	
	public static void main (String[] args) {
		//número aleatorio entre 1 y 100 inclusive ambos
		//varios jugadores 
		int numeroJugadores = 3;
		int numeroADescubrir = (int) (Math.random() * 100 ) + 1;
		System.out.println("Nº a descubrir: " + numeroADescubrir);
		
		for (int i = 1 ; i <= 100 ; i++ ) {
			System.out.println("Probando con " + i);
			if ( i == numeroADescubrir) {
				System.out.println("Descubierto el nº " + i);
				break;
			}
			
		}
		
	}
}

