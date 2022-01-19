

package chapter1;

import java.util.Scanner;

public class FixCapacityStack<Item> {
    private Item[] a;
    private int N=0;

    public FixCapacityStack(int cap){
        a = (Item[]) new Object[cap];
    }

    public boolean isEmpty(){  return N==0;  }

    public boolean isFull(){  return N==a.length; }

    public int size(){ return N; }

    public void push(Item item){
        a[N++]=item;
    }

    public Item pop(){
        return a[--N];
    }

    public Item peek() { return a[N-1]; }

    public static void main(String[] args) {
        FixCapacityStack<String> s;
        s = new FixCapacityStack<String>(100);

        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String item = in.next();
            if(!item.equals("-")) s.push(item);
            else if(!s.isEmpty()) System.out.println(s.pop()+" ");
        }
        System.out.println("("+s.size()+"left on stack)");
    }
}









