package Arrays;

import java.util.Scanner;

public class DesafioVetorAté20Posicoes {
//receba o tm do array e depois imprima os valores
	public static void main(String[] args) {
		// de 1 a 20 posiçoes
		Scanner leia = new Scanner(System.in);
		int n;

		do {
			// receber valor digitado tm
			System.out.println("Digite o tm do vetor corretamente: ");
			n = leia.nextInt();

		} while (n < 1 || n > 20);

		int c[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println( (i + 1) + "Entre com os valores: " );
			c[i] = leia.nextInt();
		}
		//mostrar de final para inicio
		for (int i =0; i < n; i++) {
            System.out.print(c[i] + " " );
		}
		
	}

}
