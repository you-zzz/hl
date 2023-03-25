package com.youz.lianxi;

public class ProsonTest {
    public static void main(String[] args) {
        Proson p1 = new Proson();
        p1.name = "重阳";
        p1.age = 10;
        p1.sex = 1;

        p1.study();
        p1.showAge();
        int newage = p1.addAge(2);
        System.out.println(p1.name + " 的新年龄为：" + newage);
        System.out.println(p1.age);

        Proson p2 = new Proson();




    }
}
