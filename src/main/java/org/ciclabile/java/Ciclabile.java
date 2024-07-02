package org.ciclabile.java;


public class Ciclabile {
	
	private int[] arrayInt;
	
	public Ciclabile(int[] arrayInt) {
		this.arrayInt = arrayInt;
	}
	
	public Ciclabile() {
		this.arrayInt = new int[0];
	}


	public int[] getArrayInt() {
		return arrayInt;
	}


	public void setArrayInt(int[] arrayInt) {
		this.arrayInt = arrayInt;
	}


	
	/*
	 * METODO CHE RESTITUISCE IL PROSSIMO ELEMENTO RISPETTO ALL'ULTIMA VOLTA CHE E' STATO INVOCATO;
	 */
	public int getElementoSuccessivo(int index) {
		int element = this.arrayInt[index];
		return element;
	}
	
	
	/*
	 * METODO CHE DEVE RESTITUIRE TRUE SE CI SONO ANCORA ELEMENTI DA RESTITUIRE;
	 */
	public boolean hasAncorElementi(int index) {
		
		if(index > -1)
			return true;
		
		return false;
	}
	
	
	/*
	 * METODO CHE PERMETTE DI AGGIUNGERE UN NUOVO INTERO;
	 * CREO UN ARRAY NUOVO COPIA DELL'ARRAY VECCHIO, L'ARRAY NUOVO AVRA' LA DIMENSIONE DELL'ARRAY VECCHIO +1;
	 * UNA VOLTA CHE L'ARRAY NUOVO HA LA STESSA STRUTTURA DATI, VIENE AGGIUNTO IL DATO NELL'ULTIMA POSIZIONE;
	 * VIENE SOVRASCRITTO L'ARRAY VECCHIO CON L'ARRAY NUOVO;
	 */ 
	public void addElemento(int element) {
		
		int[] arrayIntNew = new int[this.arrayInt.length + 1];
		
		for(int i = 0; i < this.arrayInt.length; i++) {
			arrayIntNew[i] = arrayInt[i];
		}
		
		arrayIntNew[this.arrayInt.length] = element;
		this.arrayInt = arrayIntNew;
			
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
