import java.util.Scanner;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("Input Text:");
        String input = hi.nextLine();
        hi.close();
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Is it a Palindrome? : " + isPalindrome);
        } else {
            System.out.println("Is it a Palindrome? : " + isPalindrome);
        }
    }
}

