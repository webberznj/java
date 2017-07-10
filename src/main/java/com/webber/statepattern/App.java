package com.webber.statepattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Context context = new Context();
        context.setLiftState(Context.closeState);
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
