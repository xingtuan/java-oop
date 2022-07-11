package com.xtkjit.test;

public class test {
    public static void main(String[] args) {
        student s = new student();
        System.out.println(s.name);
        System.out.println(student.teacher.name);
//        student t = new student();
        s.age=20;
        s.git_name();
}
}
