/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise04;

/**
 *
 * @author 27605
 */
public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity, and total
        // Do not initialize total.
        double price = 29.99;
        int quantity = 2;
        double tax = 1.04;
        double total;
        
        // Modify message to include quantity.
        message = custName+" wants to purchase "+quantity+ " "+itemDesc;
        
        System.out.println(message);
        
        // Calculate total and then print the total cost.
        total = quantity * price * tax;
        
        System.out.println("Total cost with tax: "+total);
    }
    
}
