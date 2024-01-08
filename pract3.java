import java.util.Scanner;

public class pract3 {
    public static int factorial(int num) {
        int i = 1, fact = 1;
        while (i <= num) {
            fact = fact * i;
            i++;

        }
        return fact;

    }

    public static int fibo(int a) {
        int first = 0, second = 1;
        for (int i = 0; i < a; i++) {
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        return a;
    }

    public static int sumofdig(int b) {
        int sum = 0;
        while (b > 0) {
            int dig = b % 10;
            sum += dig;
            b /= 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print factorial of");
        int num = sc.nextInt();
        System.out.println("Factorial of the number: " + factorial(num));
        System.out.print("Enter the number to print fibonacci upto");
        int a = sc.nextInt();
        System.out.println("Fibonacci numbers are: " + fibo(a));
        System.out.print("Enter a number for sum");
        int b = sc.nextInt();
        System.out.println("Sum of two numbers are: " + sumofdig(b));

    }
}
