package Curso_java;

import java.util.Scanner;


public class Calculadora {
	
	public static void main (String args[]){
		
		int opcao = 9;
		double operacao;
		double num1;
		double num2;
	
		
		Scanner entrada = new Scanner(System.in);  
	    
	    while (opcao != 0) {
	    	if (opcao >= 1 && opcao <= 8) {
	    	switch (opcao) {
	    	
	    	case 1:
	    	  
	    		System.out.print("Qual o primeiro numero?: ");
	    	    
	    		num1 = entrada.nextDouble();
	    		
	    		System.out.print("Qual o segundo numero?: ");
	    		
	    		num2 = entrada.nextDouble();
	    		
	    		operacao = num1 + num2;
	    		System.out.println("Resultado");
	    		System.out.println(operacao);
	    		opcao = 0;
				break;
	    	
	    	case 2: 
	    		
	    	 		
	  	    		System.out.print("Qual o primeiro numero?: ");
	  	    	   
	  	    		num1 = entrada.nextDouble();
	  	    		
	  	    		System.out.print("Qual o segundo numero?: ");
	  	    	  
	  	    		num2 = entrada.nextDouble();
	  	    		
	  	    		operacao = num1 - num2;
	  	    		System.out.println("Resultado");
	  	    		System.out.println(operacao);
	  	    		opcao = 0;
		    		break;
		    		
	    	case 3:
		    	 		   
		  	    		System.out.print("Qual o primeiro numero?: ");
		  	    		
		  	    		num1 = entrada.nextDouble();
		  	    		
		  	    		System.out.print("Qual o segundo numero?: ");
		  	    		
		  	    		num2 = entrada.nextDouble();
		  	    		
		  	    		operacao = num1 * num2;
		  	    		System.out.println("Resultado");
		  	    		System.out.println(operacao);
		  	    		opcao = 0;
			    		break;
		    	 	 
	    	case 4:
			    	 	  
			  	    	System.out.print("Qual o primeiro numero?: ");
			  	    	
			  	    	num1 = entrada.nextDouble();
			  	    	
			  	    	System.out.print("Qual o segundo numero?: ");
			  	    	
			  	    	num2 = entrada.nextDouble();
			  	    	
			  	    	operacao = (num1 / num2);
			  	    	System.out.println("Resultado");
			  	    	System.out.println(operacao);
			  	    	opcao = 0;
			  	    	break;
				     
	    	case 5: 
				  	     System.out.print("Qual o n??mero?: ");
				  	     
				  	     num1 = entrada.nextDouble();
				  	     
				  	     operacao = Math.sqrt(num1);
				  	     System.out.println("Resultado");
				  	     System.out.println(operacao);
				  	     opcao = 0;
				  	     break;
	    	case 6:  
				  	     System.out.print("Qual o numero?: ");
				  	     
				  	     num1 = entrada.nextDouble();
				  	     
				  	     System.out.print("Qual o expoente?: ");
				  	     
				  	     num2 = entrada.nextDouble();
				  	     
				  	     operacao = Math.pow(num1, num2);
				  	     System.out.println("Resultado");
				  	     System.out.println(operacao);
				  	     opcao = 0;
					     break;
	     	case 7:  
	     				System.out.print("Qual o n??mero?: ");
	     				
	     				num1 = entrada.nextDouble();
	     				
	     				if (num1 % 2 == 0) {
							System.out.println(" ?? par.");
						} else {
							System.out.println(" ?? impar.");
						}
	     				opcao = 0;
	     				break;
	       	case 8:  
	       				System.out.print("Qual o n??mero?: ");
	       				
	       				num1 = entrada.nextDouble();
	       				
	       				if (num1 % 3 == 0) {
	       				System.out.println("SIM ?? DIVISIVEL");
	       				} else {
	       				System.out.println("N??O, n??o ?? divisivel");
	       				}
	       				opcao = 0;
	       				break;
	    	}
	    	} else {

				System.out.println("-Escolha uma op????o-");
			    System.out.println("1. Soma");  
			    System.out.println("2. Subtracao");  
			    System.out.println("3. Multiplicacao");  
			    System.out.println("4. Divisao");  
			    System.out.println("5. Raiz Quadrada");
			    System.out.println("6. Exponencia????o");
			    System.out.println("7. Testa Par");
			    System.out.println("8. Testa Divis??vel por 3");  
			    System.out.println("0. Finaliza Calculadora");
			    System.out.print("Opera????o: "); 
				opcao = entrada.nextInt();
			
	    	}
	    	}

		System.out.println("Opera????o Finalizada");
		entrada.close();
	    }
	}
