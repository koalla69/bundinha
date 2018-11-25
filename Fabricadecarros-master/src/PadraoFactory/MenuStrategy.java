package PadraoFactory;

import projetostrategycarro.Carro.menuCompraCarro;
import java.util.Scanner;
import projetostrategycarro.Carro.Carro;

public class MenuStrategy extends Carro{

    Scanner ent = new Scanner(System.in);
    private int opcao2;
    private String opcao3;
    private boolean continuar2 = true;

    public void MenuOpcionais() {

        do {
            System.out.println("\n------------------------------------------------------------");
            System.out.println("------------Escolha 1 opcional para o seu veículo-------------\n");
            System.out.println("1  --  Protetor de carter R$180,00");
            System.out.println("2  --  Farois em LED R$1.680,00");
            System.out.println("3  --  Kit multimídia R$1.450,00");
            System.out.println("5  --  Sem opcionais ");
            System.out.println("6  --  Visualizar seu veículo!");
            System.out.println("9  --  Menu Principal ");
            System.out.print("Opcionais escolhidos: ");
            opcao2 = ent.nextInt();
            switch(this.opcao2){
            case 1:
                    
                    System.out.print("Visualizar Veículo escolhido? yes/no :");
                    this.opcao3 = ent.next();
                    switch (this.opcao3) {
                        case "yes":
                            menuCompraCarro menuCarro = menuCompraCarro.getInstancia();
                            System.out.println("Carro: " + menuCarro.n + "Opcionais: Protetor de carter.");
                            break;
                        case "no":
                            break;
                        default:
                            System.out.println("Opção invalida!");
                            break;
                    }
                    break;
                case 2:

                    System.out.print("Visualizar Veículo escolhido? y/n :");
                    this.opcao2 = ent.nextInt();
                    switch (this.opcao2) {
                        case 'y':
                            break;
                        case 'n':
                            break;
                        default:
                            System.out.println("Opção invalida!");
                            break;
                    }
                    break;
                case 3:

                    System.out.print("Visualizar Veículo escolhido? y/n :");
                    this.opcao2 = ent.nextInt();
                    switch (this.opcao2) {
                        case 'y':
                            break;
                        case 'n':
                            break;
                        default:
                            System.out.println("Opção invalida!");
                            break;
                    }
                    break;
                case 5:

                    System.out.print("Visualizar Veículo escolhido? y/n :");
                    this.opcao2 = ent.nextInt();
                    switch (this.opcao2) {
                        case 'y':
                            break;
                        case 'n':
                            break;
                        default:
                            System.out.println("Opção invalida!");
                            break;
                    }
                    break;
                case 9:
                    menuCompraCarro menuCarro = menuCompraCarro.getInstancia();
                    menuCarro.MenuPrincipal();
                    continuar2 = false;
                    break;
                default:
                    System.out.println("Opção invalida! ");
                    break;
        }
        } while (continuar2);
    }
}
