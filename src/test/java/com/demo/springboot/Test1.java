package com.demo.springboot;

import java.util.concurrent.Executors;

/**
 * @author zhaodd
 * @date 2023年02月17日 14:01:16
 */
public class Test1 {
    private volatile static Test1 t1 = null;

    private Test1(){

    }

    public static Test1 getTest1(){
        if(t1==null){
            synchronized (Test1.class){
                if(t1==null){
                    t1 = new Test1();
                }
            }
        }
        return t1;
    }

    static class Test1Static{
       private static final Test1 t = new Test1();
    }

    public static Test1 getInstance(){
        return Test1Static.t;
    }

    public static void main(String[] args) {
        Test1 t = Test1.getTest1();
        Thread t1 = new Thread(() -> {
            System.out.println(t);
        });
        t1.start();
        Thread t2 = new Thread(() -> {
            System.out.println(t);
        });
        t2.start();
    }
}
