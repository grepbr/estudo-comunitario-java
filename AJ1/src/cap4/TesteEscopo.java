/**
 * 
 */
package cap4;

/**
 * @author raphael
 *
 */
public class TesteEscopo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{
			// as vari�veis que forem declaradas dentro deste bloco
			// n�o ser�o acess�veis fora
			int quantidade = 23;
		}
		System.out.println("quantidade: " + quantidade);

	}

}
