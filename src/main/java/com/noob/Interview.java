package com.noob;

import com.noob.model.Cool;

import java.util.Stack;

/*Given a string containing only characters (),
write a function to determine if the input string is valid. An input string is valid if:

Open brackets must be closed in the correct order.

Example:
Input: "()()()"

Output: True

Input: "((()))"

Output: True

Input: "(())("

Output: False


Implement a function is_valid(expression: str) -> bool that returns
True if the input string contains a valid combination of brackets, and False otherwise.

()
 */


public class Interview {
    public static void main(String[] args) {
        System.out.println(checkVaildition("(())"));
        System.out.println(checkVaildition("((((())"));
        System.out.println(checkVaildition("()))"));

    }

    public static boolean checkVaildition(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (!stack.isEmpty() && s.charAt(i) == ')') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
