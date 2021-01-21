package teoria.regex;

import java.util.Scanner;

public class TestUtilidadesRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Introduce un número entero válido");
        String sNumeroEntero = sc.nextLine();
        System.out.printf("%s ¿Es un entero? %b%n",
                sNumeroEntero, UtilidadesRegex.esNumeroNatural(sNumeroEntero));
        //ejemplo de uso
        if (UtilidadesRegex.esNumeroNatural(sNumeroEntero)) {
            int duplicarNumero = 2 * Integer.parseInt(sNumeroEntero);
            System.out.printf("%s su valor doble es %d%n", sNumeroEntero, duplicarNumero);
        }
        System.out.println("Introduce un número entero negativo");
        String sNumeroEnteroNegativo = sc.nextLine();
        System.out.printf("%s ¿Es un negativo? %b%n",
                sNumeroEnteroNegativo, UtilidadesRegex.esNumeroNegativo(sNumeroEnteroNegativo));
        System.out.println("Introduce un número entero ");
        String sNumeroEntero = sc.nextLine();
        System.out.printf("%s ¿Es un entero? %b%n",
                sNumeroEntero, UtilidadesRegex.esNumeroEntero(sNumeroEntero));*/
        //Double.parseDouble("33.33"); Double.parseDouble("2,33") comprobación formato, correcto el primero
        //Double.parseDouble("-2e-12");
        System.out.println("Introduce un número real ");
        String sNumeroReal = sc.nextLine();
        System.out.printf("%s ¿Es un nº real? %b%n",
                sNumeroReal, UtilidadesRegex.esNumeroReal(sNumeroReal));
    }
}
