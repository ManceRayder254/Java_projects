public class SumOfOddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("The sum of the first 100 odd numbers is " + sum);
    }
}

`