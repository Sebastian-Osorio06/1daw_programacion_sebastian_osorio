package prog02_ud03_ej03_09;

/*Programa que calcula el perímetro y el área de un rectángulo a partir del valor
  de dos de sus lados
  Calcular el perímetro es multiplicar el lado grande por dos y el lado pequeño por dos
  Calcular el área es multiplicar el lado grande por el lado pequeño
*/

public class Ejercicio3_7 {
	
	public static void main(String[] args) {
		
		int ladoGrande = 8;
		int ladoPequeno = 3;

		int perimetro = (ladoGrande * 2) + (ladoPequeno * 2);
		int area = ladoGrande * ladoPequeno;
		
		System.out.println("El lado grande del rectángulo es: "+ladoGrande);
		System.out.println("El lado pequeño del rectángulo es: "+ladoPequeno);
		
		System.out.println("\nEl perímetro del rectángulo es: " + perimetro);
		System.out.println("El área del rectángulo es: " + area);
	}
}
