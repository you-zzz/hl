package com.youz.lianxi;

public class Proson {


    String name;
    int age;
    int sex;
    /**
     * sex :1 表示男性
     * sex :0 标识女性
     */


    public void study(){
        System.out.println("studying");
    }

    public void showAge(){
        System.out.println("age : " + age);
    }

    public int addAge(int i){
        age += i; // age = age + i;
        return age;
    }

}
