package Curso_java;

import java.util.Scanner;
import java.util.Locale;

public class CalculadoraOO {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);

		int opcao = 9;
	

		Scanner scan = new Scanner(System.in);

		NumeroOO n1 = new NumeroOO();
		NumeroOO n2 = new NumeroOO();
		NumeroOO res = new NumeroOO();

		while (opcao != 0) {
			if (opcao >= 1 && opcao <= 8) {
				System.out.printf("%nDigite o valor 1:");
				n1.setValor(scan.nextDouble());
				
				if (opcao >= 1 && opcao <= 5) {
					System.out.printf("%nDigite o valor 2:");
					n2.setValor(scan.nextDouble());

				}
				switch (opcao) {

				case 1:
					res.setValor(n1.getValor() + n2.getValor());
					System.out.println("A soma de " + n1.getValor() + " com " + n2.getValor() + " é igual a " + res.getValor());
					opcao = 9;
					break;

				case 2:

					res.setValor(n1.getValor() - n2.getValor());
					System.out.println("A subtração de " + n1.getValor() + " com " + n2.getValor() + " é igual a " + res.getValor());
					opcao = 9;
					break;

				case 3:

					res.setValor(n1.getValor() * n2.getValor());
					System.out.println("A multiplicação de " + n1.getValor() + " com " + n2.getValor() + " é igual a " + res.getValor());
					opcao = 9;
					break;

				case 4:
					
					res.setValor(n1.getValor() / n2.getValor());
					System.out.println("A divisão de " + n1.getValor() + " com " + n2.getValor() + " é igual a " + res.getValor());
					opcao = 9;
					break;

				case 5:
					res.setValor(Math.pow(n1.getValor(), n2.getValor()));
					System.out.println("A potência de " + n1.getValor() + " com " + n2.getValor() + " é igual a " + res.getValor());
					opcao = 9;
					break;
				case 6:
					res.setValor(Math.sqrt(n1.getValor()));
					System.out.println("A raiz quadrada de " + n1.getValor() + " é igual a " + res.getValor());
					opcao = 9;
					break;

				case 7:
					if ((int) (n1.getValor() % 2) == 0) {
						System.out.println(n1.getValor() +" É par.");
					} else {
						System.out.println(n1.getValor() +" É impar.");
					}
					opcao = 9;
					break;
				case 8:
				
					if ((int)(n1.getValor() % 3) == 0) {
						System.out.println("SIM é DIVISIVEL");
					} else {
						System.out.println("NÃO, não é divisivel");
					}
					opcao = 9;
					break;
				}
			} else {
				System.out.println("==============================");
				System.out.println("-Escolha uma opção-");
				System.out.println("==============================");
				System.out.println("1. Soma");
				System.out.println("2. Subtracao");
				System.out.println("3. Multiplicacao");
				System.out.println("4. Divisao");
				System.out.println("5. Exponenciação");
				System.out.println("6. Raiz Quadrada");
				System.out.println("7. Testa Par");
				System.out.println("8. Testa Divisível por 3");
				System.out.println("0. Finaliza Calculadora");
				System.out.println("==============================");
				System.out.print("Operação: ");
				opcao = scan.nextInt();

			}
		}

		System.out.println("Operação Finalizada");

		scan.close();

	}

}
