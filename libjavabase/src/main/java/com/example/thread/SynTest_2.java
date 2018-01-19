package com.example.thread;/**
 * Created by raoj on 2018/1/19.
 */

/**
 * @Method: SynTest_2
 * @Decription:
 * @Author: raoj
 * @Date 2018/1/19
 **/

public class SynTest_2 {
    public static void main(String[] args) {
        Callme target = new Callme();
        for (int i = 0;i<3;i++) {
//            Caller ob1 = new Caller(target, "Hello" + i);
            Caller ob2 = new Caller(target, "Synchronized" + i);
//            Caller ob3 = new Caller(target, "World" + i);
        }
//        Caller ob1 = new Caller(target, "Hello");
//        Caller ob2 = new Caller(target, "Synchronized");
//        Caller ob3 = new Caller(target, "World");
    }
}

class Callme {

    synchronized void test() {
        System.out.println("test---->测试是否是：一旦一个线程进入一个实例的任何同步方法，别的线程将不能" +
                "进入该同一实例的其它同步方法，但是该实例的非同步方法仍然能够被调用");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void nonsynCall(String msg) {
        System.out.println("nonsynCall---->[" + msg + "]");
    }

    synchronized void synCall(String msg) {
        System.out.println("synCall---->[" + msg + "]");
    }
}

class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    Caller(Callme target, String msg) {
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        // TODO Auto-generated method stub
        target.nonsynCall(msg);
//        target.synCall(msg);
        target.test();
    }

}
