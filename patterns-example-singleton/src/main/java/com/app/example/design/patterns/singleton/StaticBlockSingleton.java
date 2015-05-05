package com.app.example.design.patterns.singleton;

/**
 * Created by ke on 2015/5/5.
 *
 * Static block initialization
 *
 * Static block initialization implementation is similar to eager initialization, except that
 * instance of class is created in the static block that provides option for exception handling.
 *
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){}

    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}
