package Exercicios;

import java.util.Scanner;

public class Exercicio9 {
	//Crie um programa que recebe 10 valores e ao 
	//final imprima o maior n�mero.
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int maiorValor = 0;
		int contador = 0;
		
		do {
			System.out.println("Digite um n�mero: ");
			int valor = entrada.nextInt();
			
			if(valor > maiorValor) {
				maiorValor = valor;
			}
			
			contador++;
			
		}while(contador != 5);
		System.out.printf("O maior valor foi: ", maiorValor);

		entrada.close();
		 
	}

}
