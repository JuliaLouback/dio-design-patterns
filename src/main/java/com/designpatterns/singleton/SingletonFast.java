package com.designpatterns.singleton;

public class SingletonFast {
    private static SingletonFast instancia = new SingletonFast();

    private SingletonFast(){}

    public static SingletonFast getInstancia(){
        return instancia;
    }
}
