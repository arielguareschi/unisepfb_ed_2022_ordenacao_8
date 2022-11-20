
public class ClassificacaoDeSelecao {
	private int anterior;
	private int atual;
	private int comparador;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valores[] = { 2, 4, 6, 8, 1, 2, 3, 4, 5, 6, 7, 8 };
		int valorMenor;
		int indexMenor;
		String result = "";

		for (int i = 0; i < valores.length; i++) {
			valorMenor = valores[i];
			indexMenor = i;
			for (int n = i + 1; n < valores.length; n++) {
				if (valores[n] < valorMenor) {
					valorMenor = valores[n];
					indexMenor = n;
				}

			}

			valores[indexMenor] = valores[i];
			valores[i] = valorMenor;
		}
		for (int m : valores) {
			result += m + ", ";
		}

		System.out.println(result);

	}

}
