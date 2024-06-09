package main;

import java.util.Scanner;

public class ExercicioWhile4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
		 * será encerrado quando o código informado for o número 4.
		 * 
		 * Entrada A entrada contém apenas valores inteiros e positivos.
		 * 
		 * Saída Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de
		 * clientes que abasteceram cada tipo de combustível.
		 */
		
		Scanner sc = new Scanner (System.in);
		
		int fuelType,
		total,
		gasoline = 0,
		alcohol = 0,
		diesel = 0; 
		
		 
		
		System.out.println("*****************************************************");
		System.out.println("-------- Posto dos Devs --------");
		System.out.println("Digite o tipo de combustível que deseja abastecer.");
		System.out.println(" 1 - Álcool");
		System.out.println(" 2 - Gasolina");
		System.out.println(" 3 - Diesel");
		System.out.println(" 4 - Fim");
		System.out.println("*****************************************************");
		
		System.out.print("Digite o número do combustível: ");
		fuelType = sc.nextInt();
		
		while (fuelType != 4) {
			
			if(fuelType == 1) {
				
				System.out.println("Abastecendo com álcool ... \n");
				alcohol += 1;
				System.out.print("Digite o número do combustível: ");
				
			} else if (fuelType == 2) { 
				
				System.out.println("Abastecendo com gasolina ... \n");
				gasoline += 1;
				System.out.print("Digite o número do combustível: ");
				
			} else if (fuelType == 3) {
				
				System.out.println("Abastecendo com diesel ... \n");
				diesel += 1;
				System.out.print("Digite o número do combustível: ");
			}
			
			fuelType = sc.nextInt();
		}
		
		System.out.println("\n MUITO OBRIGADO !!");
		System.out.println("Ácool: " + alcohol);
		System.out.println("Gasolina: " + gasoline);
		System.out.println("Diesel: " + diesel);
		total = alcohol + gasoline + diesel;
		System.out.println("Total: " + total);
	 
	}

}
