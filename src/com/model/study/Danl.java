package com.model.study;

import org.omg.PortableInterceptor.INACTIVE;
import sun.security.jca.GetInstance;

public class Danl {

}
//懒汉式（线程不安全）
class Singleton{
    private  static  Singleton singleton;

    public Singleton() {
    }
    public  static  Singleton getInstance(){
        if (singleton==null) singleton = new Singleton();
        return  singleton;
    }
}
//懒汉式（线程安全）
class Singleton1{
    private static  Singleton1 singleton1;

    public Singleton1() {
    }
    public static  synchronized  Singleton1 getInstance1(){
        if (singleton1==null) singleton1 = new Singleton1();
        return singleton1;
    }
}

//饿汉式
class Singleton2{
    private  static  Singleton2 singleton2;

    static {
        singleton2 = new Singleton2();
    }

    public Singleton2() {
    }
    public static  Singleton2 getInstance2(){
        return singleton2;
    }
}
// 静态内部类
class  Singleton3{
    private static class SingletonHolder{
        private static final Singleton3 INSTANCE= new Singleton3();

        public SingletonHolder() {
        }
        public static Singleton3 getInstance3(){
            return SingletonHolder.INSTANCE;

        }
    }
}
// 枚举
enum Singleton4{
    INSTANCE;
    public void whateverMethod(){

    }
}
//双重效验锁
class Singleton5{
    private volatile static Singleton5 singleton5;

    public Singleton5() {
    }
    public static Singleton5 getSingleton5(){
        if (singleton5==null){
            synchronized (Singleton5.class){
                if (singleton5==null) singleton5 = new Singleton5();
            }
        }
        return singleton5;
    }
}