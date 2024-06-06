package main;

import java.util.Scanner;

public class ExercicioDoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escreva um algoritmo em Java, que leia números inteiros via teclado, até que
		 * o número zero seja digitado. Ao final, mostre na tela a soma de todos os
		 * números digitados, que sejam positivos.
		 */
		
		int number, sumPositiveNumbers = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("**************************************************");
		System.out.println("--- Contador de números positivos ---");
		System.out.println("**************************************************");
		
			do {
				
				System.out.println("Digite um número inteiro:");
				number = sc.nextInt();
				
				if (number > 0) {
					sumPositiveNumbers += number;
				}
				
			} while (number != 0);
			
			System.out.println("**************************************************");
			System.out.println("Soma dos números positivos: " + sumPositiveNumbers);
			System.out.println("**************************************************");
		sc.close();

	}

}
