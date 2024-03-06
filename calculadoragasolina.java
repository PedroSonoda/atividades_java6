package exercicios0603;
import java.util.Scanner;
public class calculadoragasolina {

	public static void main(String[] args) {
		//Variáveis
		Double distância,consumo,litros,custototal,combustivel;
		
		//Instanciar classe Scanner
				Scanner ler = new Scanner (System.in);
				
				//Entrada de dados 
				System.out.println("Qual o valor de litros do combustivel:");
				combustivel=ler.nextDouble();
				
				System.out.println("Qual a distância percorrida em Km:");
				distância=ler.nextDouble();
				
				System.out.println("Qual o consumo médio:");
				consumo=ler.nextDouble();
				 
				//Processamento
				litros =distância /consumo;
				custototal= litros*combustivel;
				
				//Saída
				System.out.println("Sua quantidade de litros gastos é de : "+litros);
				
				System.out.println("o seu custo total é de : "+custototal);
				ler.close ();
				
		// TODO Auto-generated method stub

	}

}
