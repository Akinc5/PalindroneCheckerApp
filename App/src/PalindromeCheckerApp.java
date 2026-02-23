import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("Input Text:");
        String input = hi.nextLine();
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean ispalindrome = true;
        while(start<end){
            if (chars[start]!= chars[end]){
                ispalindrome= false;
                break;
            }
            start++;
            end--;
        }
        if (ispalindrome) {
            System.out.println("Is it a Palindrome? : true");
        } else {
            System.out.println("Is it a Palindrome? : false");
        }
    }
}