package projetostrategycarro.Carro;

public interface Subject {

    public void registrarObserver(Observer observer);

    public void removerObserver(Observer observer);

    public void notificarObservers();
}
