package com.model.study;

import java.util.ArrayList;
import java.util.List;
// 观察者模式
public class guancha {
    public static void main(String[] args) {
        Zhangfu zhangfu = new Zhangfu();
        Qizi qizi = new Qizi();
        Haizi haizi = new Haizi();
        haizi.addPerson(zhangfu);
        haizi.addPerson(qizi);
        haizi.notifyPerson();

    }
}

interface Person{
    void getMessage(String s);
}

class  Zhangfu implements Person{
    private  String name ="丈夫";
    public Zhangfu(){

    }
    @Override
    public void getMessage(String s) {
        System.out.println(name+"听到孩子说："+s);
    }
}

class Qizi implements Person{
    private String name ="妻子";
    public Qizi(){

    }
    @Override
    public void getMessage(String s) {
        System.out.println(name+"听到孩子说："+s);
    }
}

class Haizi {
    public Haizi(){

    }
    List<Person> list = new ArrayList<>();
    public Haizi(List<Person> list) {
        this.list = list;
    }
    public void addPerson(Person person){
        list.add(person);
    }
    public void  notifyPerson(){
        for (Person person : list) {
            person.getMessage("我饿了！");
        }
    }
}