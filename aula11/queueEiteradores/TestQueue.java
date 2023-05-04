package aula11.queueEiteradores;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	
	public static void main(String[] args) {
	
		Queue<Integer> fila = new LinkedList<>();

//		try {			
//			// FIFO
//			fila.add(5);
//			fila.add(10);
//			fila.add(8);
//			fila.add(7);		
//			while (!fila.isEmpty()) {
//				System.out.println(fila.remove());
//			}
//			//fila.remove();
//			System.out.println(fila.element());
//		} catch (Exception e) {
//			System.out.println("Problema encontrado na fila!");
////			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}

		// Como tratar um erro com o pool e sem excessoes
		fila.offer(5);
		fila.offer(10);
		fila.offer(8);
		fila.offer(7);		
		while (!fila.isEmpty()) {
			System.out.println(fila.poll());
		}
		
		//Integer x = fila.poll();
		Integer x = fila.peek();
		if (x != null) {
			System.out.println(x);
		} else {
//			System.out.println("Problema encontrado na fila com poll!");
			System.out.println("Problema encontrado na fila com peek!");
		}
//		if (fila.poll() != null) {
//			System.out.println("Problema encontrado na fila com poll!");	
//		}

	}	
}
