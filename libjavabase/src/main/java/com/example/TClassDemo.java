package com.example;

/**
 * Method: TClassDemo
 * Decription:
 * Author: raoj
 * Date: 2017/8/27
 **/
public class TClassDemo {
    public static void main(String[] args) {

        // 定义泛型类Gen的一个Integer版本

        TClass<Integer> intOb = new TClass<Integer>(88);

        intOb.showType();

        int i = intOb.getObject();

        System.out.println("value= " + i);

        System.out.println("----------------------------------");

        // 定义泛型类Gen的一个String版本

        TClass<String> strOb = new TClass<String>("Hello Gen!");

        strOb.showType();

        String s = strOb.getObject();

        System.out.println("value= " + s);

    }
}
