
package projetostrategycarro.Carro;

import PadraoFactory.fabricas.FabricaFiat;


public class Toro extends Carro implements Observer{
 private Subject subject;
    protected double vToro;

    public Toro() {

    }

    public void exibirInfo() {
        System.out.println("Modelo: Toro ");
    }

    public void imprimirResultados() {
        System.out.println("Carro: Toro");
        System.out.println("Valor do Carro: R$" + this.vToro);

    }

    @Override
    public void atualizar(Subject subject) {

        if (subject instanceof FabricaFiat) {
            FabricaFiat fabricaFiat = (FabricaFiat) subject;
            vToro = fabricaFiat.getValorToro();
            imprimirResultados();
            //mostrarValores();

        }

    }
}
