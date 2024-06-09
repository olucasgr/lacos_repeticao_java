package main;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioWhile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Faça um programa que leia as notas referentes às duas avaliações de um aluno.
		 * Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas
		 * válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve
		 * ser validada separadamente.
		 * 
		 * Entrada A entrada contém vários valores reais, positivos ou negativos. O
		 * programa deve ser encerrado quando forem lidas duas notas válidas.
		 * 
		 * Saída Se uma nota inválida for lida, deve ser impressa a mensagem
		 * "nota invalida". Quando duas notas válidas forem lidas, deve ser impressa a
		 * mensagem "media = " seguido do valor do cálculo. O valor deve ser apresentado
		 * com duas casas após o ponto decimal.
		 */
		
		double grades1, grades2, semesterNote;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("*********************************");
		System.out.println("--- Sistema de nota semestral ---");
		System.out.println("*********************************");
		
		System.out.println("Digite a primeira nota :");
		grades1 = sc.nextDouble();
		
		while (grades1 > 10 || grades1 < 0) {
			System.out.println("Nota invelida !");
			System.out.print("Digite novamente: ");
			grades1 = sc.nextDouble();
		}
		
		System.out.println("Digite a segunda nota :");
		grades2 = sc.nextDouble();
		
		while (grades2 > 10 || grades2 < 0) {
			System.out.println("Nota invelida !");
			System.out.print("Digite novamente: ");
			grades2 = sc.nextDouble();
		}
		
		semesterNote = (grades1 + grades2) / 2;
		
		System.out.printf("Média = %.2f", semesterNote);
		
		sc.close();

	}

}
