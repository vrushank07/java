public class factorialnumber {
    public static void main(String[] args) {
        int number = 5; // Number to calculate factorial
        long factorial = 1;

        for (int i = 1; i <= number; ++i) {
            factorial *= i; // factorial = factorial * i
        }

        System.out.println("Factorial of " + number + " = " + factorial);
    }
}