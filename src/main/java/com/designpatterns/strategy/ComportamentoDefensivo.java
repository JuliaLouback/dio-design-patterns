package com.designpatterns.strategy;

public class ComportamentoDefensivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se na defensiva...");
    }
    
}
