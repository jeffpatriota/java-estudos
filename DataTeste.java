package classe;

public class DataTeste {
public static void main(String[] args) {
	
	Data d1 = new Data();
	d1.dia = 4;
	d1.mes = 5;
	d1.ano = 1987;
	
	System.out.printf("Eu nasci no dia %d/%d/%d", d1.dia,d1.mes,d1.ano);
	
}
}
