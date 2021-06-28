/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

/**
 *
 * @author 27605
 */
public class HelloWorld {
//    public static void main(String[] args) {
//       String[] names = {"Muhammed", "Bob", "Tom"};
//       for (String name : names){
//       System.out.println("Name is" + name);
//    }
//   }
//}

    public static void main(String[] args) {
        int[] sizes = {4, 18, 5, 20};
        for (int size : sizes) {
            if (size > 16) {
                break;
            }
            System.out.println("Size" + size + ", ");
        }
    }

}
