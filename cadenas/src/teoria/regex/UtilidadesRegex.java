package teoria.regex;

public class UtilidadesRegex {
    //validar número naturales del 0 en adelante
    public static boolean esNumeroNatural(String sNumeroValidar) {
        return sNumeroValidar.matches("[0-9]+");
    }
    //validar números enteros negativos:  ...., -25, -24, ...., -2, -1,
    public static boolean esNumeroNegativo(String sNumeroEnteroNegativo) {
       // return sNumeroEnteroNegativo.matches("-[0-9]+");
        return sNumeroEnteroNegativo.matches("-[1-9][0-9]*");
    }
    //validar números enteros ..., -25, -24, ...., -2, -1, 0, 1, 2 ...., 56, ....
    public static boolean esNumeroEntero(String sNumeroEntero) {
       // return esNumeroNatural(sNumeroEntero) || esNumeroNegativo(sNumeroEntero);
        return sNumeroEntero.matches("[0-9]+|-[1-9][0-9]*");
    }
    //validar nº reales: 23.2333, -23.2333, 0.256, -0.256, 26, 0, -26,   .266 ?
    //Los número reales abarcan a los números enteros, es decir un entero es un número real también
    public static boolean esNumeroReal (String sNumeroReal) {
        return sNumeroReal.matches("-?[0-9]+\\.[0-9]+|[0-9]+|-[1-9][0-9]*");
    }
    //validar notación científica: 2e10, -2.2e-25
    //validar dni: 12345678letra 12345678-letra
    //fechas:
}
