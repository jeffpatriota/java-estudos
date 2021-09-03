package pessoas;

public class veiculoPrincipal {
	public static void main(String[] args) {
		
		veiculo p = new veiculo();
		
		p.setId(4454545464L);
		p.setDescricao("Carro");
		p.setValor(50.900);
		
		System.out.println("O " + p.getDescricao() + " de id: " + p.getId() + 
				" custa R$: " + p.getValor());
	}
	
	

}
