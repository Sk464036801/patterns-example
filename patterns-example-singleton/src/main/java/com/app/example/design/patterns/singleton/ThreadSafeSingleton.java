package com.app.example.design.patterns.singleton;

/**
 * Created by ke on 2015/5/5.
 *
 * Thread Safe Singleton
 *
 * The easier way to create a thread-safe singleton class is to make the global access method synchronized,
 * so that only one thread can execute this method at a time. General implementation of this approach is like the
 * below class.
 *
 * http://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-with-examples
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    /**
     * Below code snippet provides the double checked locking implementation.
     * @return
     */
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class) {
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
