import java.util.*;

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        Stack<Character> st = new Stack<>();

        for (char c : input.toCharArray()) {
            st.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != st.pop()) {
                return false;
            }
        }

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean check(String input) {

        Deque<Character> dt = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            dt.addLast(c);
        }

        while (dt.size() > 1) {
            if (!dt.removeFirst().equals(dt.removeLast())) {
                return false;
            }
        }

        return true;
    }
}

class PalindromeChecker {

    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) {
        return strategy.check(input);
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner hi = new Scanner(System.in);

        System.out.println("Input Text:");
        String input = hi.nextLine();

        System.out.println("Choose Strategy: 1 - Stack, 2 - Deque");
        int choice = hi.nextInt();

        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        PalindromeChecker checker = new PalindromeChecker(strategy);
        boolean result = checker.checkPalindrome(input);

        System.out.println("Is it a Palindrome? : " + result);

        hi.close();
    }
}