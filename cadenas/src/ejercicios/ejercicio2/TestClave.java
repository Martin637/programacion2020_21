package ejercicios.ejercicio2;

import java.util.Random;

public class TestClave {
    public static void main(String[] args) {

        ClaveSegura claveSegura = new ClaveSegura();
        //si posibleClave es una clave segura, llamando al método esClaveSegura de la clase ClaveSegura
        //Creo un objeto ClaveSegura, donde el atributo claveSegura sería posibleClave
        /*if (ClaveSegura.esClaveSegura(posibleClave)) {
            ClaveSegura claveSegura = new ClaveSegura();
            claveSegura.setClaveSegura(posibleClave);
            System.out.printf("Clave segura %s%n", claveSegura.getClaveSegura());
        }*/

        while (true) {
            String posibleClave = ClaveSegura.getPosibleClave();
            if (ClaveSegura.esClaveSegura(posibleClave)) {
                claveSegura.setClaveSegura(posibleClave);
                break;
            }
        }
        System.out.printf("Clave segura %s%n", claveSegura.getClaveSegura());

    }


}
