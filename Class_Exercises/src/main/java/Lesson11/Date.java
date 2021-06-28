/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11;

/**
 *
 * @author 27605
 */
import java.time.LocalDate;
//import java.time.chrono.Japanesedate;

public class Date {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
//        JapaneseDate jDate = JapaneseDate.from(mydate);
        System.out.println("Jpanaese date is: " + myDate);
    }
    
}
