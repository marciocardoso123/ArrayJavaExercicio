package Arrays;

import java.util.Scanner;

public class Desafio2Vetores {

	public static void main(String[] args) {
		// escreva programa para ler 2 vetores e some criando um terceiro vetor
		Scanner leia = new Scanner(System.in);
		int n;

		do {
			System.out.println("Entre com qtd do Elementos:");
			n = leia.nextInt();
			if (n > 15 || n < 1) {
				System.out.println("Valores entre 1 e 15");
			}
		} while (n > 15 || n < 1);

		int a[], b[], soma[]; // ou int[] a,b,soma;

		a = new int[n];
		b = new int[n];
		soma = new int[n];

		// lendo valores de a:
		System.out.println("\n\nDigite valores do vetor A: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print((i + 1) + ") Valores do primeiro vetor: ");
			a[i] = leia.nextInt();
		}
		
		// lendo valores de b:
		System.out.println("\n\nDigite valores do vetor B: ");
		for (int i = 0; i < b.length; i++) {
			System.out.print((i + 1) + ") Valores do segundo vetor: ");
			b[i] = leia.nextInt();
		}
		
		// lendo valores de soma:
		for(int i = 0; i< n;i++) {
			soma[i] = a[i] + b[i];
			System.out.println("A soma é :"+ soma[i]);
		}

	}
}
