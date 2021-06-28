/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise11;

/**
 *
 * @author 27605
 */
import java.util.ArrayList;

public class Classwork11 {
    public static void main(String[] args) {
        ArrayList<String> names;
        names = new ArrayList();
        
        names.add("Jamie");
        names.add("Gustav");
        names.add("Alisa");
        names.add("Jose");
        names.add(2, "Prashant");
        
        names.remove(0);
        names.remove(names.size() - 1);
        names.remove("Gustav");
        
        System.out.println(names);
    }
    
}
