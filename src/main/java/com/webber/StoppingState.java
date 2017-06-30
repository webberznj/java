package com.webber;

/**
 * Created by wanpeng on 2017/6/30.
 */
public class StoppingState extends LiftState{
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    public void close() {
        //do nothing!!!
    }

    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    public void stop() {
       System.out.println("电梯停止了。。。");
    }
}
