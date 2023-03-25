 package com.youz.lianxi;

/**
 * 2.利用面向对象的编程方法，设计类Circle计算圆的面积。
 *
 */

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 3;
        double area = c1.findArea();
        System.out.println(area);
    }
}

//圆
class Circle{

    //属性
    double radius;//半径

    //求圆的面积
    public double findArea(){
        double area = Math.PI * radius * radius;
        return area;
    }
};

