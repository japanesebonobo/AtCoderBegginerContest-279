package src;
import java.util.*;

public class C_LadderTakahashi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int W = scanner.nextInt();
        char S [][]  = new char[H][W];
        char T [][]  = new char[H][W];

        for (int i = 0; i < H; i++) {
            String s = scanner.next();
            char[] sChar = s.toCharArray();
            for (int j = 0; j < sChar.length; j++) {
                S[i][j] = sChar[j];
            }
        }

        for (int i = 0; i < H; i++) {
            String t = scanner.next();
            char[] tChar = t.toCharArray();
            for (int j = 0; j < tChar.length; j++) {
                T[i][j] = tChar[j];
            }
        }
        scanner.close();
        
        List<String> sList = new ArrayList<String>();

        for (int i = 0; i < W; i++) {
            char [] sListElement = new char[H];
            for (int j = 0; j < H; j++) {
                sListElement[j] = S[j][i];
            }
            sList.add(new String(sListElement));
        }

        Collections.sort(sList);

        List<String> tList = new ArrayList<String>();

        for (int i = 0; i < W; i++) {
            char [] tListElement = new char[H];
            for (int j = 0; j < H; j++) {
                tListElement[j] = T[j][i];
            }
            tList.add(new String(tListElement));
        }

        Collections.sort(tList);

        String ans = "No";

        if (Objects.equals(sList, tList)) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}