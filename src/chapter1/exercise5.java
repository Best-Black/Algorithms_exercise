/**
 * 习题1.1.20
 * 编写一个递归的静态方法计算 ln (N!) 的值
 *
 * 递归算法的写法：
 * 1.第一行代码要有返回
 * 2.解决更小的模块
 * 3.父问题和子问题中不应该有交集
 */

package chapter1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class exercise5 {

    public static double computeln(int N){
        if(N==2){return Math.log(N);}
        else {
            return Math.log(N) + computeln(N-1);
        }
    }

    public static void main(String[] args) {
        int N = 10;
        System.out.println(computeln(N));
    }
}
