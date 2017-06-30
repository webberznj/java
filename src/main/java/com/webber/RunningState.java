package com.webber;

/**
 * Created by wanpeng on 2017/6/30.
 */
public class RunningState extends LiftState{
    public void open() {
        //DO nothing
    }

    public void close() {
        // Do nothing!!!
    }

    public void run() {
        System.out.println("电梯上下跑。。。");
    }

    public void stop() {
        //设置为停止状态
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }
}
