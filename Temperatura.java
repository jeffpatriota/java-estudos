package Fundamentos;

import java.util.Scanner;

import com.sun.tools.javac.launcher.Main;

public class Temperatura {

	public static void main(String[] args) {
		// (F - 32) x 5/9 = c

		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;

		double fehrenheit = 86;
		double celcius = (fehrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celcius + "C");

		fehrenheit = 150;
		celcius = (fehrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celcius + "C");

		var b = 4.5;
		System.out.println(b); // Alterado palo GuitHub

		// Outro método

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = entrada.nextDouble();

		double conversao = (celsius - 32) / 1.8;

		System.out.println("Valor em Farenheit: " + conversao);

		entrada.close();

	}
}
