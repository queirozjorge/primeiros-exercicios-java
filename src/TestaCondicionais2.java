
public class TestaCondicionais2 {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");

		int idade = 18;
		int quantidadePessoas = 2;
		boolean acompanhado;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		if (idade >= 18 && acompanhado) {

			System.out.println("Seja bem vindo!");
		} else {

			System.out.println("Infelizmente voc� n�o pode entrar!");

		}
	}
}