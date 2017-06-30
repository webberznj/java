package com.webber;

/**
 * Created by wanpeng on 2017/6/30.
 */
public class Context {
    public final static OpenningState openningState = new OpenningState();
    public final static ClosingState closeState = new ClosingState();
    public final static RunningState runningState = new RunningState();
    public final static StoppingState stoppingState = new StoppingState();

    private LiftState liftState;

    public LiftState getLiftState(){
        return this.liftState;
    }

    public void setLiftState(LiftState liftState){
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }

    public void close(){
        this.liftState.close();
    }

    public void run(){
        this.liftState.run();
    }

    public void stop(){
        this.liftState.stop();
    }

}
