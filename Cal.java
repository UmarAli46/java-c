import java.util.*;

class Cal {
    public static void main(String[] args) {
  Scanner obj = new Scanner(System.in);
  System.out.println("Basic Calculator");
  
 System.out.print("Enter an Expression (e.g.5 + 10):");
 String exp = obj.nextLine();

 String[] parts = exp.split(" ");              //split the user string into three parts after spaces
        
 if (parts.length != 3) {
      System.out.println("Invalid input.....(num1 operator num2).");
       return;                                // To Exit 
}

double num1 = Double.parseDouble(parts[0]);             //store value split parts in three variables
String op = parts[1];                          
double num2 = Double.parseDouble(parts[2]);             // String parsing into double 

double result = 0.0;

switch (op) {                                     //swicth to check the operators values
  case "+":
      result = num1 + num2;
  break;
  case "-":
      result = num1 - num2;
  break;
  case "*":
       result = num1 * num2;
  break;
  case "/":
       if (num2 == 0) {                                 //candition for checking denominator in division 
         System.out.println("Division by zero is not allowed.");  
        return;                                       // To Exit
       }
      result = num1 / num2;                             //store value in result
  break;
  default:
      System.out.println("Invalid operator. Please use +, -, *, or /.");       // Any invalid operator
 return;                                               // To Exit 
}

      System.out.println("Result: " + exp + " = " + result);                  //print result
        
}
}
 