package io.pragra.learning.main;

@FunctionalInterface
public interface Greeting {
    String greeting(String name);
    default int getLangCode(){
        return 1;
    }
}
