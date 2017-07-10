package com.webber.statepattern;

/**
 * Created by wanpeng on 2017/6/30.
 */
public abstract class LiftState {
    protected Context context;
    public void setContext(Context context){
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract  void run();

    public abstract void stop();
}
