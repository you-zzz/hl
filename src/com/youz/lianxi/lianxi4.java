package com.youz.lianxi;

public class lianxi4 {

    public static void main(String[] args) {

        //创建多个对象
        //声明Student类型的数组
        Student[] stus = new Student[20];
        for (int i = 0 ;i < stus.length;i++){
            //给数组元素赋值
            stus[i] = new Student();
            //给Student对象的属性赋值
            stus[i].number = ( i + 1 );
            //年级 : [1-6]
            stus[i].state = (int)(Math.random() * ( 6 - 1 + 1 ) + 1);
            //分数 ： [0-100]，（int）是为了转换为 int类型的
            stus[i].score = (int)(Math.random() * ( 100 - 1 + 1 ) + 1);
        }

        //遍历学生数组
        for (int i = 0 ;i < stus.length;i++){
            System.out.println(stus[i].info()  );
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //打印三年级的人的信息
        int  tsum = 0;

        for(int i = 0 ;i < stus.length;i++){
            if (stus[i].state == 3){
                tsum += 1;
            }
        }
        System.out.println("三年级的学生个数为： " + tsum + "\n" +  "下面是学生信息：");

        for(int i = 0 ;i < stus.length;i++){
            if (stus[i].state == 3){
                System.out.println(stus[i].info());
            }
        }
    }


}
class Student{
    int number;//学号
    int state;//年级
    int score;//成绩
    //显示学生信息
    public String info(){
        return "学号： " + number + "    " + "年级： " + state + "    " + "分数： " + score;
    }
}