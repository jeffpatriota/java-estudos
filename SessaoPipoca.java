package controle;

import java.util.Scanner;

public class SessaoPipoca {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o dia da semana para verificar a programa��o: ");
		String dia = entrada.next();

		if ("Domingo".equalsIgnoreCase(dia)) {
			System.out.println("Hoje � dia de assistir Vikings");
			System.out.println("Uma boa sess�o :) ");
		}
		else if ("Segunda".equalsIgnoreCase(dia)) {
			System.out.println("Hoje � dia de assistir Dark ");
			System.out.println("Uma boa sess�o :) ");
		} 
		else if ("ter�a".equalsIgnoreCase (dia) || "terca".equalsIgnoreCase(dia)) {
			System.out.println("Hoje � dia de assistir Lupin ");
			System.out.println("Uma boa sess�o :) ");
		} 
		else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println("Hoje a escolha � livre ");
			System.out.println(" :) ");
		} 
		else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.println("Hoje � dia de assistir Vikngs  ");
			System.out.println("Uma boa sess�o :) ");
		} 
		else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.println("Hoje � dia de assistir Filme ");
			System.out.println("Uma boa sess�o :) ");
		} 
		else if ("s�bado".equalsIgnoreCase(dia) || "sabado".equalsIgnoreCase(dia)) {
			System.out.println("Hoje � dia de assistir Filme ");
			System.out.println("Uma boa sess�o :) ");
		}

		else
			System.out.println("Dia inv�lido");
		entrada.close();
	}
}
