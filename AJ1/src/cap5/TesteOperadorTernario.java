/**
 * 
 */
package cap5;

/**
 * @author raphael
 *
 */
public class TesteOperadorTernario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mensagem = "O n�mero � ";
		int numero = 15;
		int resto = numero % 2;
		mensagem += (resto == 0) ? " Par" : "�mpar";
		System.out.println(mensagem);
	}

}
