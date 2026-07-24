import java.util.Scanner; //comando que importa o scanner

public class notasAcademicas { // classe publica
    public static void main(String[] args){ //main
        Scanner scanner = new Scanner(System.in); //comando que chama o scanner e integra em nosso codigo

        System.out.println("Digite qual foi a sua nota de Português: ");
        double Portugues  = scanner.nextDouble(); // variavel portugues que recebe um valor decimal
        scanner.nextLine(); //prevencao para bug buffer

        System.out.println("Digite sua nota de Matemática: ");
        double Matematica = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite sua nota de Ciências: ");
        double Ciencias = scanner.nextDouble();
        scanner.nextLine();

         double media = (Portugues + Matematica + Ciencias) / 3; //calculo para receber a media
         int notaTruncada = (int) media; //converte uma variavel de decimal para inteiro

         System.out.println("Digite o seu nome: ");
         String nome = scanner.nextLine(); // variavel que recebe caracter

         System.out.println("Digite o seu RA: ");
         String ra = scanner.nextLine();

         boolean aprovado = media >= 6 && Portugues >= 3 && Matematica >= 3 && Ciencias >= 3; //teste booleano para verificar se o aluno foi aprovado
         System.out.println("Você foi aprovado?: " + aprovado);

         System.out.println("------------------- Resumo -------------------\n");
         System.out.println("Aluno: " + nome);
         System.out.println("RA: " + ra);
         System.out.println("Sua nota de portugues foi: " + Portugues);
         System.out.println("Sua nota de matematica foi: " + Matematica);
         System.out.println("Sua nota de ciencias foi: " + Ciencias);
         System.out.println("Sua media: " + media);
         System.out.println("Sua nota geral: " + notaTruncada);
         System.out.println("Situação: " + aprovado + "\n");

         scanner.close(); //dizer ao codigo que o scanner se encerra aqui

    }
    
}