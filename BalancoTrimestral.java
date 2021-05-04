package Curso_java;
public class BalancoTrimestral{

    public static void main(String args[]){
		// miolo do programa
	   int gastosjaneiro = 15000;
       int gastosfevereiro = 23000;
	   int gastosmarco = 17000;
	   int gastostrimestre = 0;
	   int valormediamensal = 0;
	   gastostrimestre = gastosjaneiro + gastosfevereiro + gastosmarco ;
	   System.out.println(gastostrimestre);
	   valormediamensal = (gastosjaneiro + gastosfevereiro + gastosmarco) / 3;
	   System.out.println("Valor da média mensal é:" + valormediamensal);
    }
}



