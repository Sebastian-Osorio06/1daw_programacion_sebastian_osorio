package prog02_ud03_ej03_09;

//Programa para evaluación de expresiones con diferentes operadores y variables

public class Ejercicio3_8 {

    public static void main(String[] args) {

        int numeroA = 5;
        int numeroB = 9;
        int numeroC = 3;
        int numeroD = 4;

        int resultadoA = 2 - numeroA * numeroB + numeroC;
        int resultadoB = (2 - numeroA) * numeroB + numeroC;
        int resultadoC = numeroA * numeroB - numeroC * numeroA - numeroD;
        int resultadoD = numeroA / 3 - numeroB;
        int resultadoE = numeroA / (33 - numeroB);
        int resultadoF = numeroD * 23 - 1 + numeroB;

        System.out.println(resultadoA);
        System.out.println(resultadoB);
        System.out.println(resultadoC);
        System.out.println(resultadoD);
        System.out.println(resultadoE);
        System.out.println(resultadoF);
    }
}