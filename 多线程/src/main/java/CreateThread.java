package main.java;

import java.util.concurrent.Callable;

/**
 * @author 宫静雨
 * @time 2020-09-10 20:41:36
 */
public class CreateThread {

    public static class MyThread extends Thread{
        public MyThread() {
        }

        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println("通过继承Thread类，来实现多线程");
        }
    }

    public static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("通过实现Runnable接口，来实现多线程");
        }
    }

    public static class MyCallable implements Callable<String>{
        @Override
        public String call() throws Exception {
            return "通过实现Callable接口，来实现多线程";
        }
    }
}