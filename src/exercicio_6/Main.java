package exercicio_6;

/*Fa�a um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A,B e C. Em seguida, calcule e mostre:
 * A) A �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
 * B) A �rea do c�rculo do raio C. (Pi = 3.14159)
 * C) A �rea do trap�zio que tem A e B por bases e C por altura.
 * D) A �rea do quadrado que tem lado b.
 * E) A �rea do ret�ngulo que tem lados A e B.*/

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A,B,C,triangulo,circulo,trapezio,quadrado,retangulo,pi=3.14159;
		
		System.out.println("Entre com valor de A:");
		A = sc.nextDouble();
		System.out.println("Entre com valor de B:");
		B = sc.nextDouble();
		System.out.println("Entre com valor de C:");
		C = sc.nextDouble();
		
		triangulo = A*C/2;
		circulo = C*C*pi;
		trapezio = A+B*C/2;
		quadrado = B*B;
		retangulo = A*B;
		
		System.out.printf("Valor da �rea do Tri�ngulo:%.3f.%n", triangulo);
		System.out.printf("Valor da �rea do C�rculo:%.3f.%n", circulo);
		System.out.printf("Valor da �rea do Trap�zio:%.3f.%n", trapezio);
		System.out.printf("Valor da �rea do Quadrado:%.3f.%n", quadrado);
		System.out.printf("Valor da �rea do Retangulo:%.3f.%n", retangulo);
		
		sc.close();		
	}

}
