import java.util.Stack;
import java.util.*;

public class BalancedBrkt {
	
	    public static void main(String args[]) {
	    	
	    	Scanner scan = new Scanner(System.in);
	    	System.out.print("Enter elements : ");
	    	String s = scan.next();
	    	scan.close();
	        //System.out.println(balancedParenthensies("{(WHAT !)}"));	        
	        System.out.println("We got balanced bracket's' !! : " +balancedParenthensies(s));
	    }

	    public static boolean balancedParenthensies(String s) {
	        Stack<Character> stack  = new Stack<Character>();
	        for(int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if(c == '[' || c == '(' || c == '{' ) {     
	                stack.push(c);
	            } else if(c == ']') {
	                if(stack.isEmpty() || stack.pop() != '[') {
	                    return false;
	                }
	            } else if(c == ')') {
	                if(stack.isEmpty() || stack.pop() != '(') {
	                    return false;
	                }           
	            } else if(c == '}') {
	                if(stack.isEmpty() || stack.pop() != '{') {
	                    return false;
	                }
	            }

	        }
	        return stack.isEmpty();
	    }
}
