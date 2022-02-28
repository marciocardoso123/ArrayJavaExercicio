package Arrays;

import java.util.Scanner;

public class DesafioLER15VetorImprimirInvertido {
//desafio implementação de codigo de array com resposta na ordem inversa
	public static void main(String[] args) {
		// uso de variavel com valor antes de array
		Scanner leia = new Scanner(System.in);
		int tamanhoArray = 15;
		int[] a = new int[tamanhoArray];
		
		//receber valor
		for(int i = 0;i<tamanhoArray;i++) {
			System.out.println("Digite os valores: ");
			//a na posição i recebe o valor
			a[i] =leia.nextInt();
		}
		
		//mostrar valor
		for(int i =tamanhoArray - 1 ;i>= 0;i--) {
			System.out.print(i + " > " + a[i]);
		}

	}

}
