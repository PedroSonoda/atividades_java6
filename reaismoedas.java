package exercicios0603;
import java.util.Scanner;
public class reaismoedas {

	public static void main(String[] args) {
		//Variáveis
		double real,euro;
		//Instaciar classe Scanner
		Scanner ler = new Scanner (System.in);
		
		//Entrada de dados 
		System.out.println("quantos reias você quer converter para euro:");
		real= ler.nextDouble();
		
		//Processamento
				euro= real* 5.37;
				//Saída
				System.out.println("Sua conversão é de: "+euro);
				ler.close ();
				
		// TODO Auto-generated method stub

	}

}
