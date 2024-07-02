package org.ciclabile.java;

public class Main {

	public static void main(String[] args) {
		
		Ciclabile arrayInt = new Ciclabile(new int[]{10, 20, 30 ,40 ,50 ,60, 70});
	
		System.out.println(arrayInt.toString() + "\n");
	
		
		/*
		 * CICLO CHE COME CONDIZIONE UTILIZZA IL METODO PER CONTROLLARE SE CI SONO ELEMENTI ANCORA DA RESTITUIRE;
		 * IL CICLO RESTITUISCE, TRAMITE METODO, L'ELEMENTO SUCCESSIVO RISPETTO ALL'ULTIMO ELEMENTO RESTITUITO E QUINDI ALL'ULTIMA INVOCAZIONE DEL METODO;
		 */
		int index = arrayInt.getArrayLength() - 1;
		
		while(arrayInt.hasAncorElementi(index)) {
			System.out.println("- COUNT ---> " + index);
			System.out.println("- ELEMENT ---> " + arrayInt.getElementoSuccessivo(index));
			System.out.println("- ELEMENT AVAILABLE ---> " + arrayInt.hasAncorElementi(index));
			index --;
		}
		
		System.out.println("- ELEMENT AVAILABLE ---> " + arrayInt.hasAncorElementi(index));
	}
	
}
