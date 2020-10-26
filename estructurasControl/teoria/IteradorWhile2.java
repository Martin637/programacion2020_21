/*  FUNCIONAMIENTO DEL PROGRAMA
 *  Dado un numero, ejemplo 6, calculamos la siguiente suma
 * 1 + 2 + 3 + 4 + 5 + 6
 * ejemplo 3 calculamos 1 + 2 + 3
 * ejemplo 4 calculamro 1 + 2 + 3 + 4
 */
 
 /* VARIABLES REQUERIDAS Y TIPO
  * variable suma de tipo int y la inicializamos a 0
  * variable contador de tipo int y inicializamos a 1
  * variable numero de tipo int inicializado, depende, en los ejemplos
  * una vez a 6, otra vez a 3 y la última a 4
  */
  
  /*PSEUDOCÓDIGO:
   * definir numero como entero;
   * definir suma como entero;
   * definir contador como entero;
   * 
   * numero     <- 6;
   * suma       <- 0;
   * contador   <- 1;
   * 
   * Mientras contador <= numero hacer
   * 	suma = suma + contador;
   *    contador = contador + 1;
   * Fin Mientras
   * Escribir suma;
   */ 


public class IteradorWhile2 {
	
	public static void main (String[] args) {
		int numero   = -12;
		int suma = calcularSuma(numero);
		/*int suma     = 0;
		int contador = 1;
		while ( contador <= numero ) {
			suma += contador;
			contador++;
		}*/
		
		System.out.printf("La suma desde 0 a %d vale %d%n", numero, suma);
	}
	
	public static int calcularSuma(int numero) {
		int suma     = 0;
		int contador = 1;
		while ( contador <= numero ) {
			suma += contador;
			contador++;
		}
		return suma;
	}
}

