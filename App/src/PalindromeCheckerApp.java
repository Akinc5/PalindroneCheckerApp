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

        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeStrategy dequeStrategy = new DequeStrategy();

        PalindromeChecker checker;

        long start, end;

        checker = new PalindromeChecker(stackStrategy);
        start = System.nanoTime();
        boolean stackResult = checker.checkPalindrome(input);
        end = System.nanoTime();
        long stackTime = end - start;

        checker = new PalindromeChecker(dequeStrategy);
        start = System.nanoTime();
        boolean dequeResult = checker.checkPalindrome(input);
        end = System.nanoTime();
        long dequeTime = end - start;

        System.out.println("Is it a Palindrome? : " + stackResult);
        System.out.println("Executon time stack " + stackTime);

        System.out.println("Is it a Palindrome? : " + dequeResult );
        System.out.println("Executon time queue " + dequeTime);

        hi.close();
    }
}
