/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise12;

/**
 *
 * @author 27605
 */
public class Finances extends Employee {
    int Bonus = 5000;
    
    public static void main(String[] args) {
        Finances b = new Finances();
        System.out.println("Jeff Bezos salary is: " + b.Salary);
        System.out.println("Jeff Bezos bonus is: " + b.Bonus);
        
    }
    
}
