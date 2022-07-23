import java.util.Scanner;

	// importanto a classe "ValidacaoCPF" do pacote "meuPacote"
import meuPacote.ValidacaoCPF;

public class BaseSIABA {

	public class Exemplo {

		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);

			String CPF;

			System.out.printf("Informe um CPF: ");
			CPF = ler.next();

			System.out.printf("\nResultado: ");
			// usando os metodos isCPF() e imprimeCPF() da classe "ValidacaoCPF"
			if (ValidaCPF.isCPF(CPF) == true)
				System.out.printf("%s\n", ValidacaoCPF.imprimeCPF(CPF));
			else System.out.printf("Erro, CPF invalido !!!\n");
			}
		}
	}
}
