package plataforma;

public class Filmes2 {
	public static void main(String[] args) {

		Filmes filmes = new Filmes("Matrix", "A��o", 115);

	System.out.println("Informa��es do seu Filme");
	System.out.println("Nome: "+ filmes.getNome());
	System.out.println("Gen�ro: "+ filmes.getGenero());
	System.out.println("Dura��o: "+ filmes.getDuracao());
	
	}
}

