
public class EditorDeVideo extends Funcionario{


	public double getBonificacao() {
		System.out.println("bonificação editor de video");
		return super.getBonificacao() + 100;
	}
	
}
