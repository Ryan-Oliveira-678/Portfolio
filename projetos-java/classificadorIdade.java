import java.util.Scanner;

public class classificadorIdade {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Qual o seu nome?: ");
        String nome1 = scanner.nextLine();//guarda o valor digitado em uma variavel (nome1) com o valor de String

        System.out.println("Qual a sua idade?: ");
        int idade1 = scanner.nextInt();// recebe o valor digitado pelo usuario e guarda dentroi de uma variavel (idade1) que recebe valor inteiro
        scanner.nextLine();// prevenção para bug buffer

        if(idade1 >= 60){ //for para classificar faixa etaria 
            System.out.println(nome1 +" é "+"Idoso");// primeiro if se o valor de (idade1) for maior ou igual a 60 então retorna idoso
        } else if(idade1 >= 18){
            System.out.println(nome1 +" é "+"Adulto");//primeiro else if se o valor de (idade1) for maior ou igual a 18 então retorna adulto
        } else if(idade1 >=12){
            System.out.println(nome1 +" é "+"Adolescente");//Segundo else if se o valor de (idade1) for maior ou igual a 12 então retorna adolescente
        } else{
            System.out.println(nome1 +" é "+"Criança");//primeiro e ultimo else se o valor de (idade1) for maior ou igual a 60 então retorna criança
        }

        scanner.close();
    }

}