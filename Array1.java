package Arrays;

//array n pode ser redimensionado
//array só aceita um tipo
public class Array1 {

	public static void main(String[] args) {
		// formas de apresentar array
		int[] notas;
		notas = new int[5];
		
		// outra forma
		int notas2[] = new int[7];
		
		// outra forma com valores
		int[] valores = { 15, 12, 13, 16, 14 };
		
		// mostrar valores de array
		System.out.println(valores[3]);
		
		//atribuir valores a array com valores
		valores[3] = 188;
		System.out.println(valores[3]);
		
		//atribuindo valores a array
		int[] pontos = new int[5];
		
		pontos[0]= 10;
		pontos[1]=01;
		pontos[2]=22;
		pontos[3]=99;
		pontos[4]=65;
		System.out.println(pontos[2]);
		//array com for é a melhor forma de trazer mutios valores como pares ou impares ou  divisiveis
		//para mostrar todos os valores de array pulando uma linha
		for(int i = 0;i<5;i++) {
			System.out.println("\n" + pontos[i]);
		}
		

	}
}
