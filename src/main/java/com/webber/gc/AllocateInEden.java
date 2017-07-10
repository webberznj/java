package com.webber.gc;

/**
 * Created by wanpeng on 2017/7/6.
 */
public class AllocateInEden {
    private static final int _1MB = 1024 * 1024;

    /**
     * VM ARGS: -verbose:gc - Xms20m -Xmx20m -Xmn10m(老年代) - XX:SurvivorRatio=8(新生代中Eden区和Survivor区的空间比例为8:1) -XX:+PrintGCDetails
     */
    public static void testAllocation(){
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];
    }

    public static void main(String[] args) {
        testAllocation();
    }
}
