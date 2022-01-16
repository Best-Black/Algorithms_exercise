/**
 * 习题1.1.11
 * 编写一段代码，打印一个二维布尔数组，其中*表示真，空格表示假。并且打印行号和列号
 */

package chapter1;

public class exercise2 {
    public static void main(String[] args){
        boolean[][] b= new boolean[10][10];

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if (i % 2 == 0) {
                    b[i][j] = true;
                }
            }
        }

        // 打印行号
        System.out.print(" ");
        for(int i = 1; i < 11; i++){
            String s = " " + i;
            System.out.print(s);
        }

        // 打印内容
        for(int i = 0; i<10; i++){
            System.out.println();
            System.out.print(i+1);
            for(int j = 0; j<10; j++){
                String s = " ";
                if (b[i][j] == true){
                    s = s + "*";
                }
                else {
                    s = s + " ";
                }
                System.out.print(s);
            }
        }
    }
}
