import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeStrategy dequeStrategy = new DequeStrategy();

        long start1 = System.nanoTime();
        boolean stackResult = stackStrategy.isPalindrome(input);
        long end1 = System.nanoTime();
        long timeStack = end1 - start1;

        long start2 = System.nanoTime();
        boolean dequeResult = dequeStrategy.isPalindrome(input);
        long end2 = System.nanoTime();
        long timeDeque = end2 - start2;

        System.out.println("---------------------------------");
        System.out.println("Stack Strategy Result: " + stackResult);
        System.out.println("Time: " + timeStack + " ns");
        System.out.println("---------------------------------");
        System.out.println("Deque Strategy Result: " + dequeResult);
        System.out.println("Time: " + timeDeque + " ns");
        System.out.println("---------------------------------");

        if (timeStack < timeDeque)
            System.out.println("Stack Strategy is faster.");
        else if (timeDeque < timeStack)
            System.out.println("Deque Strategy is faster.");
        else
            System.out.println("Both strategies took the same time.");

        sc.close();
    }
}