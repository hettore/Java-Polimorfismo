//contrato autenticavel
	//quem assina esse contrato, precisa implementar
		//método setSenha
		//método autentica

public abstract interface Autenticavel {

	public abstract boolean autentica(int senha);
	
	public abstract void setSenha(int senha);

}
