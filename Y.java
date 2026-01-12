public class Y {
    public static void main(String[] args) {
        String t2 = "hfhgfh";
        // Text Block
        String text = """
                kgghkdf
                gdhfkjghd
                ghdkjh
                ghjdfkj
                """;
        // int choice = 1;
        // final int DRINKS = 1;
        // Switch with expression
        // int e = a + b * d /e;
        String choice = "Drinks";
        int amount = switch (choice) {
            case "Drinks" -> 100;
            case "Burger", "Icecream" -> 150;
            case "Pizza" -> {
                int d = 200;
                int e = 10;
                yield d + e;
            }
            default -> 0;
        };
        // int w = 0;
        switch (choice) {
            case "Drinks":
                System.out.println("Rs 100");
                // w = 100;
                break;
            case "Burger":
                System.out.println("Rs 150");
                break;
            case "Pizza":
                System.out.println("Rs 200");
                break;
            default:
                System.out.println("Wrong Choice...");
        }
        StringBuilder sb = new StringBuilder();
        // StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.capacity()); // 16
        System.out.println(sb.length()); // 4
    }
}
