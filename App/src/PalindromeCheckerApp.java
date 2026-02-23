import java.util.*;

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
    }
}
