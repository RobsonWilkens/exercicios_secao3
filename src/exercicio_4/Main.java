package exercicio_4;

/*Fazer um programa que leia o n�mero de um funcion�rio, seu n� de horas trabalhadas, o valor que recebe por hora 
 * e calcular o sal�rio desse funcion�rio. Aseguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais.*/

/*Entrada 1: 25/100/5.50 Entrada 2: 1/200/20.50 Entrada 3: 6/145/15.55*/

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int CodFun;
		double ht, vh, salario;
		
		System.out.println("Informe o seu a sua matricula: ");
		CodFun = sc.nextInt();
		System.out.println("Quantas horas trabalhou esse m�s?");
		ht = sc.nextDouble();
		System.out.println("Informe quanto ganha por hora.");
		vh = sc.nextDouble();
		
		salario = ht*vh;
		
		System.out.println("Matricula: " +CodFun+".");
		System.out.printf("O funcionario de matricula: " +CodFun+ ". Recebe R$: %.2f.%n", salario);
				
		sc.close();

	}

}
