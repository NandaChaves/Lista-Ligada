import static java.lang.System.out;

import java.util.Scanner;

public class Paises {
	Scanner l = new Scanner(System.in);
	private int id;
	private String nome;
	private Paises proxP;
	private Cidade primC= null;
	public Paises (int id,String nome)
	{
		this.id= id;
		this.nome = nome;
	}
	/**Um país possui N cidades**/
	public Paises getProxP()
	{
		return proxP;
	}
	
	public void setProxP(Paises proxP)
	{
		this.proxP = proxP;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void AddCidade(Cidade novoC)
	{
		Cidade temp = primC;
		if(primC==null)
		{primC = novoC;}
		else {
		 if(novoC.getNome().equals(temp.getNome()))
		 out.print("Esta cidade já existe\n");
		 else {
			 while(temp.getProxC()!=null)
			  {
				  temp = temp.getProxC(); 
			  }
			  temp.setProxC(novoC);
			}	 
		 }	
	}//fim de AddCidade
	
	public void imprimirCidades()
	{   Cidade tempC = primC;
		while(tempC!=null)
		{
			out.print(tempC.getNome()+"\n");
			tempC = tempC.getProxC();
		}
	}//fim de imprimirCidades
}
