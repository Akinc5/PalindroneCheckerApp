import java.util.*;
import java.util.Scanner;
class PalindromeChecker {
    private String input;
    public PalindromeChecker(String input) {
        this.input = input;
    }
    public boolean checkPalindrome() {
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        int length = normalized.length();
        char[] stack = new char[length];
        int top = -1;

        for (int i = 0; i < length; i++) {
            stack[++top] = normalized.charAt(i);
        }
        for (int i = 0; i < length; i++) {
            if (normalized.charAt(i) != stack[top--]) {
                return false;
            }
        }
        return true;
    }
}
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("Input Text:");
        String input = hi.nextLine();
        Deque<Character> dt = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            dt.add(c);
        }
        boolean isPalindrome = true;
        while(dt.size()>1){
            if (!dt.removeFirst().equals(dt.removeLast())) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? : " + isPalindrome);
        hi.close();
        PalindromeChecker ch = new PalindromeChecker(input);

        boolean result = ch.checkPalindrome();
        if (result) {
            System.out.println("Is it a Palindrome? : " + result);
        } else {
            System.out.println("Is it a Palindrome? : " + result);
        }
    }
}
