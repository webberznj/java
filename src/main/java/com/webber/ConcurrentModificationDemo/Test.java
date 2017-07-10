package com.webber.ConcurrentModificationDemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by wanpeng on 2017/7/4.
 */
public class Test {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer integer = iterator.next();
            if(integer == 2){
                //list.remove(integer); //modCount和expectedModCount不等抛ConcurrentModificationException
                iterator.remove();
            }
        }
    }
}
