package plataforma;

public class Filmes2 {
	public static void main(String[] args) {

		Filmes filmes = new Filmes("Matrix", "Ação", 115);

	System.out.println("Informações do seu Filme");
	System.out.println("Nome: "+ filmes.getNome());
	System.out.println("Genêro: "+ filmes.getGenero());
	System.out.println("Duração: "+ filmes.getDuracao());
	
	}
}

