package main;

import java.util.Scanner;

public class ExercicioWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escreva um programa que repita a leitura de uma senha até que ela seja
		 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
		 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 * correta é o valor 2002.
		 */
		
		int validPassword = 2002,
		passwordEntered;

		Scanner sc = new Scanner (System.in);
		
		System.out.println("*****************************************");
		System.out.println("----- Sistema de Segurança  -----");
		System.out.println("*****************************************");
		
		System.out.print("Digite a senha: ");
		passwordEntered = sc.nextInt();
		
		while(passwordEntered != validPassword) {
			System.out.println("Senha incorreta !");
			System.out.print("Tente novamente: ");
			passwordEntered = sc.nextInt();
		}
		
		if(passwordEntered == validPassword) {
			System.out.println("Acesso permitido !");
		}
		
		sc.close();
	}

}
