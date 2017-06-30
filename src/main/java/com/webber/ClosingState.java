package com.webber;

/**
 * Created by wanpeng on 2017/6/30.
 */
public class ClosingState extends LiftState{
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    public void close() {
        System.out.println("电梯关门。。。");
    }

    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }
}
