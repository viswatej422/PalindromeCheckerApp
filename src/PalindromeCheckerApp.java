import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "madam";


        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }


        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }


        System.out.println("Palindrome Checker App");
        System.out.println("UC5: Stack-Based Palindrome Checker");

        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrome.");
        }
    }
}