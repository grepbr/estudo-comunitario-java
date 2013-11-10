/**
 * 
 */
package cap5;

/**
 * @author raphael
 *
 */
public class TesteCastTiposPrimitivos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// cast de int para double (int � menor do que double -> cast autom�tico)
		// por default 125 � int
		double d = 125;
		System.out.println("int 125 convertido automaticamente para double " + d);
		
		// cast de int para char (int � maior que char -> cast explicito)
		// mas neste caso � um literal, ent�o o cast � autom�tico, pois o
		// compilador verifica a compatibilidade
		char c = 2154;
		System.out.println("literal 2154(int) convertido automat. para char = " + c);
		
		// cast de char para short (cast autom�tico)
		short s = 'a';
		System.out.println("char 'a' convertido autom�ticamente para short " + s);
		
		// cast de char para byte (byte � menor que char -> cast explicito)
		// mas novamente estamos utilizando um literal ('a') ent�o a convers�o
		// � autom�tica
		byte b = 'a';
		System.out.println("char 'a' (literal) convertido automatic. para byte " + b);
		
		// cast de float para int (float � maior que int -> cast explicito)
		int i = (int) 5658.0f;
		System.out.println("float 5658.0f convertido explicitamente para int " + i);
	}

}
