package org.ciclabile.java;


public class Ciclabile {
	
	private int[] arrayInt;
	private int arrayLength;
	
	public Ciclabile(int[] arrayInt) {
		this.arrayInt = arrayInt;
		this.arrayLength = arrayInt.length;
	}


	public int[] getArrayInt() {
		return arrayInt;
	}


	public void setArrayInt(int[] arrayInt) {
		this.arrayInt = arrayInt;
	}

	
	public int getArrayLength() {
		return arrayLength;
	}


	public void setArrayLength(int arrayLength) {
		this.arrayLength = arrayLength;
	}


	
	/*
	 * METODO CHE RESTITUISCE IL PROSSIMO ELEMENTO RISPETTO ALL'ULTIMA VOLTA CHE E' STATO INVOCATO;
	 */
	public int getElementoSuccessivo(int index) {
		int element = arrayInt[index];
		return element;
	}
	
	
	/*
	 * METODO CHE DEVE RESTITUIRE TRUE SE CI SONO ANCORA ELEMENTI DA RESTITUIRE
	 */
	public boolean hasAncorElementi(int index) {
		
		if(index > -1)
			return true;
		
		return false;
	}
	
	
	
	@Override
	public String toString() {
		
		String elementString = "";
		
		for(int element : arrayInt) {
			elementString += String.valueOf(element) + " ";
		}
		
		return "- ARRAY INTERI ---> " + elementString + "\n" + "- LUNGHEZZA ARRAY ---> " + arrayInt.length;
	}
	
}
