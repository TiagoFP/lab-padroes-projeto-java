package digitalinnovation;

import digitalinnovation.Facade.Facade;
import digitalinnovation.Singleton.SingletonEager;
import digitalinnovation.Singleton.SingletonLazy;
import digitalinnovation.Singleton.SingletonLazyHolder;
import digitalinnovation.Strategy.Comportamento;
import digitalinnovation.Strategy.ComportamentoAgressivo;
import digitalinnovation.Strategy.ComportamentoDefensivo;
import digitalinnovation.Strategy.ComportamentoNormal;
import digitalinnovation.Strategy.Robo;

public class Test {
   
    public static void main(String[] args) {
        
        //Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Tiago", "55111333");

    }
}
