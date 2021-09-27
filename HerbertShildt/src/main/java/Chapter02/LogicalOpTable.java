/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2;

/**
 *
 * @author 27605
 */
/* 
   Try This 2-2 
 
   Print a truth table for the logical operators. 
*/ 
class LogicalOpTable {    
  public static void main(String args[]) {    
 
    boolean p, q; 
 
    System.out.println("P\tQ\tAND\tOR\tXOR\tNOT"); 
 
    p = true; q = true; 
    System.out.print(p + "\t" + q +"\t"); 
    System.out.print((p&q) + "\t" + (p|q) + "\t"); 
    System.out.println((p^q) + "\t" + (!p)); 
 
    p = true; q = false; 
    System.out.print(p + "\t" + q +"\t"); 
    System.out.print((p&q) + "\t" + (p|q) + "\t"); 
    System.out.println((p^q) + "\t" + (!p)); 
 
    p = false; q = true; 
    System.out.print(p + "\t" + q +"\t"); 
    System.out.print((p&q) + "\t" + (p|q) + "\t"); 
    System.out.println((p^q) + "\t" + (!p)); 
 
    p = false; q = false; 
    System.out.print(p + "\t" + q +"\t"); 
    System.out.print((p&q) + "\t" + (p|q) + "\t"); 
    System.out.println((p^q) + "\t" + (!p)); 
  }    
}
