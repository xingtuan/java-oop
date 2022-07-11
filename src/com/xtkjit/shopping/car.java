package com.xtkjit.shopping;

import java.util.Scanner;

public class car {
    public static void main(String[] args) {
        goods[] shopcar  = new goods[100];
        System.out.println("欢迎你使用购物车\n——————————");
        System.out.println("请输入你想使用的功能:");
        System.out.println("添加到购物车：add");
        System.out.println("修改购物车：update");
        System.out.println("查看购物车：query");
        System.out.println("结算：pay");
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入你想要的功能：");
            String user = sc.next();
            switch (user) {
                case "add":
                    add(shopcar, sc);
                    break;
                case "update":
                    update(shopcar,sc);
                    break;
                case "query":
                    query(shopcar);
                    break;
                case "pay":
                    pay(shopcar);
                    break;
                default:
                    System.out.println("——————————");
                    System.out.println("你输入的命令没有功能。\n请输入冒号后的代码:");
                    System.out.println("添加到购物车：add");
                    System.out.println("修改购物车：update");
                    System.out.println("查看购物车：query");
                    System.out.println("结算：pay");


            }
        }

    }
    public static void add(goods[] shopcar, Scanner sc){
        System.out.print("请输入产品编号:");
        int id = sc.nextInt();
        System.out.print("请输入产品名称：");
        String name = sc.next();
        System.out.print("请输入产品价格：");
        double price = sc.nextDouble();
        System.out.print("请输入购买数量：");
        int number = sc.nextInt();
        goods g = new goods();
        g.id = id;
        g.name = name;
        g.price = price;
        g.number = number;
        for (int i = 0; i < shopcar.length; i++) {
            if(shopcar[i] == null){
                shopcar[i] = g;
                System.out.println("成功！" + g.name + "已加入购物车");
                break;
            }
        }

    }
    public static void update(goods[] shopcar,Scanner sc){
        System.out.print("请输入产品ID：");
        int id = sc.nextInt();
        try{
        for (int i = 0; i < shopcar.length; i++) {
            if (shopcar[i].id == id){
                System.out.print("请输入要修改的产品数量：");
                shopcar[i].number = sc.nextInt();
                System.out.println("产品" + shopcar[i].name + "的购买数量已修改为" + shopcar[i].number + "件");
                break;
            }
        }
            }catch (Exception e){
            System.out.println("没有这个产品");

        }
        }
    public static void query(goods[] shopcar){
        System.out.println("产品ID\t\t\t\t产品名称\t\t\t\t\t\t\t产品价格\t\t\t\t购买数量");
        for (int i = 0; i < shopcar.length; i++) {
            if (shopcar[i]==null){
                break;
            }else System.out.println(shopcar[i].id+"\t\t\t\t"+shopcar[i].name+"\t\t\t\t\t\t\t\t"
                    +shopcar[i].price+"\t\t\t\t"+shopcar[i].number);

        }

    }
    public static void pay(goods[] shopcar){
        double sum = 0;
        for (int i = 0; i < shopcar.length; i++) {
            if(shopcar[i]==null){
                break;
            }

            sum = shopcar[i].price * shopcar[i].number + sum;
        }
        System.out.println("合计金额："+sum);

    }
}
