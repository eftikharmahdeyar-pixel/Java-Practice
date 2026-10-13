 import java.util.Scanner;
public class newPro4{
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int sum = 0;
        int difference = 0; 
        

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number :");
        a = input.nextInt();
        
        System.out.println("Enter the second number :");
        b = input.nextInt();
        
        
        System.out.println("Chose ane ope(+ , -, *, /)");
        String ope = input.next();
        if (ope.equals("+")){
            sum = a + b;
            System.out.println("The sum number are : " + sum);
        }else if (ope.equals("-")) {
            difference = a - b;
            System.out.println("The difference number are " + difference);
            
        }else if (ope.equals("*")) {
            int product = a * b;
            System.out.println("The product number are " + product);
        }else if (ope.equals("/")) {
            if (b != 0) {
                double quotient = (double) a / b;
                System.out.println("The quotient number are " + quotient);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator. Please choose one of (+, -, *, /).");

        }



            
     
        input.close();

    }
}   