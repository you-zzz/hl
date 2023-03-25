package com.youz.lianxi;

public class lianxi5 {

    public static void main(String[] args) {

        //创建多个对象
        //声明Student类型的数组
        Student1[] stus = new Student1[20];
        for (int i = 0 ;i < stus.length;i++){
            //给数组元素赋值
            stus[i] = new Student1();//定义每个学生
            //给Student对象的属性赋值
            stus[i].number = ( i + 1 );
            //年级 : [1-6]
            stus[i].state = (int)(Math.random() * ( 6 - 1 + 1 ) + 1);
            //分数 ： [0-100]，（int）是为了转换为 int类型的
            stus[i].score = (int)(Math.random() * ( 100 - 1 + 1 ) + 1);
        }

        lianxi5 test = new lianxi5();
        test.print(stus);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        test.sort(stus);
        test.print(stus);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        test.searchState(stus, 3);
    }
    //遍历Studengt1[]数组的操作
    public void print(Student1[] stus){
        for (int i = 0 ;i < stus.length;i++){
            System.out.println(stus[i].info());
        }
    }
    public void searchState(Student1[] stus,int  state){
        //打印三年级的人的信息
        int  tsum = 0;
        for(int i = 0 ;i < stus.length;i++){
            if (stus[i].state == state){
                tsum += 1;
            }
        }
        System.out.println("三年级的学生个数为： " + tsum + "\n" +  "下面是学生信息：");
        for(int i = 0 ;i < stus.length;i++){
            if (stus[i].state == state){
                System.out.println(stus[i].info());
            }
        }
    }
    public void sort(Student1[] stus){
        //使用冒泡排序按学生成绩排序
        for(int i = 0;i < stus.length -1;i++){
            for (int j = 0;j < stus.length -1 -i;j++){
                if(stus[j].score < stus[ j + 1 ].score){
                    Student1  temp = stus[j];
                    stus[j] = stus[ j + 1 ];
                    stus[ j + 1 ] = temp;
                }
            }
        }
    }
}

class Student1{
    int number;//学号
    int state;//年级
    int score;//成绩
    //显示学生信息
    public String info(){
        return "学号： " + number + "    " + "年级： " + state + "    " + "分数： " + score;
    }
}