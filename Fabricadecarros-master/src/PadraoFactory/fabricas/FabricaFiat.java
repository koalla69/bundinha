package PadraoFactory.fabricas;

import projetostrategycarro.Carro.Carro;
import projetostrategycarro.Carro.Toro;
import java.util.ArrayList;
import java.util.List;
import projetostrategycarro.Carro.Observer;
import projetostrategycarro.Carro.Subject;

public class FabricaFiat implements FabricaDeCarro, Subject {

    private List<Observer> observers;

    protected double valorToro;

    @Override
    public Carro criarCarro() {

        return new Toro();

    }

    public FabricaFiat() {
        observers = new ArrayList<>();
    }

    public void atualizar(double valorToro) {
        this.valorToro = valorToro;
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

    public double getValorToro() {
        return valorToro;
    }
    
}
