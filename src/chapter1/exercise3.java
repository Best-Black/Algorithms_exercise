/**
 * 习题1.1.13
 * 编写一段代码，打印出一个 M 行 N 列的二维数组的转置 （交换行和列）
 */

package chapter1;

public class exercise3 {
    public static void main(String[] args){
        int[][] a = new int[10][9];
        int b = 0;

        //初始化
        for(int i = 0; i<10; i++){
            for(int j=0; j<9; j++){
                a[i][j] = b+1;
                b++;
            }
        }

        //转置
        for(int i = 0; i<10; i++){
            for(int j=0; j<9; j++){
                a[i][j] = b+1;
                b++;
            }
        }

    }
}
