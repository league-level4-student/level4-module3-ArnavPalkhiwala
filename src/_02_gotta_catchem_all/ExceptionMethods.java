package _02_gotta_catchem_all;

import java.util.Stack;

public class ExceptionMethods {

	String reverseString(String s) {

		String reverse = "";

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {

			stack.push(s.charAt(i));

		}
		for (int i = 0; i < stack.size(); i++) {
			reverse+=stack.pop();
		}
		return reverse;

	}
}
