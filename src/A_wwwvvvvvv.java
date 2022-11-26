package src;
import java.util.*;

public class A_wwwvvvvvv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        scanner.close();

        char [] tmp = S.toCharArray();
        int ans = 0;

        for (int i = 0; i < tmp.length; i++) {
           if (tmp[i] == 'v') {
            ans++;
           } else if (tmp[i] == 'w') {
            ans+=2;
           }
        }
        System.out.println(ans);
    }
}