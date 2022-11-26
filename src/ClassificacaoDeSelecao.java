
public class ClassificacaoDeSelecao {
	private int anterior;
	private int atual;
	private int comparador;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valores[] = { 2, 4, 6, 8, 1, 2, 3, 4, 5, 6, 7, 8 }; //Informa manualmente o arrey para fazer a ordenação 
		int valorMenor; // armazena o menor valor do arrey para fazer a comparação 
		int indexMenor; // armazena a posição do menor valor do array
		String result = ""; // Resultado do após a ordenação 

		for (int i = 0; i < valores.length; i++) { //percorre a variavel {valores} completa
			valorMenor = valores[i];
			indexMenor = i;
			for (int n = i + 1; n < valores.length; n++) {//percorre a variavel {valores} completa, para fazer a comparação entre os valores do array
				if (valores[n] < valorMenor) { // compara se o o proximo valor é menor que o atual
					valorMenor = valores[n];
					indexMenor = n;
				}

			}

			valores[indexMenor] = valores[i];
			valores[i] = valorMenor;
		}
		for (int m : valores) { // acria uma variavel com os valores ordenados 
			result += m + ", ";
		}

		System.out.println(result);

	}

}
