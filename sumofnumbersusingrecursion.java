public class sumofnumbersusingrecursion {
    // Recursive method to calculate the sum of first n natural numbers
    public static int sum(int n) {
        if (n == 1) {
            return 1; // Base case
        } else {
            return n + sum(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        int n = 10; // Number up to which we want the sum
        int result = sum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
}
