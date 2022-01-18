/**
 * 一些在练习中会反复用到的函数
 */

package chapter1;
import java.util.Random;

public class funcs {

    /**
     * 输出二维矩阵
     * @param a：输出的矩阵
     */
    public static void printArray2d(int[][] a){
        for(int i=0; i<a.length; i++){
            String s = "";
            for(int j=0; j<a[i].length; j++){
                s = s + a[i][j] + " ";
            }
            System.out.println(s);
        }
    }

    /**
     * 创建一个元素为随机数的二维数组（整数）
     * @param h
     * @param w
     * @return
     */
    public static int[][] initRandom(int h, int w){
        assert h > 0;
        assert w > 0;
        int[][] a = new int[h][w];
        Random r = new Random();

        for(int i=0; i<h; i++){
            for (int j=0; j<w; j++){
                a[i][j] = r.nextInt(100);
            }
        }

        return a;
    }

    /**
     * 检测输入是否为空
     * @return
     */
    public boolean isEmpty(){

    }

    /**
     * 测试函数
     * @param args
     */
    public static void main(String[] args){
        int[][] a=initRandom(10,9);
        printArray2d(a);
    }
}
