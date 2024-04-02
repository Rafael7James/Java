import java.util.Scanner;
public class media
{
	public static void main(String[]args) {
	Scanner teclado = new Scanner(System.in);
	    int num = 4;
	    double somanotas = 0;
	for (int i = 1; i<=4; i++){
	    System.out.println("Digite a nota:" +i);
	    double nota = teclado.nextDouble();
	    somanotas+=nota;
	}
	Double media = somanotas/num;
	System.out.println("A média do aluno é:" +media);
	    
	}
}
