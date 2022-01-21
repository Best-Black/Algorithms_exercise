/**
 * 1.3.9
 * 编写一段程序，从标准输入得到一个缺少左括号的表达式并打印出补全括号之后的中序表达式。
 */

package chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

public class exercise7 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        while (!StdIn.isEmpty()){
            String s = StdIn.readString();
            if(s.equals(")")){
                String num2 = stack.pop();
                String operator = stack.pop();
                String num1 = stack.pop();
                stack.push("(" + num1 + " "+ operator +" " +num2+")");
            }
            else stack.push(s);
        }
        StdOut.print(stack.pop());
    }
}
