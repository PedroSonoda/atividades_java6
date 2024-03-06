package exercicios0603;
import java.util.Scanner;
public class calculadoradetemperaturas {

	public static void main(String[] args) {
		//Variáveis
		Double Fahrenheit, celcius;
		//Instanciar classe Scanner
		Scanner ler = new Scanner (System.in);
		
		//Entrada de dados 
		System.out.println("Informe sua temperatura em Fahrenheit");
		Fahrenheit=ler.nextDouble();
		
		//Processamento
		celcius=((Fahrenheit -32)*5)/9;
		
		//Saída
		System.out.println("Seus Celsius são: "+celcius);
		ler.close ();
		
				
		
		// TODO Auto-generated method stub

	}

}
