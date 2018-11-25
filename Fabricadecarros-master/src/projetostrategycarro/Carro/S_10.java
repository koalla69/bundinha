package projetostrategycarro.Carro;

import PadraoFactory.fabricas.FabricaChevrolet;
import PadraoFactory.fabricas.FabricaVolks;

public class S_10 extends Carro implements Observer {

    private Subject subject;
    protected double vS_10;

    public S_10() {

    }

    public void exibirInfo() {
        System.out.println("Modelo: S-10 ");
    }

    public void imprimirResultados() {
        System.out.println("Carro: S_10");
        System.out.println("Valor do Carro: R$" + this.vS_10);

    }

    @Override
    public void atualizar(Subject subject) {

        if (subject instanceof FabricaChevrolet) {
            FabricaChevrolet fabricaChevrolet = (FabricaChevrolet) subject;
            vS_10 = fabricaChevrolet.getValorS_10();
            imprimirResultados();

        }

    }

}
