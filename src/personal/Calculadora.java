package personal;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		System.out.println("hello word, my friend luiz");
		
//		int a = 1;
//		int b = 2;
//		int c = a + b;
//		System.out.println(c);
		
		Scanner scanner =  new Scanner(System.in);
		System.out.print("Digite o primeiro número:");
		int numero1 = scanner.nextInt();
		System.out.print("Digite o segundo número:");
		int numero2 = scanner.nextInt();
		
		int soma = numero1 + numero2;
		int multiplicacao = numero1 * numero2;
		float divisao = numero1 / numero2;
		int subtracao = numero1 - numero2;
		System.out.println("\n  \n");
		System.out.printf("A soma da operação é: %d%n",soma);
		System.out.printf("A multiplicação da operação é: %d%n",multiplicacao);
		System.out.printf("A divisão da operação é: %f%n",divisao);
		System.out.printf("A subtração da operação é: %d%n",subtracao);
		
		
		
	}
}
