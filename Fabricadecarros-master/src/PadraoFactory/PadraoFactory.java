package PadraoFactory;
//testando o github

import projetostrategycarro.Carro.menuCompraCarro;
import PadraoFactory.fabricas.FabricaChevrolet;
import projetostrategycarro.Carro.Toro;
import PadraoFactory.fabricas.FabricaDeCarro;
import PadraoFactory.fabricas.FabricaFiat;
import projetostrategycarro.Carro.FaroisLed;
import projetostrategycarro.Carro.KitMultimidia;
import projetostrategycarro.Carro.Opcionais;
import projetostrategycarro.Carro.ProtetorCarter;

public class PadraoFactory {

    public static void main(String[] args) {
        
        menuCompraCarro compraCarro = new menuCompraCarro();
        
        compraCarro.MenuPrincipal();
        
        /*
        FabricaDeCarro fabrica2 = new FabricaFiat();
        Toro toro = (Toro) fabrica2.criarCarro();
        toro.imprimirResultados();
        //toro.setValorCarro(150000);
        //toro.imprimirResultados();
        toro.setOpcionais(new KitMultimidia());
        toro.setOpcionais(new FaroisLed());
        toro.setOpcionais(new ProtetorCarter());
        
        toro.imprimirResultados();
        */
        
    }
   
}
