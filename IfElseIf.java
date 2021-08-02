package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite sua nota");
		double nota = entrada.nextDouble();

		if (nota > 10 || nota < 0) {
			System.out.println("A nota informada é invalida");
		} else if (nota >= 8) {
			System.out.println("Parabéns sua nota equivale a um A");
		} else if (nota >= 6) {
			System.out.println("Sua nota equivale a um B");
		} else if (nota >= 4) {
			System.out.println("Sua nota equivale a um C");
		} else {
			System.out.println("Sua nota equivale a um E");
		}

		System.out.println("Fim!");
		entrada.close();

	}
}
