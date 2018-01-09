package com.example;

/**
 * Method: Static_Thread
 * Decription:
 * Author: raoj
 * Date: 2018/1/9
 **/
public class Static_Thread implements Runnable {
    /**
     * java是线程安全的，即对任何方法（包括静态方法）都可以不考虑线程冲突，
     * 但有一个前提，就是不能存在全局变量。
     * 如果存在全局变量，则需要使用同步机制。
     */

    @Override
    public void run() {
        StaticAction.print();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new Thread(new Static_Thread()).start();
        }
    }
}

class StaticAction {
    public static int i = 0;

    public static void print() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            System.out.println("step " + i + " is running.");
            sum += i;
        }
        if (sum != 45) {
            System.out.println("Thread error!");
            System.exit(0);
        }
        System.out.println("sum is " + sum);
    }
}