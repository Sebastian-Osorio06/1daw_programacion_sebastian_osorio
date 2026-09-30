package prog02_ud03_ej03_09;

/*Programa que modifica el valor de "resultado" restándole 5, multiplicándolo por m,
  mostrando su valor, dividiéndolo por n, sumándole 30 y mostrando el resultado final*/

public class Ejercicio3_4 {
	
	public static void main(String[] args) {

		int numero1 = 23;
		int numero2 = 12;
		int resultado = 0;
		
		resultado = numero1 + numero2;
		System.out.println("La suma de "+numero1+" + "+numero2+" = "+resultado);		resultado-=5;
		
		resultado*=numero1;
		System.out.println("El resultado después de restarle 5 y multiplicarlo por 23 = "+resultado);
		
		resultado/=numero2;
		resultado+=30;
		System.out.println("El resultado después de dividirlo entre 12 y sumarle 30 = "+resultado);
	}
}