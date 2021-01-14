package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColeccionDinamica {
    public static void main(String[] args) {
        //Declare un ArrayList para guardar objetos de tipo String.
        List<String> listaCadenas = new ArrayList<>();  //creamos una lista de String VACÍA
        //Leemos las cadenas con un Scanner, hasta que encuetre fin o FIN, voy aceptar Fin
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce cadenas, para terminar escribe fin");
        while (true) {
            cadena = sc.nextLine();  //permito como cadena "hola", "hola amigo"  SON DOS CADENAS DISTINTAS
            //Si cadena es fin (variantes) salimos del bucle
          //  if (cadena == "fin")  NO FUNCIONA, SOLO PARA TIPOS PRIMITIVOS, int, double, char, boolean ...
          //  if (cadena.equals("fin")) NO FUNCIONA, SOLO PARA fin, NO VALE PARA FIN, ni para Fin
            if (cadena.equalsIgnoreCase("fin"))
                break;
            //añado la cadena a la lista
            listaCadenas.add(cadena);
        }
        sc.close();
        System.out.println(listaCadenas);  //comprobación
    }

    //método que nos devuelva las cadenas de mayor longitud
    public static List<String> obtenerCadenasMayorLongitud (List<String> listaCadenas) {

        //["imp", "uno", "dos", "cinco"]   devolvemos ["cinco"]
        //["imp", "uno", "dos", "ci"]   devolvemos ["imp", "uno", "dos"]
        //primero definimos la lista que vamos a devolver, la de las cadenas mas largas
       // List<String> listaCadenasMasLargas; típico error, hay que inicializar la lista
        List<String> listaCadenasMasLargas = new ArrayList<>();  //lista vacía []
        int longituCadenaMasLarga = 0;
        for (String cadena: listaCadenas) {
            //si la cadena es mas pequeña, la ignoro
            /*if (cadena.length() < longituCadenaMasLarga) {
                //no  hago nada
            }
            //si la cadena tiene la misma longitud que la mas grande actual, la añado a la lista
            else if (cadena.length() == longituCadenaMasLarga) {
                listaCadenasMasLargas.add(cadena);
            }
            //si la cadena tiene la mayor longitud que la mas grande actual, limpiar lista, añado la nueva cadena
            else {
                listaCadenasMasLargas.clear();
                listaCadenasMasLargas.add(cadena);
                longituCadenaMasLarga = cadena.length();
            }*/

            //CADENA MAS LARGA QUE LAS QUE HAY EN LA LISTA
            if (cadena.length() > longituCadenaMasLarga) {
                listaCadenasMasLargas.clear();
                listaCadenasMasLargas.add(cadena);
                longituCadenaMasLarga = cadena.length();
                continue;
            }
            //CADENA DE IGUAL LONGITUD
            if (cadena.length() == longituCadenaMasLarga)
                listaCadenas.add(cadena);

         /*   //CADENA DE MAYOR O IGUAL LONGITUD
            if (cadena.length() >= longituCadenaMasLarga) {
                if (cadena.length() > longituCadenaMasLarga) {
                    listaCadenas.clear();
                    longituCadenaMasLarga = cadena.length();
                }
                listaCadenasMasLargas.add(cadena);
            }*/
        }
        return listaCadenasMasLargas;
    }

    //Un método que se le pase por argumento una cadena y nos diga si dicha
    //cadena se encuentra en la colección anterior.
    public static boolean existeCadena (List<String> listaCadenas, String cadenaABuscar) {
       /* for (String cadena: listaCadenas) {
            if (cadena.equals(cadenaABuscar)) {
                return true;
            }
        }
        return false;*/
       return listaCadenas.contains(cadenaABuscar);
    }

    //Un método que nos sirva para añadir nuevas cadenas a la colección.
    public static boolean annadirCadena (List<String> listaCadenas, String cadenaNueva) {
        return  listaCadenas.add(cadenaNueva);
    }
}
