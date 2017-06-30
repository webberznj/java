package com.webber;

/**
 * Created by wanpeng on 2017/6/30.
 */
public class OpenningState extends LiftState{
    public void open() {
        System.out.println("电梯开门。。。");

    }

    public void close() {
        super.context.setLiftState(Context.closeState);
        super.context.getLiftState().close();
    }

    public void run() {
        //DO Nothing
    }

    public void stop() {
       //DO Nothing
    }
}
