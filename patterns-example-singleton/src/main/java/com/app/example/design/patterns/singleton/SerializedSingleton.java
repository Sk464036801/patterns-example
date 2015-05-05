package com.app.example.design.patterns.singleton;

import java.io.Serializable;

/**
 * Created by ke on 2015/5/5.
 */
public class SerializedSingleton implements Serializable {

    private SerializedSingleton(){}

    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }
}
