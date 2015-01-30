package question;

import java.util.ArrayList;

/**
 * 
 * Projeto - question - Processamento.java
 *
 * Classe responsável por 
 *
 * @author Aydalvo Nery Neto <aydalvo.nery@gmail.com>
 * @since 25/11/2014 14:07:35
 * @version 1.0
 *
 */

public class Processamento {

	/**
	 *
	 * Método responsável por 
	 *
	 * @author Aydalvo Nery Neto <aydalvo.nery@gmail.com>
	 * @since 25/11/2014 14:07:35
	 * @version 1.0
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QuestaoA qA = new QuestaoA();
		qA.setPalavra("O zangado cao estava vermelho. E o gato tambem estava zangado.");
		
		firstWord(qA);
		
	}
	
	public static void firstWord(final Stream input) {
			
		String text = "";
		ArrayList<String> objects = new ArrayList<String>();
		char character = ' ';
		
		while ( input.hasNext() || text.length()>0 ) {
			character = input.getNext();
			
			if (input.hasNext() ) {
				if ( character == ' ') {
					text = validaInsercao(text, objects);
				} else {
					if (character != ' ' && character !='.') {
						text = text + String.valueOf(character); 
					}
				}
			}
			else {
				String anotherString = text+character;
				text = validaInsercao(anotherString, objects);
			}
		}
		
		for (String obj : objects) {
			System.out.println( obj );
		}
		
		System.out.println( objects.get(0) );
			
	}

	/**
	 *
	 * Método responsável por 
	 *
	 * @author Aydalvo Nery Neto <aydalvo.nery@gmail.com>
	 * @since 25/11/2014 21:22:01
	 * @version 1.0
	 * @param text
	 * @param objects
	 * @return
	 *
	 */
	private static String validaInsercao(String text, ArrayList<String> objects) {
		boolean toAdd = true;
		if (objects.size() > 0) {
			int i=0;
			boolean hasEqual = false;
			
			for ( String obj : objects ) {
				if ( obj.equalsIgnoreCase(text) ) {
					hasEqual = true;
					toAdd = false;
					i++;
					break;
				} else {
					i++;
				}
			}
			
			if (hasEqual) {
				int posDelete = (i >= 1 ? i-1 : i);
				objects.remove(posDelete);
			} 
		}
		
		if (toAdd && text.trim().length()>0) {
			objects.add(text);
		}
		
		text = "";
		return text;
	}

}
