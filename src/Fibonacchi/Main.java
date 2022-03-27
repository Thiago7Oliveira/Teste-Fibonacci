package Fibonacchi;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		int n1 = 0;
		int n2 = 1;
		int soma = 0;
		int contF;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite até aonde somar fibonacci: ");
			contF = ler.nextInt();
		
		for (int cont = 0;cont <= contF; cont++) { 
		
			n1 = n2;
			n2 = soma;
			soma = n1 + n2;
			System.out.print(soma + " ");
		}
				
		
		
	}
	
	
}
	

		

