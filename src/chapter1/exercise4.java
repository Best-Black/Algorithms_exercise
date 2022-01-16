/**
 * 习题1.1.14
 * 编写一个静态方法lg()，接受一个整型参数 N，返回不大于 log_2(N) 的最大整数。不要使用 Math 库
 */

package chapter1;

public class exercise4 {
    public static int lg(float N){
        if(N>2){
            int sum=2;
            int i = 1;
            while (sum<N){
                sum *= 2;
                i++;
            }
            return i-1;
        }
        else if (N == 2){return 1;}
        else {
            int sum = 2;
            int i = 1;
            while (sum>N){
                sum /= 2;
                i--;
            }
            return i;
        }
    }

    public static void main(String[] args) {
        float N = 1/2;
        int i = lg(N);
        System.out.println(i);
    }
}
