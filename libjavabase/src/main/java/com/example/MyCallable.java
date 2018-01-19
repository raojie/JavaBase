package com.example;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Method: MyCallable
 * @Decription:
 * @Author: raoj
 * @Date 2018/1/17
 **/
public class MyCallable implements Callable<Integer> {

    public static void main(String[] args) {
        int i = 0;
        Callable<Integer> myCallabel = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<Integer>(myCallabel);
        System.out.println(Thread.currentThread().getName() + " " + i);
        Thread th = new Thread(ft);
        th.start();
        try {
            int sum = ft.get(); //取得新创建的线程中的call()方法返回的
            System.out.println("sum = " + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            sum++;
        }
        return sum;
    }
}
