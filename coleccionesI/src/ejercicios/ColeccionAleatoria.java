package ejercicios;

import java.util.Arrays;

public class ColeccionAleatoria {

    private static final int LONGITUD_VALORES = 5;
    private static final int VALOR_MAXIMO = 100;
    //Cree un array de de 100 valores de tipo int: ATRIBUTO
    private int[] valores = new int[LONGITUD_VALORES]; //se crea {0,0,0 ....0}  100 valores

    public int[] getValores() {
        return valores;
    }

    //Usando un bucle rellénalo con valores aleatorios comprendidos entre 0 y
    //100. Usa Math.random() para esto
    public void rellenarAleatoriamente() {
        int valorAleatorio;
        for (int i = 0; i < LONGITUD_VALORES; i++) {
            valorAleatorio = (int) (Math.random() * VALOR_MAXIMO); //entendemos que el 100 no entra
            valores[i] = valorAleatorio;
        }
    }
    //Crea un metodo que devuelva el valor medio de los datos.
    public double calcularValorMedio () {
        int suma = 0;
        for (int apuntador: valores ) {
            suma += apuntador;
        }
        return 1.0 * suma / LONGITUD_VALORES;
    }
    //desviación típica
    public double calcularDesviacionTipica () {
        double suma = 0;
        for (int valor: valores) {
            suma += Math.pow(valor - calcularValorMedio () , 2);
        }
        return Math.sqrt(suma / LONGITUD_VALORES);
    }

    //devolver el array ordenado
    public int[] devolverArrayOrdenado () {
       Arrays.sort(valores); //devuelve void, no puedo hacer return Arrays.sort(valores) y tiene que devolver int[]
       return valores;
    }
    //devolver el valor mínimo
    public int devolverValorMinimo () {
        /*devolverArrayOrdenado();
        return valores[0];*/
        /*int[] ordenado = devolverArrayOrdenado();
        return ordenado[0];*/
        // return devolverArrayOrdenado()[0];  { 2, 3 , 0, -2, 8}
        int valorMinimo = Integer.MAX_VALUE;
        for (int valor: valores) {
            if (valor < valorMinimo)
                valorMinimo = valor;
        }
        return valorMinimo;
    }
    public int devolverValorMaximo () {
        int valorMaximo = Integer.MIN_VALUE;
        for (int valor: valores) {
            if (valor > valorMaximo)
                valorMaximo = valor;
        }
        return valorMaximo;
    }

    //devolvemos un array con los valores pares del array original
    public int[] devolverArrayDePares() {
        int[] arrayPares = new int[LONGITUD_VALORES];  // { 0, 0, 0, 0, 0}
        int numeroPares = 0;
        for (int valor: valores) {
            if (valor % 2 == 0) {      // { 2, 3 , 0, -2, 8}
                arrayPares[numeroPares] = valor;
                numeroPares++;
            }
        }   //arrayPares  {2, 0, -2, 8 , 0}  tenemos que devolver {2, 0, -2, 8}
        return Arrays.copyOf(arrayPares, numeroPares);
    }



}
