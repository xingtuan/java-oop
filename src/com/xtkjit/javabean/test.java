package com.xtkjit.javabean;

public class test {
    public static void main(String[] args) {
        people p = new people();
        p.setName("xtkj");
        p.setAge(100);
        p.setHeight(111.111);
        System.out.println(p.getName());
        System.out.println(p.getHeight());
        System.out.println(p.getAge());
    }
}
