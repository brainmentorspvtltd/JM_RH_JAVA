public class C {
    public static void main(String[] args) {
        // Integer a = 1000; // a ref
        // Integer b = 1000; // b ref
        // System.out.println(a == b);
        String x = "Amit".intern(); // 1
        String y = "Amit"; // 0
        String z = new String("Amit").intern();
        z = null;
        System.out.println(x == y); // true
        System.out.println(x == z); // false

    }
}
