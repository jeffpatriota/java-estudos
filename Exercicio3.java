package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		// * 3. Criar um programa que receba duas notas parciais, calcular a me�?dia
		// * final. Se a nota do aluno for maior ou igual a 7.0 imprime no console
		// * "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no
		// console
		// * "Recuperação", caso contra�?rio imprime no console "Reprovado".

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nota Parcial 1: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Nota Parcial 2: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if (media >=7) {
			System.out.println("Sua media foi: " + media + " e você está aprovado");
			
		}
		else if(media <7 && media >= 4) {
			System.out.println("Sua media foi: " + media + " e você está de recuperação");
		}
		else {
			System.out.println("Sua media foi: " + media + " e você está reprovado");
		}

		
		entrada.close();
	}

}
