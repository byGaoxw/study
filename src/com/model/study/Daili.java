package com.model.study;

public class Daili {
    public static void main(String[] args) {
        ProxyInterface proxyInterface = new WeddingCompany(new NormaHome());
        proxyInterface.marr();
    }
}
interface ProxyInterface{
    void marr();
}
class NormaHome implements  ProxyInterface{

    @Override
    public void marr() {
        System.out.println("进行中...");
    }
}

class WeddingCompany implements  ProxyInterface{
    private  ProxyInterface proxyInterface;

    public WeddingCompany(ProxyInterface proxyInterface) {
        this.proxyInterface = proxyInterface;
    }

    @Override
    public void marr() {
        System.out.println("准备前...");
        proxyInterface.marr();
        System.out.println("结束。");
    }
}