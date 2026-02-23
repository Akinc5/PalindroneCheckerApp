import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("Input Text:");
        String input = hi.nextLine();
        String rev = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            rev = rev + input.charAt(i);
        }
        if (input.equals(rev)) {
            System.out.println("Is it a Palindrome? : true");
        } else {
            System.out.println("Is it a Palindrome? : false");
        }
    }
}