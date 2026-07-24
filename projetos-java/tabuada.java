import java.util.Scanner;

public class tabuada {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero que eu lhe retorno a tabuada do mesmo");
        int numero = scanner.nextInt();

        for(int i = 1; i < 11; i++){
            int multiplicacao = numero * i;
            System.out.println("O resultado de "+ numero + " X " + i + " = " + multiplicacao);
        }
        scanner.close();
    }
}