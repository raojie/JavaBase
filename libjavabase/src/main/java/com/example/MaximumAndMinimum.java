package com.example;

/**
 * Method: MaximumAndMinimum
 * Decription: JAVA 各种数值类型最大值和最小值 Int, short, char, long, float
 * Author: raoj
 * Date: 2018/1/20
 **/
public class MaximumAndMinimum {

    public static void main(String[] args) {

        byte bmax = Byte.MAX_VALUE;
        byte bmin = Byte.MIN_VALUE;
        char cmax = Character.MAX_VALUE;
        char cmin = Character.MIN_VALUE;
        double dmax = Double.MAX_VALUE;
        double dmin = Double.MIN_VALUE;
        float fmax = Float.MAX_VALUE;
        float fmin = Float.MIN_VALUE;
        int imax = Integer.MAX_VALUE;
        int imin = Integer.MIN_VALUE;
        long lmax = Long.MAX_VALUE;
        long lmin = Long.MIN_VALUE;
        short shmax = Short.MAX_VALUE;
        short shmin = Short.MIN_VALUE;

        System.out.println("byte max=" + bmax);
        System.out.println("byte min=" + bmin);
        System.out.println("char max=" + cmax);
        System.out.println("char min=" + cmin);
        System.out.println("double max=" + dmax);
        System.out.println("double max=" + dmin);
        System.out.println("float max=" + fmax);
        System.out.println("float min=" + fmin);
        System.out.println("int max=" + imax);
        System.out.println("int min=" + imin);
        System.out.println("long max=" + lmax);
        System.out.println("long min=" + lmin);
        System.out.println("short max=" + shmax);
        System.out.println("short min=" + shmin);
    }
}
