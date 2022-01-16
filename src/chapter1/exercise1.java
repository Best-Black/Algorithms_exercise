/**
 * 习题1.1.9
 * 编写一段代码，将正整数N用二进制表示，并转换为一个String类型的值s
 */

package chapter1;

public class exercise1 {
    public static void main(String[] args){
        int N = 100;
        String s = "";
        for(int n = N; n > 0; n /= 2){
            s = (n % 2) + s;
        }
        System.out.println(s);
    }
}
