
package PadraoFactory.fabricas;

import java.util.ArrayList;
import java.util.List;
import projetostrategycarro.Carro.Carro;
import projetostrategycarro.Carro.Amarok;
import projetostrategycarro.Carro.Observer;
import projetostrategycarro.Carro.Subject;

public class FabricaVolks implements FabricaDeCarro, Subject {
    private List<Observer> observers;
    
    protected double valorAmarok;    
       
    @Override
    public Carro criarCarro() {
       
       return new Amarok();
       
    }

    public FabricaVolks() {
        observers = new ArrayList<>();
    }

    public void atualizar(double valorAmarok) {
        this.valorAmarok = valorAmarok;
        notificarObservers();
    }

    @Override
    public void registrarObserver(Observer observer) {

        observers.add(observer);

    }

    @Override
    public void removerObserver(Observer observer) {

        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }

    }

    @Override
    public void notificarObservers() {

        observers.forEach((observer) -> {
            observer.atualizar(this);
        });
        
    }

    public double getValorAmarok() {
        return  valorAmarok;
    }
    
}
