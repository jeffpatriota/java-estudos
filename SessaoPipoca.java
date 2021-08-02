package controle;

import java.util.Scanner;

public class SessaoPipoca {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o dia da semana para verificar a programação: ");
		String dia = entrada.next();

		if ("Domingo".equalsIgnoreCase(dia)) {
			System.out.println("Hoje é dia de assistir Vikings");
			System.out.println("Uma boa sessão :) ");
		}
		else if ("Segunda".equalsIgnoreCase(dia)) {
			System.out.println("Hoje é dia de assistir Dark ");
			System.out.println("Uma boa sessão :) ");
		} 
		else if ("terça".equalsIgnoreCase (dia) || "terca".equalsIgnoreCase(dia)) {
			System.out.println("Hoje é dia de assistir Lupin ");
			System.out.println("Uma boa sessão :) ");
		} 
		else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println("Hoje a escolha é livre ");
			System.out.println(" :) ");
		} 
		else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.println("Hoje é dia de assistir Vikngs  ");
			System.out.println("Uma boa sessão :) ");
		} 
		else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.println("Hoje é dia de assistir Filme ");
			System.out.println("Uma boa sessão :) ");
		} 
		else if ("sábado".equalsIgnoreCase(dia) || "sabado".equalsIgnoreCase(dia)) {
			System.out.println("Hoje é dia de assistir Filme ");
			System.out.println("Uma boa sessão :) ");
		}

		else
			System.out.println("Dia inválido");
		entrada.close();
	}
}
