
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente primeiro = new Gerente();
		primeiro.setNome("Hettore Eduardo");
		primeiro.setCpf("45678912345");
		primeiro.setSalario(2600.00);
		
		System.out.println(primeiro.getNome());
		System.out.println(primeiro.getBonificacao());
		
		

	}

}
