package Curso_java;

import java.util.Scanner;


public class Calculadora {
	
		public int som(int num1, int num2) {
	  
		return num1 + num2;
		
	}
	public int sub(int num1, int num2){
	   
		return num1 - num2;
		
	}
	public int div(int num1,int num2){
	    
		return num1 / num2;
		
	}
	public int mult(int num1, int num2){
	     
		return num1 * num2;
		
	}
	
	
	
	public static void main (String args[]){
		
		
		Calculadora c = new Calculadora();
		
		
		int opcao = 5;
		int num1;
		int num2;
		
	      Scanner input = new Scanner(System.in);  
	      
	      
		System.out.println("-Escolha uma opção-");
	    System.out.println("1. Soma");  
	    System.out.println("2. Subtracao");  
	    System.out.println("3. Multiplicacao");  
	    System.out.println("4. Divisao");  
	    System.out.println("0. Sair");  
	    System.out.print("Operação: ");  
	    
	    opcao = input.nextInt();
	    
	    while (opcao != 0) {
	    	
	    
	    	if (opcao == 1) {
	    		
	    		
	    	    Scanner input1 = new Scanner(System.in);  
	  	      
	    		System.out.print("Qual o primeiro numero: ");
	    		 num1 = input1.nextInt();
	    		System.out.print("Qual o segundo numero: ");
	    		 num2 = input1.nextInt();
	    		int operacao = c.som(num1, num2);
	    		System.out.println("Resultado");
	    		System.out.println(operacao);
	    		break;
	    	}
	    	 	if (opcao == 2) {
		    		
	    	 		  Scanner input1 = new Scanner(System.in);  
	    	  	      
	  	    		System.out.print("Qual o primeiro numero: ");
	  	    		 num1 = input1.nextInt();
	  	    		System.out.print("Qual o segundo numero: ");
	  	    		 num2 = input1.nextInt();
	  	    		int operacao = c.sub(num1, num2);
	  	    		System.out.println("Resultado");
	  	    		System.out.println(operacao);
		    		
		    		break;
		    		}
		    	 	if (opcao == 3) {
		    	 		  Scanner input1 = new Scanner(System.in);  
		    	  	      
		  	    		System.out.print("Qual o primeiro numero: ");
		  	    		 num1 = input1.nextInt();
		  	    		System.out.print("Qual o segundo numero: ");
		  	    		num2 = input1.nextInt();
		  	    		int operacao = c.mult(num1, num2);
		  	    		System.out.println("Resultado");
		  	    		System.out.println(operacao);
			    		break;
		    	 	}
			    	 	if (opcao == 4) {
			    	 		  Scanner input1 = new Scanner(System.in);  
			    	  	      
			  	    		System.out.print("Qual o primeiro numero: ");
			  	    		 num1 = input1.nextInt();
			  	    		System.out.print("Qual o segundo numero: ");
			  	    		 num2 = input1.nextInt();
			  	    		int operacao = c.div(num1, num2);
			  	    		System.out.println("Resultado");
			  	    		System.out.println(operacao);
				    		break;
				    		}
			    	 	else{
					    	System.out.print("????");
					    	break;
					    		}
				    
	    }
	}
}