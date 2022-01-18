package chapter1;

import java.util.Random;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class stack_and_queue {
    //直接使用stack类
    public static  void sstack(){
        Stack<Integer> sk = new Stack<Integer>();
        Random r = new Random();

        //判断是否为空链表
        for(int i=0;i<10;i++){
            int e=sk.push(i*r.nextInt());
            System.out.println(e+" ");
        }
        System.out.println();
        System.out.println(sk.empty());
        System.out.println(sk.pop());
        System.out.println(sk.peek());

        //可以用sk.search(20)来查找元素
    }

    public static void linkStack(){
        LinkedList<Integer> sk=new LinkedList<Integer>();
        System.out.println(sk.isEmpty());//判断是否为空，true
        //System.out.println(sk.empty());错误，没有这个方法
        for(int i=0;i<10;i++){
            //int e=sk.addFirst(i+20);错误，没有返回值
            sk.addFirst(i+20);//向栈顶添加元素
            System.out.println(i+":  "+(i+20));
        }
        System.out.println("peekFirst:"+sk.peekFirst());
        System.out.println("removeFirst:"+sk.removeFirst());//获得栈顶元素并删除
        System.out.println("peekFirst:"+sk.peekFirst());//获得栈顶元素
    }

    public static void linkQueue(){
        Queue<Integer> queue=new LinkedList<Integer>();
        System.out.println(queue.isEmpty());//判断是否为空，true
        //System.out.println(queue.empty());//错误，没有这个方法
        for(int i=0;i<10;i++){
            //int e=sk.addFirst(i+20);错误，没有返回值
            queue.offer(i+20);//向队尾添加元素
            System.out.println(i+":  "+(i+20));
        }
        System.out.println("peekFirst:"+queue.peek());
        System.out.println("removeFirst:"+queue.poll());//获得队首元素并删除
        System.out.println("peekFirst:"+queue.peek());//获得队首元素
    }

    public static void main(String[] args) {
        sstack();
        System.out.println("====================================================================");
        linkStack();
        System.out.println("====================================================================");
        linkQueue();
    }
}
