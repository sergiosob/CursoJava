package Curso_java;

import java.util.Scanner;

public class Multiplo {

    public static void main(String args[]){
        System.out.print("Entre com o primeiro número: ");
        Scanner Numeros = new Scanner(System.in);
        int A = Numeros.nextInt();
		  System.out.print("Entre com o segundo número: ");
         Scanner segundo = new Scanner(System.in);
		  int B = Numeros.nextInt();
            if (B % A == 0 || A % B == 0){
				System.out.println(A + " e " + B + " são múltiplos.");
				}else {
			 	   System.out.println(A + " e " + B + " não são múltiplos.");
			 }
			Numeros.close();
        
    }
}