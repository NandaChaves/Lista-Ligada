import static java.lang.System.out;

import java.util.Scanner;
public class GerePaises {
	Scanner s = new Scanner(System.in);
	private Paises primP;

	public GerePaises() {
		primP= null;
	} 
	public void AddPais(Paises novoP)
	{ if(primP==null)
	  {primP = novoP;} 
	  else {
		  Paises temp = primP;
		  while(temp.getProxP()!=null)
		  { temp = temp.getProxP();}
		  temp.setProxP(novoP);
	  }
	}//fim de AddPais
	
	public void imprimirPaises()
	{ 
		Paises temp = primP;
		while(temp!=null)
		{
			out.println("Id:"+ temp.getId() +" Pais:"+ temp.getNome());
			temp = temp.getProxP();
		}
	}//fim de imprimirPaises
	
	public Paises pesquisaPais(int busca)
	{
		Paises temp = primP;
		while((temp!=null)&&(temp.getId()!=busca))
		{
			temp = temp.getProxP();
		}
		if(temp==null)
			return null;
		else return temp;
	}
	
	public void AddCidadePais(int pais)
	{
		Paises resu = pesquisaPais(pais);
		if(resu==null)
		 out.println("Este pais não existe");
		else {
			out.println("Nome da cidade?");
			String name = s.next();
			Cidade novaC = new Cidade(name);
			resu.AddCidade(novaC);
		}
	}
	
	public void imprimirCidadePais(int country)
	{
		Paises resu = pesquisaPais(country);
		if(resu==null)
			 out.println("Este pais não existe");
		else {
			out.println("******Cidades do(a)" + resu.getNome()+"******");
			resu.imprimirCidades();
		}
	}
}
