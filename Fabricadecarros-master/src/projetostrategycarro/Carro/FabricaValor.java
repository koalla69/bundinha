
package projetostrategycarro.Carro;

import PadraoFactory.fabricas.FabricaVolks;
import java.util.ArrayList;
import java.util.List;

public class FabricaValor extends FabricaVolks implements Subject{
    private List<Observer> observers;

    public FabricaValor() {
        observers = new ArrayList<>();
    }

    public void atualizarValores(double valorAmarok, double valorS_10, double valorToro) {
        this.valorAmarok = this.valorAmarok;
        //this.valorS_10 = this.valorS_10;
        //this.valorToro = this.valorToro;
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
}
