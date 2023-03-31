package com.youz.ArrayUtil;

public class ArrayUtil {
    //遍历数组
    public void print(int[] arr){
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }
    //求数组最大值
    public int getMax(int[] arr){
        int maxValue = arr[0];
        for (int i = 0;i < arr.length;i++){
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    //获取数组最小值
    public int getMin(int[] arr){
        int minValue = arr[0];
        for (int i = 0;i < arr.length;i++){
            if(minValue > arr[i]){
                minValue = arr[i];
            }
        }
        return minValue;
    }
    //求数组总和
    public int getSum(int[] arr){
        int sumValue = 0;
        for (int i = 0;i < arr.length;i++){
            sumValue += arr[i];
        }
        return sumValue;
    }
    //反转数组
    public void reverse(int[] arr){
        for (int i = 0;i < arr.length / 2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1 ];
            arr[arr.length - i -1 ] = temp;
        }
    }
    //查找某个值
    public int getFind(int[] arr,int dest){
        boolean isflase = true;
        for (int i = 0;i < arr.length;i++){
            if(dest == arr[i]){
                System.out.println(arr[i] + "位置在：" + i);
                isflase = false;
            }
        }
        if(isflase) {
            System.out.println("没有找到！");
        }
        return 0;
    }
    //冒泡排序
    public void sort(int[] arr){
        for (int i = 0;i < arr.length - 1;i++){
            for (int j = 0;j < arr.length - 1 - i;j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }



}
