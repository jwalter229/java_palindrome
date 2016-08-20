/*write a program that prompts the user to enter
a three digit number and check to see if it a
palindrome 
*/  

//importing a scanner
   import java.util.Scanner;
   
//Name of the Class   
public class Palindrome {
   
   //Main Method
   public static void main(String[] args) {
      
      //creating a new scanner
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Enter a three digit number: ");
      int number = scanner.nextInt();
      
      // changing int number to string number
      String number_string = String.valueOf(number);
      
      //separating each digit entered into to scanner
      char first = number_string.charAt(0);
      char second = number_string.charAt(1);    
      char third = number_string.charAt(2);
      
      //reversing the order of the digits 
      String reverse = "" + third + second + first;
      
      if(number_string.equals(reverse)) {
         System.out.println(number_string + " is a palindrome");//if number_string equals its reverse
      } else {
         System.out.println(number_string + " is not a palindrome");//if number_string does not equals its reverse    
      }
  }//end of main block
}//end of class Palindrome      