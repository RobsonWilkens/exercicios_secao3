package exercicio_2;

/*Fa�a um programa p/ ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste circulo
 * com quatro casas decimais conforme formula �rea = Pi.raio�. Pi = 3.14159*/
/*Entrada 2.0 e 100.64  Sa�da A = 12.5664 e A = 31819.3103*/

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); /*Este comando deve ser usado sempre antes do Scanner*/
		Scanner sc = new Scanner(System.in);		
		
		Double R, A, pi = 3.14159;
		System.out.println("Entra com o valor do Raio");
		R = sc.nextDouble();
		
		A = pi*R*R;
		
		System.out.printf("A = %.4f%n" ,A);		
		
		sc.close();

	}

}
