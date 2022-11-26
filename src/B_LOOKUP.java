package src;
import java.util.*;

public class B_LOOKUP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();
        scanner.close();

        String ans = "No";

        if (S.contains(T)) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}