/**
 * 
 */
package cap5;

/**
 * @author raphael
 *
 */
public class TesteOperadoresPrePos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// incremento p�s-fixado, primeiro imprime depois incrementa
		int x = 5;
		System.out.println("x = " + x++);
		
		// decremento p�s-fixado, primeiro imprime depois decrementa
		int y = 5;
		System.out.println("y = " + y--);
		
		// incremento pr�-fixado, primeiro incrementa depois imprime
		int w = 5;
		System.out.println("w = " + ++w);
		
		// decremento pr�-fixado, primeiro decrementa depois imprime
		int z = 5;
		System.out.println("z = " + --z);
	}

}
