package com.model.study;
// 装饰者模式
public class Zhuangshi {
    public static void main(String[] args) {
        String name = "香肠";
        Food food = new Bread(new Cream(new Vegetable(new Food(name))));
        System.out.println(food.Mark());
    }
}
class Food{
    private String foodName;
    public Food(){
    }
    public Food(String foodName) {
        this.foodName = foodName;
    }
    public String Mark(){
        return  foodName;
    }
}

class Bread extends Food{
    private Food food;

    public Bread(Food food) {
        this.food = food;
    }
    public String Mark(){
        return food.Mark()+"+面包";
    }
}

class Cream extends Food{
    private Food food;

    public Cream(Food food) {
        this.food = food;
    }

    public String Mark(){
        return food.Mark()+"+奶油";
    }
}

class Vegetable extends Food{
    private Food food;

    public Vegetable(Food food) {
        this.food = food;
    }

    public String Mark(){
        return food.Mark()+"+蔬菜";
    }
}