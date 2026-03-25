public class HelloApp {
    public static void main(String[] args) {
        StringBuilder names = new StringBuilder();

        if (args.length == 0) {
            names.append("World");
        } else {
            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }
        }

        System.out.println("Hello, " + names + "!");
    }
}
