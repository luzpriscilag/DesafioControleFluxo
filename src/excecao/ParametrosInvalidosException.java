package excecao;

public class ParametrosInvalidosException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 609959259330016918L;

	public ParametrosInvalidosException() {
		super();
		System.out.println("O segundo par�metro deve ser maior que o primeiro.");
	}

}
