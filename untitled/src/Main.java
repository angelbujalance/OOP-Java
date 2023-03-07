import java.util.Scanner;

public class PAC1Ex1 {

    private static void Fibonacci(int n) {
        int old;
        int actual = 0;
        System.out.print(actual);
        int next = 1;
        for (int i=0; i<n-1; i++) {
            old = actual;
            actual = next;
            next = actual + old;
            System.out.print(", " + actual); //prints the 'i' value of the fibonacci succession

        }
    }

    public static void main(String[] args) {

        //int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = in.nextInt(); //assigns the variable "number" the integer entered by keyboard

        if(number<0) {
            System.out.println("[ERROR]: The given number is not positive");
        } else {
            Fibonacci(number);
        }
    }
}