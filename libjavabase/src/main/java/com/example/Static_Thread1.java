package com.example;

/**
 * Method: Static_Thread1
 * Decription:
 * Author: raoj
 * Date: 2018/1/11
 **/
public class Static_Thread1 implements Runnable {

    @Override
    public void run() {
        StaticAction1.incValue();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Static_Thread1()).start();
        }
        try {
            Thread.sleep(1000);    //预留足够的时间让上面的线程跑完
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class StaticAction1 {
    public static int i = 0;

    public synchronized static void incValue() {
        int temp = StaticAction.i;
        try {
            Thread.sleep(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        temp++;
        StaticAction.i = temp;
        System.out.println(temp);
    }
}