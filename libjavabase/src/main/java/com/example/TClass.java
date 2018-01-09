package com.example;

/**
 *
 * Method: TClass
 * Decription: 
 * Author: raoj
 * Date 2017/8/27
 *
 **/
public class TClass<T> {
    private T object;

    public TClass(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public void showType() {
        System.out.println("T的实际类型是: " + object.getClass().getName());
    }
}

