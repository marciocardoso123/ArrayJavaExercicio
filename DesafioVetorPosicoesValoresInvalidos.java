package Arrays;

import java.util.Scanner;

public class DesafioVetorPosicoesValoresInvalidos {

	public static void main(String[] args) {
		//receba o tm do array com tamanho entre 1 e 20 e depois imprima os valores
		
			Scanner leia = new Scanner(System.in);
			int n;

			do {
				// receber valor digitado tm
				System.out.println("Digite o tm do vetor : ");
				n = leia.nextInt();

				if(n<1 || n>20) {
					System.out.println("Entre com valore entre 1 e 20!");
				}
				
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
