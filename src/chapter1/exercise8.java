/**
 * 1.3.10
 * 编写一个过滤器 InfixToPostfix ，将算术表达式由中序表达式转为后序表达式。
 *
 * 1.3.11
 * 编写一段程序 EvaluatePostfix，从标准输入中得到一个后序表达式，求值并打印结果
 */

package chapter1;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入表达式：");
        String s = in.next();
        s = InfixToPostfix(s);
        System.out.println("后序表达式："+s);
        float sum = InfixToPostfixadd(s);
        System.out.println("计算结果："+sum);
    }

    public static String InfixToPostfix(String s){
        Queue<Character> queue = new Queue<>();  //输出数据
        Stack<Character> stack = new Stack<>();  //符号

        Character s1 = ' ';
        char peek = ' ';
        for(int i = 0; i<s.length(); i++){
            //数字送入队列
            if(s.charAt(i)>=48 && s.charAt(i)<=57){
                queue.enqueue(s.charAt(i));
            }

            else if(s.charAt(i)==')'){
                s1 = stack.pop();
                while (s1!='('){
                    queue.enqueue(s1);
                    s1 = stack.pop();
                }
            }

            else if((peek=='*'||peek=='/')&&(s.charAt(i)=='*'||s.charAt(i)=='/'||s.charAt(i)=='+'||s.charAt(i)=='-')){
                queue.enqueue(stack.pop());
                stack.push(s.charAt(i));
                peek = s.charAt(i);
            }
            //操作符送入栈
            else {
                stack.push(s.charAt(i));
                peek = s.charAt(i);
            }
        }
        s="";
        while (!queue.isEmpty()){
            s += queue.dequeue()+" ";
        }

        while (!stack.isEmpty()){
            s += stack.pop()+ " ";
        }

        return s;
    }

    public static float InfixToPostfixadd(String s){
        Stack<Float> stack = new Stack<>();
        float sum = 0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)==' ') ;
            else if(s.charAt(i)>=48 && s.charAt(i)<=57){
                stack.push((float)s.charAt(i)-48);
            }
            else if(s.charAt(i)=='+'){
                float num2 = stack.pop();
                float num1 = stack.pop();
                sum = num1 + num2;
                stack.push(sum);
            }
            else if(s.charAt(i)=='-'){
                float num2 = stack.pop();
                float num1 = stack.pop();
                sum = num1 - num2;
                stack.push(sum);
            }
            else if(s.charAt(i)=='*'){
                float num2 = stack.pop();
                float num1 = stack.pop();
                sum = num1 * num2;
                stack.push(sum);
            }
            else if(s.charAt(i)=='/'){
                float num2 = stack.pop();
                float num1 = stack.pop();
                sum = num1 / num2;
                stack.push(sum);
            }
        }

        return sum;
    }
}
