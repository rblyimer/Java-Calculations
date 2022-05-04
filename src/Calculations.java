import java.util.Scanner;
public class Calculations {
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter another number: ");
        int num2 = scan.nextInt();
        
        int Addition = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + Addition);
        
        int Substraction = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + Substraction);
        
        int Multiplication = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " +  Multiplication);

        double Division = (double)num1 / (double)num2;
        System.out.println(num1 + " / " + num2 + " = " + Division);
        
        int Modulus = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " +  Modulus);
        scan.close();
    }
}