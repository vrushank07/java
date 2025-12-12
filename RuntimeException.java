public class RuntimeException {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); // This will cause NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
