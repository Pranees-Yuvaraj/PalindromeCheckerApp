import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string to check palindrome: ");
            String input = sc.nextLine();
            
            String rev = new StringBuilder(input).reverse().toString();
            
            if (input.equalsIgnoreCase(rev)) {
                System.out.println("The string \"" + input + "\" IS a Palindrome.");
            } else {
                System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
            }
        }
    }
}