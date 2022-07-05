package exercicio_5;

/*Fazer um programa p/ ler o codigo de uma pe�a, o n� de pe�a 1, o valor de cada pe�a 1, o codigo de uma pe�a 2, 
 * o n� de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago*/
/*Calculo soma = (np1*vcod1)+(np2*vcod2)*/

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int np1,np2;
		double vcod1,vcod2,soma;

		System.out.println("Informe itens de codigo 1.");
		System.out.println("Quantidade de pe�as do codigo 1.");
		np1 = sc.nextInt();
		System.out.println("Informe o valor por pe�a.");
		vcod1 = sc.nextDouble();
		
		System.out.println("Informe itens de codigo 2.");
		System.out.println("Quantidade de pe�as do codigo 2.");
		np2 = sc.nextInt();
		System.out.println("Informe o valor por pe�a.");
		vcod2 = sc.nextDouble();
		
		soma = (np1*vcod1)+(np2*vcod2);
		
		System.out.printf("Valor a pagar R$%.2f.%n", soma);
		
		sc.close();
	}

}
