/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise08;

/**
 *
 * @author 27605
 */
public class Item {  
    String desc;
    int quantity;
    double price;
    char colorCode = 'U';   //'U' = Undetermined

    public void displayItem() {
        System.out.println("Item: " + desc + ", " + quantity + ", "
                + price + ", "+colorCode);
    }

    // Write a public 3-arg setItemFields method that returns void.
    public void setItemFields(String desc, int qty, double pr) {
        this.desc = desc;
        this.quantity = qty;
        this.price = pr;
    }

    // Write a public 4-arg setItemDisplay method that returns an int.
    public int setItemFields(String desc, int qty, double pr, char c) {
        if (c != ' ') {
            colorCode = c;
            this.setItemFields(desc, qty, pr);
            return 1;
        } else return -1;
    }
}
