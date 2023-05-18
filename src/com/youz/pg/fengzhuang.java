package com.youz.pg;
/**
 *面向对象的特征一：封装与隐藏
 *一、问题的引入：
 *      当我们创建一个类的对象以后，我们可以通过“对象.属性”的方式，对对象的属性进行赋值。
 *      这里，赋值操作要受到属性的数据类型和存储范围的制约。除此之外，没有其他制约条件。
 *      但在实际问题中，我们往往需要给属性赋值加入额外的制约条件。
 *          这个条件就不能在属性声明时体现，我们只能通过方法进行限制条件的添加。如：setLegs（）
 *          同时，我们需要避免用户再使用“对象.属性”的方式对属性进行赋值。则需要将属性声明为私有的（private）
 *
 *
 **/
public class fengzhuang {
    public static void main(String[] args){
        Animal at = new Animal();
        at.name = "吊博";
        at.ages = 10;
//        at.legs = 5;
        at.setLegs(-5);
//        at.legs = 5;  在类中 该属性为私有，所以无法调用
        at.show();

    }
}
class Animal{
    String name;
    int ages;
    private int legs;
    public void setLegs(int l){
        if(l >= 0 && l % 2 == 0){
            legs = l;
        }else{
            legs = 0;
        }
    }
    public void eat(){
        System.out.println("动物觅食！！！！！！");
    }
    public void show(){
        System.out.println("name:" + name +"\t" + "ages:" + ages +"\t"+ "legs：" + legs);
    }

}