package Curso_java;

import java.util.Scanner; // import the Scanner class 

public class exercicioCondicional {

	public static void main(String[] args) {
		Scanner Numero = new Scanner(System.in);
		 int x;
		    System.out.println("Digite o número:");
		    x = Numero.nextInt(); 
		    if(x % 2 == 0)
			System.out.println("Número " + x + " é par");
			else
				System.out.println("Número " + x + " é ímpar" );
		if(x < 0) {
			System.out.println("Número " + x + " é negativo");
		}else if (x>0){
				System.out.println("Número " + x + " é positivo" );
		}else{
			System.out.println("Número " + x + " é nulo" );
		}
		Numero.close();
		
			}
	}

