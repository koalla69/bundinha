package PadraoFactory.fabricas;

import java.util.ArrayList;
import java.util.List;
import projetostrategycarro.Carro.Carro;
import projetostrategycarro.Carro.Observer;
import projetostrategycarro.Carro.S_10;
import projetostrategycarro.Carro.Subject;

public class FabricaChevrolet implements FabricaDeCarro, Subject {

    private List<Observer> observers;
    
    protected double valorS_10;    
       
    @Override
    public Carro criarCarro() {
       
       return new S_10();
       
    }

    public FabricaChevrolet() {
        observers = new ArrayList<>();
    }

    public void atualizar(double valorS_10) {
        this.valorS_10 = valorS_10;
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

    public double getValorS_10() {
        return valorS_10;
    }

}
