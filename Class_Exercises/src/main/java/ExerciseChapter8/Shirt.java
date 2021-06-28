/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciseChapter8;

/**
 *
 * @author 27605
 */
public class Shirt {
    public String description;
    public char colorCode;
    public double price;
    
    public Shirt(){
        description = "--description required";
        colorCode = 'U';
        price = 0.00;
    }
    
    public void display(){
        System.out.println("Shirt description:" + description);
        System.out.println("Color code" + colorCode);
        System.out.println("Shirt Price" + price);
    }
}
