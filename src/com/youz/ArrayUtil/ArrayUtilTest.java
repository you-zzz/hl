package com.youz.ArrayUtil;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil nar = new ArrayUtil();
        int[] arr = new int[]{54, 48, 356, 63, -4, -44};
        int max = nar.getMax(arr);
        System.out.println("数组最大值：" + max);
        int min = nar.getMin(arr);
        System.out.println("数组最小值：" + min);
        int sum = nar.getSum(arr);
        System.out.println("数组总和：" + sum);
        //nar.reverse(arr);
        nar.print(arr);
        System.out.println();
        nar.getFind(arr,4);
        nar.sort(arr);
        nar.print(arr);
    }
}
