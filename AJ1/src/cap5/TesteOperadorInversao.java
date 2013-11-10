/**
 * 
 */
package cap5;

/**
 * @author raphael
 *
 */
public class TesteOperadorInversao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 38;
		System.out.println("38 invertido = " + ~i);
		
		i = -40;
		System.out.println("-40 invertido = " + ~i);
		
		short s = 12;
		
		// quando aplicamos invers�o de bits o resultado � promovido a int
		int shortInvertido = ~s;
		System.out.println("12 invertido = " + shortInvertido);
		
		char c = 'a';
		// quando aplicamos invers�o de bits o resultado � promovido a int, e 
		// neste caso, o caractere 'a' ser� promovida a int (97) antes da invers�o
		
		int charInvertido = ~c;
		System.out.println("'a' invertido = " + charInvertido);
	}

}
