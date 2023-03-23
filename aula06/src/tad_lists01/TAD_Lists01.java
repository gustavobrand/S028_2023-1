/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad_lists01;

// import com.sun.javafx.image.impl.IntArgb;
import net.datastructures.*;

/**
 *
 * @author brandg
 */
public class TAD_Lists01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DoublyLinkedList<Integer> testdouble = new DoublyLinkedList<Integer>();

    	// Testes manuais com a funcao addAtIndex
//        testdouble.addLast(10); // 0
//        testdouble.addLast(20); // 1
//        testdouble.addLast(30); // 2
//        System.out.println(testdouble);
//        testdouble.addAtIndex(5, 0);
//        System.out.println(testdouble);
//        testdouble.addAtIndex(7, 1);
//        System.out.println(testdouble);
//        testdouble.addAtIndex(8, 2);
//        System.out.println(testdouble);
//        testdouble.addAtIndex(25, 5);
//        System.out.println(testdouble);
//        // ultima pos
//        testdouble.addAtIndex(27, 7);
//        System.out.println(testdouble);
//        // pos inexistente
//        testdouble.addAtIndex(35, 10);
//        System.out.println(testdouble);
        
        // Testes manuais com a funcao addInOrder
        testdouble.addLast(10); // 0
        testdouble.addLast(20); // 1
        testdouble.addLast(30); // 2
        testdouble.addInOrder(5);
        testdouble.addInOrder(15);
        testdouble.addInOrder(25);
        testdouble.addInOrder(35);
        System.out.println(testdouble);
        
    }
    
}
