public class D {
    public static void main(String[] args) {
        // String a = "Welcome";
        // String b = "Welcome";
        // String c = "Welcome";
        // a = "Bye Bye";
        StringBuilder sb = new StringBuilder();
        // sb.ensureCapacity(50);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Amit ghdfkjghdfkjlgkjhdgjhdlfkhjgkldfhgklhdfklghdfkghkdfhgkjdfhkghdfkl");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        // String q = "Hello";
        // Runtime r = Runtime.getRuntime();
        // System.out.println(r.totalMemory() + " " + r.freeMemory() + " " +
        // (r.totalMemory() - r.freeMemory()));
        // StringBuilder sql = new StringBuilder("select * from products where
        // type='shoes' and brand='nike'").append("jggjkdfl");
        // for (int i = 1; i <= 100000; i++) {
        // q = q + i;
        // }
        // System.out.println(r.totalMemory() + " " + r.freeMemory() + " " +
        // (r.totalMemory() - r.freeMemory()));
    }
}
