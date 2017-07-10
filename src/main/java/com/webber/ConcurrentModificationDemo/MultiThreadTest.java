package com.webber.ConcurrentModificationDemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by wanpeng on 2017/7/4.
 */
public class MultiThreadTest {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Thread thread1 = new Thread(){
            public void run(){
                synchronized (list) {
                    Iterator<Integer> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        Integer integer = iterator.next();
                        System.out.println(integer);
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };

        };
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                synchronized (list) {
                Iterator<Integer> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        Integer integer = iterator.next();
                        if (integer == 2) {
                            iterator.remove();
                        }
                    }
                }
            };
        };
        thread1.start();
        thread2.start();
    }
}
