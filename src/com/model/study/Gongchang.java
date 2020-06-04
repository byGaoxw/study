package com.model.study;
//工厂模式  工厂类不做具体的实现化产品，子类去实例化产品
public class Gongchang {
    public static void main(String[] args) {
        Car car = Factory.getCarinstance("Benz");
        if (car!=null){
            car.run();
            car.stop();
        }else {
            System.out.println("没有！！");
        }
    }
}
abstract class Car{
    public abstract void run();
    public abstract void stop();
}

class Benz extends Car {

    @Override
    public void run() {
        System.out.println("Benz开始启动了");
    }

    @Override
    public void stop() {
        System.out.println("Benz停止了");
    }
}

class Ford extends Car{

    @Override
    public void run() {
        System.out.println("Ford开始启动了");
    }

    @Override
    public void stop() {
        System.out.println("Ford停止了");
    }
}

class Factory{
    public static Car getCarinstance(String type){
       Car car = null;
       if ("Benz".equals(type)){
           car = new Benz();
       }else if ("Ford".equals(type)){
           car = new Ford();
       }
        return car;
    }

}