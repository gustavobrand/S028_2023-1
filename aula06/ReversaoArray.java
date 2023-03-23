package aula06;

import java.util.ArrayList;

public class ReversaoArray {
	
	public static void InverterArray(ArrayList<Integer> lista, int i, int j) {
		if (i < j) {
			// Swap A[i] and A[ j]
			int temp = lista.get(i);
			lista.set(i, lista.get(j));
			lista.set(j, temp);
			//ReverseArray(A, i+1, j-1)
			InverterArray(lista, i+1, j-1);
		}
		return;
	}

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(10);
		lista.add(20);
		lista.add(30);
		lista.add(40);
		System.out.println(lista);
		InverterArray(lista, 0, lista.size()-1);
		System.out.println(lista);
	}

}
