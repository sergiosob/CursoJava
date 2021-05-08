package Curso_java;
import java.util.Scanner;

public class ImprimeNomeDezVezes {

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			String nome;
			System.out.println("Digite o seu nome completo: ");
			nome = entrada.nextLine();
			System.out.println("Seu nome será impresso dez vezes usando o for");
			for(int i = 1; i <= 10; i++) {
				System.out.println(nome);
			}
			System.out.println("Seu nome será impresso dez vezes usando o while");
			int i = 1;
			while( i <= 10) {
				System.out.println(nome);
				i++ ;
			}
			entrada.close();
							
		}
		
		
	}

