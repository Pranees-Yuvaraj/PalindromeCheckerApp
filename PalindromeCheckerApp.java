import java.util.*;
public class PalindromeCheckerApp{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("===== Palindrome Checker App =====");
System.out.print("Enter a string: ");
String input=sc.nextLine();
System.out.println("\nChoose a Checking Mode:");
System.out.println("1. Basic Palindrome Check");
System.out.println("2. Ignore Case");
System.out.println("3. Ignore Spaces");
System.out.println("4. Ignore Special Characters");
System.out.println("5. Stack-Based Palindrome Check");
System.out.print("Enter choice (1-5): ");
int choice=sc.nextInt();
boolean result=false;
switch(choice){
case 1: result=isPalindromeBasic(input); break;
case 2: result=isPalindromeIgnoreCase(input); break;
case 3: result=isPalindromeIgnoreSpaces(input); break;
case 4: result=isPalindromeIgnoreSpecialChars(input); break;
case 5: result=isPalindromeUsingStack(input); break;
default: System.out.println("Invalid choice!"); System.exit(0);
}
if(result) System.out.println("\nResult: \""+input+"\" is a Palindrome.");
else System.out.println("\nResult: \""+input+"\" is NOT a Palindrome.");
sc.close();
}
public static boolean isPalindromeBasic(String str){
String rev=new StringBuilder(str).reverse().toString();
return str.equals(rev);
}
public static boolean isPalindromeIgnoreCase(String str){
str=str.toLowerCase();
String rev=new StringBuilder(str).reverse().toString();
return str.equals(rev);
}
public static boolean isPalindromeIgnoreSpaces(String str){
str=str.replaceAll("\\s+","");
String rev=new StringBuilder(str).reverse().toString();
return str.equalsIgnoreCase(rev);
}
public static boolean isPalindromeIgnoreSpecialChars(String str){
str=str.replaceAll("[^A-Za-z0-9]","").toLowerCase();
String rev=new StringBuilder(str).reverse().toString();
return str.equals(rev);
}
public static boolean isPalindromeUsingStack(String str){
Stack<Character> s=new Stack<>();
Queue<Character> q=new LinkedList<>();
for(char c:str.toLowerCase().toCharArray()){
if(Character.isLetterOrDigit(c)){s.push(c);q.add(c);}
}
while(!s.isEmpty()){
if(s.pop()!=q.remove()) return false;
}
return true;
}
}