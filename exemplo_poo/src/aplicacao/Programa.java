package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
	 Scanner teclado= new Scanner (System.in);
    Produto produto = new Produto();
	 System.out.println("Informe o produto");
	 produto.Produtos = teclado.next();
	 
	 System.out.println("Informe a quantidade");
	 produto.quantidade =teclado.nextDouble();
	 System.out.println("Informe o pre�o");
	 produto.preco = teclado.nextDouble();
	 System.out.println("Confirma��o :" + produto.Produtos +", Estoque:"+produto.quantidade+", Pre�o:" +produto.preco);
	 	teclado.close();
	}

}
