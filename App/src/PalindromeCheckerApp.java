import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("Input Text:");
        String input = hi.nextLine();
        LinkedList<Character> lt = new LinkedList<>();
        for (char c : input.toCharArray()) {
            lt.add(c);
        }
        boolean isPalindrome = true;
        while(lt.size()>1){
            if (!lt.removeFirst().equals(lt.removeLast())) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? : " + isPalindrome);
        hi.close();
    }
}
