import java.util.HashMap;
import java.util.Scanner;

// Hashing
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the DOB");
        int dob = scanner.nextInt();
        // Scanner scanner = new Scanner("Hello How are You");
        // while(scanner.hasNext()){
        // System.out.println(scanner.next());
        // }
        // scanner.close();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, """

                """);
        map.put(5,
                """
                                        Key Traits of a Number 5 Personality
                        Freedom & Adventure: Deeply value independence, dislike restrictions, and love travel, new sights, and varied experiences.
                        Communication: Excellent talkers, witty, and persuasive, with strong intellectual and social skills.
                        Adaptable & Versatile: Thrive in dynamic environments and can easily shift focus, though this can make sticking to routines hard.
                        Problem-Solvers: Intelligent, resourceful, and good at finding creative solutions.
                        Balanced: Symbolically represents the five elements (earth, air, fire, water, spirit), seeking balance in life.
                                        """);

        int num = dob; // DOB
        while (num > 9) {
            int sum = 0;
            int c = num;
            while (c != 0) {
                int r = c % 10;
                sum = sum + r;
                c = c / 10;
            }
            num = sum;
        }
        // System.out.println(num);
        String ch = map.get(num);
        System.out.println(ch);
    }

}
