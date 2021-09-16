/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9;

/**
 *
 * @author 27605
 */
// An exception for stack-full errors.  
class StackFullException extends Exception {  
  int size;  
    
  StackFullException(int s) { size = s; }  
  
  public String toString() {  
   return "\nStack is full. Maximum size is " +  
           size;  
  }  
}  
  
// An exception for stack-empty errors.  
class StackEmptyException extends Exception {  
  
  public String toString() {  
   return "\nStack is empty.";  
  }  
} 
