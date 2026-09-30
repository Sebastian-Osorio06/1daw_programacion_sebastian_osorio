package prog02_ud03_ej03_09;

/*Comparación entre dos números mediante operadores de comparación,
  obteniendo un resultado lógico*/

public class Ejercicio3_9 {

	public static void main(String[] args) {
		
		int numA = 26;
		int numB = 13; 
		boolean resultado = numA > numB;
		
		//El valor que se muestra es true, porque indica que numA(26) es mayor que numB(13)
		System.out.println("numA("+numA+") es > que numB("+numB+")?: "+resultado);
		
		
		resultado = numA < numB;
		
		//El valor que se muestra es false, porque indica que numA(26) es menor que numB(13)
		System.out.println("numA("+numA+") es < que numB("+numB+")?: "+resultado);

	}

}
