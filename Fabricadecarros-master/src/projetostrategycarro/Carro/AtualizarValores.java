package projetostrategycarro.Carro;

import PadraoFactory.fabricas.FabricaChevrolet;
import PadraoFactory.fabricas.FabricaFiat;
import PadraoFactory.fabricas.FabricaVolks;
import java.util.Scanner;

public class AtualizarValores implements ValorInterface {

    menuCompraCarro compraCarro = new menuCompraCarro();

    Scanner ent = new Scanner(System.in);
    private int opcao;
    private boolean continuar = true, continuar1 = true;
    protected double vAmarok = 187000, vS_10 = 180000, vToro = 135000;

    @Override
    public void atualizarValor() {

        FabricaVolks fabricaVolks = new FabricaValor();
        FabricaChevrolet fabricaChevrolet = new FabricaChevrolet();
        FabricaFiat fabricaFiat = new FabricaFiat();

        System.out.print("Novo valor Amarok: \nR$");
        vAmarok = ent.nextDouble();
        System.out.print("Novo valor Toro: \nR$");
        vToro = ent.nextDouble();
        System.out.print("Novo valor S-10: \nR$");
        vS_10 = ent.nextDouble();
        fabricaVolks.atualizar(vAmarok);
        fabricaFiat.atualizar(vToro);
        fabricaChevrolet.atualizar(vS_10);
        this.valoresAtualizados();

    }

    @Override
    public void menuAtualizar() {

        do {
            System.out.println("----------------------------------------------");
            System.out.println("---------------Administrador------------------");
            System.out.println("1  --  Pesquisar valores");
            System.out.println("2  --  Atualizar valores");
            System.out.println("9  --  Voltar ao Menu inicial");
            opcao = ent.nextInt();
            switch (this.opcao) {
                case 1:

                    this.valoresAtualizados();
                    this.menuAtualizar();
                    continuar1 = false;
                    break;
                case 2:
                    this.atualizarValor();
                    this.menuAtualizar();
                    continuar1 = false;
                    break;
                case 9:
                    compraCarro.MenuPrincipal();
                    continuar1 = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (continuar1);
    }

    @Override
    public void valoresAtualizados() {
        System.out.println("VOLKSWAGEN Amarok a partir de: R$" + vAmarok);
        System.out.println("FIAT Toro a partir de: R$" + vToro);
        System.out.println("CHEVROLET S-10 a partir de: R$" + vS_10);
    }

}
