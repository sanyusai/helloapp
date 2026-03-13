public class HelloApp {

    public static void main(String[] args) {

        // Default name
        String name = "World";

        // Check if command-line argument exists
        if (args.length > 0) {
            name = args[0];
        }

        System.out.println("Hello, " + name + "!");
    }
}
