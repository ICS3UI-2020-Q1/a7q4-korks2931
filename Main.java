
/**
 * This program will print out the last digit of the number in the method
 * @author Sevde 
 */
public class Main {
 // make a method to find the last digit of the number 
 public static int lastDigit ( int integer){
   // formula to find the last digit of a positive number 
   int lastOne = integer % 10; 
   // if statement for the negative number
   if (lastOne < 0){
     // change the negative number back to positive by multiplying with -1
     lastOne = lastOne * -1; 
    
   }
   // print out the last digit 
   System.out.println(lastOne);
   // return the method 
    return lastOne;
   
   
 }
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // do the method 
   lastDigit(-947);
    
  }
}
