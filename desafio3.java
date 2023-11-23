package Fundamentos;
import java.util.Scanner;
public class desfafio03 {

	public static void main(String[] args) {
		
		Scanner n1 = new Scanner (System.in);
		System.out.println("Digite o pimreiro valor: ");
		double numero1 = n1.nextDouble();
		
		Scanner n2 = new Scanner(System.in);
		System.out.println("Digite o segundo valor: ");
		double numero2 = n2.nextDouble();
		
		Scanner n3 = new Scanner(System.in);
		System.out.println("Digite o terceiro valor: ");
		double numero3 = n3.nextDouble();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O primeiro valor e maior");
		}
		else if (numero2 > numero3 && numero2 > numero3) {
			System.out.println("O segundo numero e maior");
		}
		else {
			System.out.println("O terceiro numero e maior");
		}
	}

}
