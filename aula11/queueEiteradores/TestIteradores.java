package aula11.queueEiteradores;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class TestIteradores {

	public static void main(String[] args) {
		
		ArrayList<Integer> t1 = new ArrayList<>();
        t1.add(5);
        t1.add(15);
        t1.add(25);
        t1.add(35);
        
        LinkedList<Integer> t2 = new LinkedList<>();
        t2.add(10);
        t2.add(20);
        t2.add(30);
        t2.add(40);
        
        HashSet<Integer> t3 = new HashSet<>();
        t3.add(50);
        t3.add(60);
        t3.add(70);
        t3.add(80);

        Iterator<Integer> it1 = t1.iterator();       
        Iterator<Integer> it2 = t2.iterator();               
        Iterator<Integer> it3 = t3.iterator();        
        while (it1.hasNext()) {
            System.out.print(it1.next() + " ");
        }
        System.out.println();
        while (it2.hasNext()) {
            System.out.print(it2.next()  + " ");
        }
        System.out.println();
        while (it3.hasNext()) {
            System.out.print(it3.next() + " ");
        }
        System.out.println();
	}

}
