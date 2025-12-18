import java.util.Scanner;

public class boy_or_girl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = sc.nextLine();

        int[] freq = new int[26];
        int distinct = 0;

        for (int i = 0; i < username.length(); i++) {
            int index = username.charAt(i) - 'a';

            if (freq[index] == 0) {
                distinct++;
                freq[index] = 1;
            }
        }

        if (distinct % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }
}
