package com.designpatterns;

import com.designpatterns.facade.Facade;
import com.designpatterns.singleton.SingletonFast;
import com.designpatterns.singleton.SingletonLazy;
import com.designpatterns.singleton.SingletonLazyHolder;
import com.designpatterns.strategy.Comportamento;
import com.designpatterns.strategy.ComportamentoAgressivo;
import com.designpatterns.strategy.ComportamentoDefensivo;
import com.designpatterns.strategy.ComportamentoNormal;
import com.designpatterns.strategy.Robo;

public class Main {
    public static void main(String[] args) {
        // Teste Singleton
        System.out.println(SingletonLazy.getInstancia());
        System.out.println(SingletonLazy.getInstancia());

        System.out.println(SingletonFast.getInstancia());
        System.out.println(SingletonFast.getInstancia());

        System.out.println(SingletonLazyHolder.getInstancia());
        System.out.println(SingletonLazyHolder.getInstancia());

        // Teste Strategy 
        Comportamento comportamentoNormal = new ComportamentoNormal();
        Comportamento comportamentoDefensivo = new ComportamentoDefensivo();
        Comportamento comportamentoAgressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(comportamentoNormal);
        robo.mover();
        
        robo.setComportamento(comportamentoDefensivo);
        robo.mover();

        robo.setComportamento(comportamentoAgressivo);
        robo.mover();
        
        // Facade
        Facade migrarCliente = new Facade();
        migrarCliente.migrarCliente("Julia", "81900240");
    }
}