package com.app.example.design.patterns.singleton;

import java.lang.reflect.Constructor;

/**
 * Created by ke on 2015/5/5.
 *
 * Using Reflection to destroy Singleton Pattern
 *
 * Reflection can be used to destroy all the above singleton implementation approaches. Let’s see this
 * with an example class.
 */
public class ReflectionSingletonTest {
    public static void main(String[] args) {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
