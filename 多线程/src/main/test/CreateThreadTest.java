package main.test;

import main.java.CreateThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author 宫静雨
 * @time 2020-09-10 20:49:24
 */
public class CreateThreadTest {

    public static void main(String[] args) throws Exception{
        /**
         * Thread类
            new CreateThread.MyThread().start();

            Runnable接口
            new Thread(new CreateThread.MyRunnable()).start();
        */
       /**
            Callable接口
            FutureTask<String> task = new FutureTask<>(new CreateThread.MyCallable());
            new Thread(task).start();
            String result = task.get();
            System.out.println(result);
        */

        ExecutorService executors = Executors.newFixedThreadPool(5);
        executors.submit(new CreateThread.MyRunnable());
        Future<String> submit = executors.submit(new CreateThread.MyCallable());
        String result = submit.get();
        System.out.println(result);
        executors.shutdown();
    }
}
