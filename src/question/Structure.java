package question;

import java.util.ArrayList;

/**
 * 
 * Projeto - question - Structere.java
 *
 * Classe responsável por 
 *
 * @author Aydalvo Nery Neto <aydalvo.nery@gmail.com>
 * @since 25/11/2014 14:07:35
 * @version 1.0
 *
 */

@SuppressWarnings("rawtypes")
public class Structure {
	
	private ArrayList<Double> fileSizes;
	
	private double tapeCapacity;

	/**
	 * @return the fileSizes
	 */
	public ArrayList getFileSizes() {
		return fileSizes;
	}
	
	/**
	 * @param fileSizes the fileSizes to set
	 */
	public void setFileSizes(ArrayList<Double> fileSizes) {
		this.fileSizes = fileSizes;
	}
	
	/**
	 * @param fileSize the fileSizes to add
	 */
	public void addFileSize(double fileSize) {
		this.fileSizes.add(fileSize);
	}

	/**
	 * @return the tapeCapacity
	 */
	public double getTapeCapacity() {
		return tapeCapacity;
	}

	/**
	 * @param tapeCapacity the tapeCapacity to set
	 */
	public void setTapeCapacity(double tapeCapacity) {
		this.tapeCapacity = tapeCapacity;
	}


}
