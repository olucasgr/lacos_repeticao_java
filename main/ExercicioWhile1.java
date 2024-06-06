package main;

import java.util.Scanner;

public class ExercicioWhile1 {
	public static void main(String[] args) {

		/*
		 * Escreva um algoritmo em Java, que leia a idade de várias pessoas (números
		 * inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja
		 * menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A
		 * leitura dos dados deve ser finalizada ao digitar uma idade negativa
		 */
		
		int age = 0, pessoaMenor21 = 0, pessoaMaior50 = 0, totalDePessoas = 0;
		
		Scanner sc = new Scanner (System.in);
		
		while(age >= 0) {
			
			System.out.println("Digite sua idade: ");
			age = sc.nextInt();
			
			if (age < 21 && age >= 0) {
				
				pessoaMenor21++;
				totalDePessoas++;
				
			} else if (age > 50) {
				
				pessoaMaior50++;
				totalDePessoas++;
				
			}else {
				totalDePessoas++;
			}
		}
		
		System.out.println("Quantidade de pessoas menores de 21 anos: " + pessoaMenor21);
		System.out.println("Quantidade de pessoas maiores de 50 anos: " + pessoaMaior50);
		System.out.println("Total de pessoas entrevistadas: " + (totalDePessoas - 1));
		
		sc.close();
	}
}
