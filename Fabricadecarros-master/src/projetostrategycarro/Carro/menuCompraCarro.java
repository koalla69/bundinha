package projetostrategycarro.Carro;

import PadraoFactory.MenuStrategy;
import PadraoFactory.fabricas.FabricaChevrolet;
import PadraoFactory.fabricas.FabricaDeCarro;
import PadraoFactory.fabricas.FabricaFiat;
import PadraoFactory.fabricas.FabricaVolks;
import java.util.Scanner;

public class menuCompraCarro extends Amarok{

    public static menuCompraCarro instancia;
    public String n;

    public menuCompraCarro() {
    }

    public static menuCompraCarro getInstancia() {
        if (instancia == null) {
            instancia = new menuCompraCarro();
        }
        return instancia;
    }
    
    
    FabricaDeCarro fabrica = new FabricaVolks();
    FabricaDeCarro fabrica2 = new FabricaFiat();
    FabricaDeCarro fabrica1 = new FabricaChevrolet();

    MenuStrategy menuStrategy = new MenuStrategy();
    Scanner ent = new Scanner(System.in);
    private int opcao, opcao1;
    private boolean continuar = true, continuar1 = true;

    public void MenuCarros(){

        do {
            System.out.println("\n-----------------------------------------------------------");
            System.out.println("---------------------Escolha o seu veículo-----------------\n");
            System.out.println("1  --  VOLKSWAGEN Amarok ");
            System.out.println("2  --  FIAT Toro ");
            System.out.println("3  --  CHEVROLET S-10 ");
            System.out.println("9  --  Voltar ao Menu Principal! ");
            System.out.print("Opção escolhida:");
            opcao1 = ent.nextInt();
            switch (this.opcao1) {
                case 1:
                    Amarok amarok = new Amarok();
                    amarok.imprimirResultados();
                    this.menuStrategy.MenuOpcionais();
                    continuar1 = false;
                    n = "VOLKSWAGEN Amarok";
                    break;
                case 2:
                    Toro toro = (Toro) fabrica2.criarCarro();
                    toro.imprimirResultados();
                    this.menuStrategy.MenuOpcionais();
                    continuar1 = false;
                   
                    break;
                case 3:
                    S_10 s_10 = (S_10) fabrica1.criarCarro();
                    s_10.imprimirResultados();
                    this.menuStrategy.MenuOpcionais();
                    continuar1 = false;
                    break;
                case 9:
                    this.MenuPrincipal();
                    continuar1 = false;
                    break;
                default:
                    System.out.println("Opção invalida! ");
                    break;
            }
        } while (continuar1);
    }

    public void MenuPrincipal() {
        AtualizarValores av = new AtualizarValores();
        do {
            System.out.println("\n-----------------------------------------------------------");
            System.out.println("---------------------------Bem-Vindo-----------------------");
            System.out.println("-----------Diversas ofertas de carros pra você-------------\n");
            System.out.println("1  --  Valores e alterações");
            System.out.println("2  --  Escolher Veículo");
            System.out.println("9  --  Finalizar aplicativo! ");
            System.out.print("Opção escolhida:");
            opcao = ent.nextInt();
            switch (this.opcao) {
                case 1:
                    av.menuAtualizar();
                    continuar = false;
                    break;
                case 2:
                    this.MenuCarros();
                    continuar = false;
                    break;
                case 9:
                    System.out.println("Aplicativo finalizado!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção invalida! ");
                    break;
            }
        } while (continuar);
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public int getOpcao1() {
        return opcao1;
    }

    public void setOpcao1(int opcao1) {
        this.opcao1 = opcao1;
    }
}
