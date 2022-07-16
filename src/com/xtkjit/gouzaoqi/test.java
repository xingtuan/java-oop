package com.xtkjit.gouzaoqi;

public class test {
    public static void main(String[] args) {
        car c = new car();
        c.name = "宝马";
        c.price = 38.9;
        System.out.println(c.name);
        System.out.println(c.price);
        car cc = new car("奔驰",66.6);
        System.out.println(cc.name);
        System.out.println(cc.price);
    }
}
