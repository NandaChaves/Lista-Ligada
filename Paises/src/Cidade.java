
public class Cidade {
	
	private String nome;
	private Cidade proxC;
	
	public Cidade(String nome) 
	{
	  this.nome = nome;	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cidade getProxC() {
		return proxC;
	}

	public void setProxC(Cidade proxC) {
		this.proxC = proxC;
	}
	
	
}
