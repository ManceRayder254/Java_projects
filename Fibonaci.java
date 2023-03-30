import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("Enter the limit for Fibonacci series: ");
            int limit = scanner.nextInt();
            long num1 = 0, num2 = 1, sum;
            System.out.print(num1 + " " + num2);
            for (int i = 2; i < limit; i++) {
                sum = num1 + num2;
                System.out.print(" " + sum);
                num1 = num2;
                num2 = sum;
            }
        }
    }
}
