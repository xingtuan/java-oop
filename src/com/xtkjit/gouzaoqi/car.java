package com.xtkjit.gouzaoqi;

public class car {
    String name;
    double price;
    public car(){
        System.out.println("=无参数构造器被调用=");
    }
    public car(String n, double p){
        System.out.println("=有参数构造器被调用=");
        name = n;
        price = p;
    }
}
