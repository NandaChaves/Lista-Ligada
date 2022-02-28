import static java.lang.System.out;
import java.util.Scanner;
import java.io.IOException;
public class Main {
	
	public static void menu()
	{
		 out.println();
	     out.println("Escolha a opção");
	     out.println("0-Sair");
	     out.println("1-Inserir país");
	     out.println("2-Imprimir paises");
	     out.println("3-Inserir cidades");
	     out.println("4-Imprimir cidades por país");
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	 GerePaises novoPais = new GerePaises();
     int opc;
     Scanner l = new Scanner(System.in);
     Scanner ler = new Scanner(System.in);
     
     Paises novop = new Paises(1,"Alemanha");
     novoPais.AddPais(novop);
     novop = new Paises(2,"Japão");
     novoPais.AddPais(novop);
     novop = new Paises(3,"China");
     novoPais.AddPais(novop);
     novop = new Paises(4,"Coreia do sul");
     novoPais.AddPais(novop);
     menu();
     opc = l.nextInt();
     while(opc!=0)
     {
    	 switch(opc)
    	 {
    	 case 1:
    		 out.println("Id do país:");
    		 int id = ler.nextInt();
    		 out.println("Nome do país:");
    		 String nome = ler.next();
    		 Paises pais = new Paises(id,nome);
    		 novoPais.AddPais(pais);
    		 break;
    	 case 2:
    		 novoPais.imprimirPaises();
    		 break;
    	 case 3:
    		 out.println("Id do país?");
    		 id = ler.nextInt();
    		 novoPais.AddCidadePais(id);
    		 break;
    	 case 4:
    		 out.println("Id do país?");
    		 id = ler.nextInt();
    		 novoPais.imprimirCidadePais(id);
    		 break;
    	 }//fim de switch
    	 menu();
         opc = l.nextInt();
     }//fim de while
     
	}//fim do main

}//fim da classe
