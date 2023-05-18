package com.youz.lianxi;

public class lianxi3 {
    /**
     * 打印一个 m行  n列 的矩阵，并计算面积。
     *
     */

    public static void main(String[] args) {

        lianxi3 l3 = new lianxi3();
        System.out.println(l3.method(5,3));

    }
    public int method(int m,int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }

}

