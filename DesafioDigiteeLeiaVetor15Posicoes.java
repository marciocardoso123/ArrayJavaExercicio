package Arrays;

import java.util.Scanner;

public class DesafioDigiteeLeiaVetor15Posicoes {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[] a = new int[15];
		//receber valor
		for(int i = 0;i<15;i++) {
			System.out.println("Digite os valores: ");
			//a na posição i recebe o valor
			a[i] =leia.nextInt();
		}
		//mostrar valor
		for(int i =0; i<= 14;i++) {
			System.out.println(i + " > " + a[i]);
		}

	}

}
