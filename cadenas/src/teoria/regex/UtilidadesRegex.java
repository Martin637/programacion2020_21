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
    //validar nº reales: 23.2333, -23.2333, 0.256, -0.256, 26, 0, -26,   .266, -.266, 3., .??
    //Los número reales abarcan a los números enteros, es decir un entero es un número real también
    public static boolean esNumeroRealSinNotacionCientifica(String sNumeroReal) {
        return sNumeroReal.matches("-?[0-9]+\\.[0-9]+|[0-9]+|-[1-9][0-9]*");
    }
    //validar notación científica: 2e10, -2.2e-25, -2e2, 2.3e-5
    public static boolean esNotacionCientifica(String sNumero) {
        //notación científica: numeroReal e numeroEntero
        return sNumero.matches("(-?[0-9]+\\.[0-9]+|[0-9]+|-[1-9][0-9]*)e([0-9]+|-[1-9][0-9]*)");
    }
    public static boolean esNumeroReal (String sNumero) {
        return esNumeroRealSinNotacionCientifica(sNumero) || esNotacionCientifica(sNumero);
    }
    //validar dni: 12345678letra 12345678-letra

    public static boolean validarFormatoDNI (String dni) {
      //  return dni.matches("[0-9]{8}-?[a-zA-Z]");
        return dni.toLowerCase().matches("[0-9]{8}-?[a-z]");
    }
    //fechas:  dd/mm/yyyy dd-mm-yyyy dd mm yyyy
    public static boolean validarFormatoFecha1(String fecha) {
        return fecha.matches("[0-9]{2}[/ -][0-9]{2}[/ -][0-9]{4}");
    }
    //fechas: d/m/yyyy dd/m/yyyy d/mm/yyyy dd/mm/yyyy tb - y espacion en blanco y años desde 0 en adelante
    public static boolean validarFormatoFecha2(String fecha) {
        return fecha.matches("[0-9]{1,2}[/ -][0-9]{1,2}[/ -][0-9]{1,4}");
    }
    //controlamos los días que van desde 1, 2, ..., 9, 10, 11, ..., 19, 20, ..., 29, 30, 31, 01, 02, 03, ..09
    //controlamos los meses que van desde 1, 2, 3, ...., 10, 11, 12, 01, 02, ..., 09
    public static boolean validarFormatoFecha3(String fecha) {
        String regexDias  = "([1-9]|[12][0-9]|3[01]|0[1-9])";
        String regexMeses = "([1-9]|1[0-2]|0[1-9])";
        return fecha.matches( regexDias + "[/ -]" + regexMeses + "[/ -][0-9]{1,4}");
    }

    //controlamos los meses con 30, 28 y 31

}
