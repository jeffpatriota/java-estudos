package controle;

public class DesafioIf {
	public static void main(String[] args) {
// Escreva	 um	 programa	 para	 ler	 2	 valores	 (considere	 que	 	 não	 serão	
		//informados	valores	iguais)	e	escrever	o	maior	deles.
		double nota = 10;

		if (nota < 0 || nota > 10)
			System.out.println("Nota invalida");

		if (nota >= 9.0 && nota <= 10) {
			System.out.println("Quadro de Honra!");
			System.out.println("Você é fera!!!");

		}

		if (nota < 9.0 && nota >= 7.0)
			System.out.println("Aprovado");

		if(nota <7.0 && nota >=5.0)
			System.out.println("recuperação");
		
		else if(nota < 5.0 && nota >=0)
			System.out.println("reprovado");

		
	}

}
