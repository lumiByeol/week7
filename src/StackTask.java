import java.util.Stack;

public class StackTask {
    public static boolean checkBrackets(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }
            else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String brackets1 = "()";
        String brackets2 = "()[]{}";
        String brackets3 = "(]";
        String brackets4 = "([)]";

        System.out.println("first sequence: " + brackets1);
        System.out.println("second sequence: " + brackets2);
        System.out.println("third sequence: " + brackets3);
        System.out.println("fourth sequence: " + brackets4);

        System.out.println("---------");

        System.out.println("is the first sequence in line with given conditions? " + checkBrackets(brackets1));
        System.out.println("is the second sequence in line with given conditions? " + checkBrackets(brackets2));
        System.out.println("is the third sequence in line with given conditions? " + checkBrackets(brackets3));
        System.out.println("is the fourth sequence in line with given conditions? " + checkBrackets(brackets4));
    }
}