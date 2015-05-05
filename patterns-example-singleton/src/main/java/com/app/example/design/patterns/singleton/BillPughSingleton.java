package com.app.example.design.patterns.singleton;

/**
 * Created by ke on 2015/5/5.
 *
 * Bill Pugh Singleton Implementation
 *
 * Prior to Java 5, java memory model had a lot of issues and above approaches used to fail in certain
 * scenarios where too many threads try to get the instance of the Singleton class simultaneously. So Bill
 * Pugh came up with a different approach to create the Singleton class using a inner static helper class.
 * The Bill Pugh Singleton implementation goes like this;
 */
public class BillPughSingleton {
    private BillPughSingleton(){}

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
