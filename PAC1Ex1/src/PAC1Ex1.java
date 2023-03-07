import java.util.Scanner;

public class PAC1Ex1 {

    private static void Fibonacci(int n) {
        System.out.println(n);
        int old;
        int actual = 0;
        int next = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(actual + ", "); //prints the 'i' value of the fibonacci succession
            old = actual;
            actual = next;
            next = next + actual;
        }
    }

    public static void main(String[] args) {

        //int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = in.nextInt(); //assigns the variable "number" the integer entered by keyboard
        number = 3;

        if(number < 0) {
            System.out.println("[ERROR]: The given number is not positive");
        } else {
            Fibonacci(number, 0);
        }
    }
}