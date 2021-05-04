package Curso_java;

import java.util.Scanner;  


class TestaScanner {
	public static void main(String[] args) { 

	  
    Scanner Registro = new Scanner(System.in);
    
    String nome;
    System.out.print("Digite seu nome:");
    nome = Registro.nextLine(); 
   
    String cpf;
    System.out.print("Digite seu CPF:");
    cpf = Registro.nextLine();
    
    int idade;
    System.out.print("Digite a sua idade:");
    idade = Registro.nextInt();
    
    double altura;
    System.out.print("Digite a sua altura:");
    altura = Registro.nextDouble();
    System.out.println();
    System.out.println("Seu nome é " + nome + ",CPF: " + cpf + ",idade " + idade + " anos e tem altura de " + altura + " m.");
    Registro.close();
  }
}
