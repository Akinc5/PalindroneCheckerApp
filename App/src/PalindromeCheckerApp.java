import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("Input Text:");
        String input = hi.nextLine();
        Queue<Character> qt = new LinkedList<>();
        Stack<Character> st = new Stack<>();
        for (char c : input.toCharArray()) {
            st.push(c);
            qt.add(c);
        }
        boolean isPalindrome = true;
        while(!qt.isEmpty()){
            if (!qt.remove().equals(st.pop())) {
                isPalindrome = false;
                break;}
        }
        System.out.println("Is it a Palindrome? : " + isPalindrome);
        hi.close();
    }
}
