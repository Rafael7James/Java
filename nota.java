import.java.util.Scanner;
public class nota {
    public static void main[String[]args]{
        Scanner scanner = new Scanner(System.in);

        int numNotas = 3;
        double totalNotas = 0;
        int contador = 0;
    
    while (contador<numNotas) {
        contador++;
        System.out.println("Digite a nota"+contador+".");
        double nota = scannernextDouble();
        totalNotas += nota;
    }
    
    double media =totalNotas / numNotas;
    System.out.println("A média das notas é:" +media);
    scan6[ner.close[];
    
    }
}
