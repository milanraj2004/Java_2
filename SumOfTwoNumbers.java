import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt(); // Input first number

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt(); // Input second number

        int sum = num1 + num2; // Add the numbers
        System.out.println("Sum: " + sum); // Print the sum
    }
}
