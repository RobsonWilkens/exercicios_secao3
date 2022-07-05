/*Faça um programa p/ ler dois valores inteiros, e depois mostrar na tela a soma desses números
 *com uma mensagem explicativa, conforme entradas: Entrada 10/30 Saída: 40*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, soma;
		
		System.out.println("Informe o primeiro valor:");
		A = sc.nextInt();
		
		System.out.println("Informe o segundo valor:");
		B = sc.nextInt();
		
		soma = A+B;
		
		System.out.println("Soma = " +soma);
		
		sc.close();
	}

}
