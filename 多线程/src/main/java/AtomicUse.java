package main.java;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 宫静雨
 * @time 2020-09-10 22:27:03
 */
public class AtomicUse {

    static int[] arr = {1,2,3,4,5,6,7,8,9,10};
    static volatile AtomicBoolean atomicBoolean = new AtomicBoolean();
    static volatile AtomicIntegerArray aia = new AtomicIntegerArray(arr);

    Map<Integer,String> map = new ConcurrentHashMap<>();

    static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Condition condition = lock.newCondition();
    }
}
