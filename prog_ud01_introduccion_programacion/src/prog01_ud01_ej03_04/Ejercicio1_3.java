package prog01_ud01_ej03_04;
import java.util.Scanner;

// Ej1.3 Programa que comprueba si un número de entrada es divisible por 3 o no.
public class Ejercicio1_3 {
	public static void main(String[]args){
		Scanner lector = new Scanner(System.in);
		System.out.println();
		int contador = 0; //Para el bucle
		
		do {
		System.out.println("Introduce un numero entero:");
		int numero = lector.nextInt();
		
		
		if(numero % 3 == 0){
			System.out.println("El numero "+numero+" es divisible por 3.");
			contador = 1;
		}else{
			System.out.println("el numero "+numero+" no es divisible por 3");
		}
		}while(contador != 1);
		
		lector.close();
		}
}



