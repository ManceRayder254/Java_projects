public class sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 200; i += 2) {
            sum += i;
        }
        System.out.println("The sum of the first 100 odd numbers is " + sum);
    }
}

