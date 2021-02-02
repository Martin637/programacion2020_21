package ejercicios.ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nombres {

    public static void main(String[] args) throws FileNotFoundException {
        final List<String> listaNombres = new ArrayList<>();
       // Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(new File("FILES/nombres.txt"));
        /*String nombreLeido = scanner.nextLine();
        listaNombres.add(nombreLeido);*/
        while (scanner.hasNextLine())
            listaNombres.add(scanner.nextLine());
       // System.out.println(listaNombres);
        System.out.printf("Leídas %d cadenas%n", devolverNumeroDeCadenas(listaNombres));
        char letra = 's';
        System.out.printf("Cadenas que empiezan por %c%n%s%n",
                letra , devolverListaDeCadenasQueEmpiezanPorCaracter(letra, listaNombres));
        System.out.printf("Cadenas que no acaaban en vocal %s%n",
                devolverListaNombresQueNoAcabanEnVocal(listaNombres));
    }

    public static int devolverNumeroDeCadenas(List<String> listaCadenas){
        return listaCadenas.size();
    }
    public static List<String> devolverListaDeCadenasQueEmpiezanPorCaracter
            (char letra, List<String> listaCadenas) {
        List<String> listaLetra = new ArrayList<>();
        for (String cadena : listaCadenas) {
            if (cadena.toLowerCase().startsWith((letra + "").toLowerCase()))
                listaLetra.add(cadena);
        }
        return listaLetra;
    }
    public static List<String> devolverListaNombresQueNoAcabanEnVocal(List<String> listaCadenas) {
        List<String> listaNOAcabaVocal = new ArrayList<>();
        for (String cadena : listaCadenas) {
            if (cadena.toLowerCase().matches("^.*[^aeiouáéíóú]$"))
                listaNOAcabaVocal.add(cadena);
        }
        return listaNOAcabaVocal;
    }
}
