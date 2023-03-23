package aula06;

import java.util.ArrayList;

public class LinearSum {

	public static int SomaLinear (ArrayList<Integer> lista, int numpos) {
//		if   n = 1  then return A[0]
//		else return LinearSum(A, n - 1) + A[n - 1]
		if (!lista.isEmpty()) {
			if (numpos == 0) {
				return lista.get(0);
			} else {
				return SomaLinear(lista, numpos-1) + lista.get(numpos-1);
			}
		}
		return 0;
	}
	public static int ContagemLinear (ArrayList<Integer> lista, int numpos) {
		if (!lista.isEmpty()) {
			if (numpos == 1) {
				return 1;
			} else {
				return ContagemLinear(lista, numpos-1) + 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(10);
		lista.add(20);
		lista.add(30);
		lista.add(40);
		lista.add(50);
		System.out.println(SomaLinear(lista, lista.size()));;
		System.out.println(ContagemLinear(lista, lista.size()));;

	}

}
