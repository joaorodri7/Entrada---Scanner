package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();
        
        System.out.println("Nome: "+nome
                            +"\nIdade: "+idade
                            +"\nAltura: "+altura);
   
    }
    
}
