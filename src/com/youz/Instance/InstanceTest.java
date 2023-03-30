package com.youz.Instance;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class InstanceTest {

    public static void main(String[] args) {
        Phone p = new Phone();
//        p.sendEmail();
//        p.playGame();

        //匿名 对象
//        new Phone().sendEmail();
//        new Phone().playGame();
        PhoneMall mall = new PhoneMall();
        mall.show(new Phone());
        System.out.println("dsdfs ");
    }
}
class Phone{
    double price;//价格
    public void sendEmail(){
        System.out.println("发 送 邮 件 ！");
    }
    public void playGame(){
        System.out.println("玩 游 戏 ！");
    }
    public void showPrice(){
        System.out.println("手机价格为 ： " + price);

}

class PhoneMall{
    public void show(Phone p2){
        p2.playGame();
        p2.sendEmail();

    }
}