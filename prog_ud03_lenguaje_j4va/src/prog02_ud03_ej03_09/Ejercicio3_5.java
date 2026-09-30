package prog02_ud03_ej03_09;

/*Programa que calcula el perímetro y el área de un cuadrado a partir del valor de uno de sus lados
  Calcular el perímetro es multiplicar el costado por 4
  Calcular el área es multiplicar el costado por sí mismo*/

public class Ejercicio3_5 {
	
	public static void main(String[] args) {
		
		int costado;
		
		costado = 9;
		
		int perimetro = costado*4;
		int area = costado*costado;
		
		System.out.println("El perimetro de un cuadrado es: "+perimetro);
		System.out.println("El area de un cuadrado es: "+area);
	}

}
