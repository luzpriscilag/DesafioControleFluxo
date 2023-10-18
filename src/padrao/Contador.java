package padrao;
import java.util.Scanner;

import excecao.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro par�metro: ");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo par�metro: ");
		int parametroDois = terminal.nextInt();
		terminal.close();
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException();
		} else {
			int contagem = parametroDois - parametroUm;
			for (int i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo o n�mero " + i);
			}
		}
	}
	
}