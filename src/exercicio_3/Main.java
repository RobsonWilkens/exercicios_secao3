package exercicio_3;

/*Fazer um programa p/ ler 4 valores inteiros A,B,C e D. A seguir, calcule e mostre a diferença do produto 
 * de A e B pelo produto de C e D segund a formula. Diferença = (A*B-C*D)*/
/*Entrada 5/5..6/6..7-7..8/8 Saída -26 / 86*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D,dif;
		
		System.out.println("Informe o valor de A:");
		A = sc.nextInt();
		System.out.println("Informe o valor de B:");
		B= sc.nextInt();
		
		System.out.println("Informe o valor de C");
		C = sc.nextInt();
		System.out.println("Informe o valor de D");
		D = sc.nextInt();
		
		dif = (A*B-C*D);
		
		System.out.println("A diferença do ponto A/B e C/D é:" +dif);
		
		sc.next();

	}

}
