package main;

import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e
		 * mostre na tela quantos números são pares e quantos número são ímpares
		 */

		int number, count, totalImpar = 0, totalPar = 0;

		Scanner sc = new Scanner(System.in);

		for (count = 1; count < 11; count++) {

			System.out.println("Digite o " + count + " número:");
			number = sc.nextInt();

			if (number % 2 == 0) {
				totalPar++;
			} else {
				totalImpar++;
			}

		}

		System.out.println("Quantidade de números pares:" + totalPar);
		System.out.println("Quantidade de números ímpares" + totalImpar);

		sc.close();

	}

}
