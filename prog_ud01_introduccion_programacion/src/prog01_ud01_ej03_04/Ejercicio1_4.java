package prog01_ud01_ej03_04;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1_4 {
	public static void main(String []args){
		Scanner lector = new Scanner(System.in);
		Random random = new Random();
		
		String[] listaOpciones= {"Piedra","Papel","Tijeras"};
		System.out.println("Bienvenido al juego de Piedra, papel o tijeras");
		System.out.println("Elige una opción: 0 para piedra, 1 para papel, 2 para tijeras");
		System.out.println("Tu opción: ");
		int eleccionJugador = lector.nextInt();
		
		int eleccionOrdenador= random.nextInt(3);
		
		System.out.println("Tu has elegido: "+listaOpciones[eleccionJugador]);
		System.out.println("El ordenador ha elegido: "+listaOpciones[eleccionOrdenador]);
		
	
		if (eleccionJugador == eleccionOrdenador) {
			System.out.println("Habéis empatado");
		}
		
		else if ((eleccionJugador == 0 && eleccionOrdenador == 2) || (eleccionJugador == 1) &&
		(eleccionOrdenador == 0) || (eleccionJugador == 2 && eleccionOrdenador == 1)) {
			System.out.println("Has ganado a la máquina");
		}
		else{
			System.out.println("Has perdido contra la máquina");
		}
		lector.close();
		
		}
}




