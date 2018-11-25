package projetostrategycarro.Carro;

import PadraoFactory.fabricas.FabricaVolks;

public class Amarok extends Carro implements Observer {

    private Subject subject;
    protected double vAmarok;

    public Amarok() {

    }

    public void exibirInfo() {
        System.out.println("Modelo: Amarok ");
    }

    public void imprimirResultados() {
        System.out.println("Carro: Amarok");
        System.out.println("Valor do Carro: R$" + this.vAmarok);

    }

    @Override
    public void atualizar(Subject subject) {

        if (subject instanceof FabricaVolks) {
            FabricaVolks fabricaVolks = (FabricaVolks) subject;
            vAmarok = fabricaVolks.getValorAmarok();
            imprimirResultados();

        }

    }

}
