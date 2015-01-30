package question;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * 
 * Projeto - question - QuestaoB.java
 *
 * Classe responsável por 
 *
 * @author Aydalvo Nery Neto <aydalvo.nery@gmail.com>
 * @since 25/11/2014 14:07:35
 * @version 1.0
 *
 */
public class QuestaoB {

	/**
	 *
	 * Método responsável por 
	 *
	 * @author Aydalvo Nery Neto <aydalvo.nery@gmail.com>
	 * @since 30/01/2015 12:56:05
	 * @version 1.0
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Structure struct = new Structure();
		struct.setFileSizes( new ArrayList<Double>() );
		struct.setTapeCapacity( 10.5 );
		
		testeComValoresAleatorios(struct);
		execucao(struct);

		struct.setFileSizes( new ArrayList<Double>() );
		struct.setTapeCapacity( 10 );
		testeComValoresFixos(struct);
		execucao(struct);
		
	}
	
	/**
	 *
	 * Método responsável por 
	 *
	 * @author Aydalvo Nery Neto <aydalvo.nery@gmail.com>
	 * @since 26/01/2015 14:21:09
	 * @version 1.0
	 * @param struct
	 *
	 */
	@SuppressWarnings("rawtypes")
	private static void execucao(Structure struct) {
		
		for (Iterator iterator = struct.getFileSizes().iterator(); iterator.hasNext();) {
			Double type = (Double) iterator.next();
			System.out.println( type );
		}
		
		System.out.println("A quantidade mínima é: "
				+ minimumAmountOfTapesRequiredToStoreTheFiles(struct));
	}
	
	/**
	 *
	 * Método responsável por 
	 *
	 * @author Aydalvo Nery Neto <aydalvo.nery@gmail.com>
	 * @since 26/01/2015 14:20:17
	 * @version 1.0
	 * @param struct
	 *
	 */
	private static void testeComValoresFixos(Structure struct) {
		struct.addFileSize( 6 );
		struct.addFileSize( 2 );
		struct.addFileSize( 1 );
		struct.addFileSize( 1 );
	}
	
	/**
	 *
	 * Método responsável por 
	 *
	 * @author Aydalvo Nery Neto <aydalvo.nery@gmail.com>
	 * @since 26/01/2015 14:19:57
	 * @version 1.0
	 * @param struct
	 *
	 */
	private static void testeComValoresAleatorios(Structure struct) {
		int valorRandom = getValorRandom(9);
		struct.addFileSize( valorRandom == 0 ? 1 : valorRandom );
		struct.addFileSize( valorRandom == 0 ? 1 : valorRandom );
		struct.addFileSize( valorRandom == 0 ? 1 : valorRandom );
		struct.addFileSize( valorRandom == 0 ? 1 : valorRandom );
		struct.addFileSize( valorRandom == 0 ? 1 : valorRandom );
		
		valorRandom = getValorRandom(2);
		struct.addFileSize( valorRandom == 0 ? 1 : valorRandom );
	}

	/**
	 *
	 * Método responsável por 
	 *
	 * @author Aydalvo Nery Neto <aydalvo.nery@gmail.com>
	 * @since 26/01/2015 13:32:54
	 * @version 1.0
	 *
	 */
	private static int getValorRandom(int limite) {
		Random gerador = new Random();
		if (limite==0) {
			return gerador.nextInt();
		} else {
			return gerador.nextInt(limite);
		}
	}
	
	/**
	 * 
	 *
	 * Método responsável por calcular a quantidade mínima de fitas para armazenar os arquivos. 
	 *
	 * @author Aydalvo Nery Neto <aydalvo.nery@gmail.com>
	 * @since 26/01/2015 13:10:52
	 * @version 1.0
	 * @param structere
	 * @return int representation of minimum amount of tapes required to store the files.
	 *
	 */
	private static long minimumAmountOfTapesRequiredToStoreTheFiles(Structure structere) {
		
		long retorno = 0;
		if (structere.getFileSizes().size()==0) {
			retorno = 0;
		} else if (structere.getFileSizes().size()==1) {
			retorno = 1;
		} else { //TODO: Restrição máxima de dois arquivos por fita.
			
			int somatorio = getSomatorioTamanhoArquivos(structere);
			
			
			retorno = Math.round( somatorio / structere.getTapeCapacity() ) + 1;
			if ( somatorio < structere.getTapeCapacity() && structere.getFileSizes().size() % 2 != 0 ) {
				retorno++;
			}
		}
		
		return retorno;
	}

	/**
	 *
	 * Método responsável por 
	 *
	 * @author Aydalvo Nery Neto <aydalvo.nery@gmail.com>
	 * @since 26/01/2015 13:52:07
	 * @version 1.0
	 * @param structere
	 *
	 */
	@SuppressWarnings("rawtypes")
	private static int getSomatorioTamanhoArquivos(Structure structere) {
		int count = 0;
		for (Iterator iterator = structere.getFileSizes().iterator(); iterator.hasNext();) {
			Double type = (Double) iterator.next();
			count += type;
		}
		System.out.println( "O somatório do tamanho dos arquivos é igual a: " + count );
		return count;
	}

}
