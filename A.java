import java.math.BigDecimal;
import java.math.BigInteger;

class User {
    byte age;
}

public class A {
    public static void main(String[] args) {
        char t = 'न'; // UNICODE Chars
        String t2 = "🔥";
        System.out.println(t);
        BigInteger b1 = new BigInteger("64645645645684576984576894576894576897458967458967456798");
        BigInteger b2 = new BigInteger("64645645645684576984576894576894576897458967458967456798");
        BigInteger b3 = b1.add(b2);
        BigDecimal bb = new BigDecimal("7598437589743953.564354365");
        // long t = 10000000000000L;
        // long t = 10000000000000L;
        for (int i = 1; i <= 100000; i++) {
            User user = new User();
        }
    }

}
