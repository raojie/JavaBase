package com.example.sync;

/**
 * @Method: SynTest_1
 * @Decription:
 * @Author: raoj
 * @Date 2018/1/19
 **/
public class SynTest_1 {

    public static void main(String[] args) {
        //启动3个线程，这里用了匿名类
        for (int i = 0; i < 3; i++) {
            new Thread() {
                public void run() {
//                    method(this);
//                    method1(this);
//                    method2(this);
                    method3(this);
                }
            }.start();
        }
    }


    //非同步 线程启动不按顺序运行，结束也不按顺序结束
    static void method(Thread thread) {
        System.out.println("begin " + thread.getName());
        try {
            Thread.sleep(2000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("end " + thread.getName());
    }

    //同步方式一：同步方法
    synchronized static void method1(Thread thread) {//这个方法是同步的方法，每次只有一个线程可以进来
        System.out.println("begin " + thread.getName());
        try {
            Thread.sleep(2000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("end " + thread.getName());
    }

    //同步方式二：同步代码块
    static void method2(Thread thread) {
        synchronized (SynTest_1.class) {
            System.out.println("begin " + thread.getName());
            try {
                Thread.sleep(2000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            System.out.println("end " + thread.getName());
        }
    }

    //同步方式三：使用同步对象锁
    private static Object _lock1 = new Object();
    private static byte _lock2[] = {};//据说，此锁更可提高性能。源于：锁的对象越小越好

    static void method3(Thread thread) {
        synchronized (_lock1) {
            System.out.println("begin " + thread.getName());
            try {
                Thread.sleep(2000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            System.out.println("end " + thread.getName());
        }
    }
}
