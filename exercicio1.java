package ExercicioJessica;

import java.util.Scanner;

public class exercicio1 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero: ");
		double num1 = entrada.nextDouble();
		 
		
		
		System.out.print("Informe o segundo numero: ");
		double num2 = entrada.nextDouble();
		
		if(num1 > num2)
			System.out.println("O primeiro n�mero � maior que o segundo n�mero!");
		else 
			System.out.println("O segundo n�mero informado � maior que o primeiro n�mero!");

	entrada.close();

}

}
