package teoria.caracteres;

public class Utilidades {
    //clave es segura si tiene al menos 8 caracteres, minúscula, mayúscula, número, no alfanumérico
    public static boolean esClaveSegura(String clave) {
        return contieneAlMenos8caracteres(clave) && contieneMinuscula(clave) && contieneMayuscula(clave)
                && contieneNumero(clave) && contieneNoAlfaNumerico(clave);
    }

    private static boolean contieneNoAlfaNumerico(String clave) {
    }

    private static boolean contieneNumero(String clave) {
    }

    private static boolean contieneMayuscula(String clave) {
    }

    private static boolean contieneMinuscula(String clave) {
    }

    private static boolean contieneAlMenos8caracteres(String clave) {
    }
}
