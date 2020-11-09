/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemples;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author romah
 */
public class Exemples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int some[] = new int[4];
        
        ArrayList<Integer> some_dyn = new ArrayList<>(5);
        some_dyn.add(56);
        some_dyn.add(6);
        some_dyn.add(5);
        some_dyn.add(7);
        some_dyn.add(435);
        some_dyn.add(8);
        
        for (Integer x : some_dyn) {
            System.out.println(x);
        }
        
        
        LinkedList<String> names = new LinkedList<>();
        names.add("ss");
        names.add("ssw");
        names.add("qwe");
       
        
        names.add(1, "Amlex");
        
        for (String x : names) {
            System.out.println(x);
        }
    }
    
}
