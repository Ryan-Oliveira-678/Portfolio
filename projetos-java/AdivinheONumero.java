import java.util.Scanner;

public class AdivinheONumero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = (int)(Math.random() * 10) + 1;// logica para criar um numero inteiro de 1 a 10 aleatorio

        System.out.println("Digite um numero: ");
            int number = scanner.nextInt();
        
        while (number != numeroSecreto){
            if (number > numeroSecreto){
                System.out.println("Numero alto demais, tente um menor");

            }else{
                System.out.println("Numero baixo demais, tente um maior");

            }
            
            System.out.println("Digite um novo numero");
                number = scanner.nextInt();

            System.out.println(number);

        }
        System.out.println("Parabens você acertou");
        scanner.close();
    }
    
}
