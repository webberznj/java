package com.webber.gc;

/**
 * Created by wanpeng on 2017/7/6.
 */
public class AllocateDirectlyInPretenure {
    private static final int _1MB = 1024*1024;

    /**
     * VM ARGS: - verbose:gc - Xms20m -Xmx20m - Xmn10m - XX:SurvivorRatio=8 - XX:+PrintGCDetails
     * - XX:PretenureSizeThreshold=3145728
     */
    public static void testPretenureSizeThreshold(){
        byte [] allocation = new byte [4 * _1MB];
    }
    public static void main(String[] args) {
        testPretenureSizeThreshold();
    }

}
