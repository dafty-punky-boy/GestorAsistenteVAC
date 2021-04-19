package gestorAsistenteVAC.Test;

import gestorAsistenteVAC.util.LinkedList;
import gestorAsistenteVAC.util.Node;

/**
 * Clase que contiene los metodos estaticos para realizar pruebas sobre la clase LinkedList.
 * @author Dafty-Punky-Boy
 *
 * @version 1.0, 19/04/2021
 */
public class LinkedListTest {
	
	/**
	 * Prueba el metodo nodeDrop.
	 */
	public static void nodeDropTest() {
		LinkedList<Integer> testList1 = new LinkedList<Integer>();
		testList1.addFront(1);
		testList1.addFront(8);
		for(int i = 1; i < 4;  ++i) {
			testList1.addFront(i);
		}
		
		System.out.println("INICIO LinkedList.nodeDrop() Test\n");
		
		System.out.print("Lista inicial: ");
		printList(testList1);
		System.out.println("Tama�o: " + testList1.getLength() + "\n");
		
		testList1.nodeDrop(1);
		
		System.out.print("Lista final: ");
		printList(testList1);
		System.out.println("Tama�o: " + testList1.getLength() + "\n");
		
		System.out.println("FIN LinkedList.nodeDrop() Test\n");
	}
	
	/**
	 * Imprime la lista enlazada. Configurada inicialmente para datos enteros.
	 * @param testList Lista enlazada que se quiere imprimir
	 */
	public static void printList(LinkedList<Integer> testList) {
		Node<Integer> nodeTemp = testList.getHead();
		
		if(nodeTemp == null) {
			System.out.println("Lista vacia\n");
		}
		
		else {
			while(nodeTemp != null) {
				System.out.print(nodeTemp.getData() + " ");
				
				nodeTemp = nodeTemp.getNext();
			}
			
			System.out.println("\n");
		}
	}
}