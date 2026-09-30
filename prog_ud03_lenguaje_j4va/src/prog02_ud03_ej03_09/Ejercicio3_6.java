package prog02_ud03_ej03_09;

/*
 * Programa que muestra los valores de numA y numB,
 * intercambia sus valores haciendo que numB contenga el valor de numA
 * y que numA contenga el valor de numB, y finalmente vuelve a mostrar
 * los valores intercambiados.
 */

public class Ejercicio3_6 {

    public static void main(String[] args) {

        int numA = 58;
        int numB = 7;

        System.out.println("Valor inicial de numA: " + numA);
        System.out.println("Valor inicial de numB: " + numB);

        int valorAuxiliar = numA;

        numA = numB;
        numB = valorAuxiliar;

        System.out.println("Valor numA después del intercambio: " + numA);
        System.out.println("Valor numB después del intercambio: " + numB);
    }
}