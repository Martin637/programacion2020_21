package ejercicios;

public class ColeccionAleatoria {

    private static final int LONGITUD_VALORES = 100;
    private static final int VALOR_MAXIMO = 100;
    //Cree un array de de 100 valores de tipo int: ATRIBUTO
    private int[] valores = new int[LONGITUD_VALORES]; //se crea {0,0,0 ....0}  100 valores

    //Usando un bucle rellénalo con valores aleatorios comprendidos entre 0 y
    //100. Usa Math.random() para esto
    public void rellenarAleatoriamente0a100() {
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

        return 0;
    }



}
