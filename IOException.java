public class IOException {
    public static void main(String[] args) {
        try {
            java.io.FileReader file = new java.io.FileReader("nonexistentfile.txt");
            file.read();
            file.close();
        } catch (java.io.IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}
