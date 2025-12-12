public class TypeNotPresentException {
    public static void main(String[] args) {
        try {
            Class.forName("non.existent.ClassName");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }
    }
}
