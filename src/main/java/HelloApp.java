public class HelloApp {
    public static void main(String[] args) {

        StringBuilder nameBuilder = new StringBuilder();

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            String names = nameBuilder.substring(0, nameBuilder.length() - 2);

            System.out.println("Hello, " + names + "!");
        }
    }
}
