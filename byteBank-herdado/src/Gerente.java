//Gerente é um Funcionario, gerente herda da class Funcionario, assina o contrato autenticavel, eh um autenticavel

public class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;
	
	public double getBonificacao() {
		System.out.println("chamando o metodo de bonificacao do gerente");
		return super.getSalario();
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	
}
