package question;

/**
 * 
 * Projeto - question - QuestaoA.java
 *
 * Classe responsável por 
 *
 * @author Aydalvo Nery Neto <aydalvo.nery@gmail.com>
 * @since 25/11/2014 14:38:49
 * @version 1.0
 *
 */
public class QuestaoA implements Stream {
	
	private String palavra;

	@Override
	public char getNext() {
		// TODO Auto-generated method stub
		char letra = palavra.charAt(0);
		if (palavra.length()>1) {
			palavra = palavra.substring(1);
		} else {
			palavra = "";
		}
		return letra;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return palavra.length()>1;
	}

	/**
	 * @return the palavra
	 */
	public String getPalavra() {
		return palavra;
	}

	/**
	 * @param palavra the palavra to set
	 */
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

}
