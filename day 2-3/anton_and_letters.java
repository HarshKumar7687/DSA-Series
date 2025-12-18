import java.util.Scanner;

public class anton_and_letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean[] seen = new boolean[26];
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (!seen[c - 'a']) {
                    seen[c - 'a'] = true;
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
