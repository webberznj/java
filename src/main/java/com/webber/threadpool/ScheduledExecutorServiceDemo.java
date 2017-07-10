package com.webber.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by wanpeng on 2017/7/10.
 */
public class ScheduledExecutorServiceDemo {
    public static void main(String[] args) {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(10);
        ses.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(8000);
                    System.out.println(System.currentTimeMillis()/1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },0,2,TimeUnit.SECONDS);
    }
}
