
package projetostrategycarro.Carro;


public abstract class Carro {
    
    //protected double valorAmarok;
    //protected double valorS_10=180000;
    //protected double valorToro=135000;
    
    protected Opcionais opcionais;
    protected Opcionais FaroisLed;
    protected Opcionais KitMultimidia;
    protected Opcionais ProtetorCarter;
    
    
    public Carro(){
        
    }
    
    public void setOpcionais(Opcionais Opcionais){
        this.opcionais = opcionais;
        //this.valorCarro += opcionais[].getValorCarro;
    }

    public Opcionais getOpcionais() {
        return opcionais;
    }

    public Opcionais getFaroisLed() {
        return FaroisLed;
    }

    public void setFaroisLed(Opcionais FaroiLed) {
        //valorCarro += FaroisLed.getValorOpcionais();
        this.FaroisLed = FaroiLed;
    }

    public Opcionais getKitMultimidia() {
        return KitMultimidia;
    }

    public void setKitMultimidia(Opcionais KitMultimidia) {
        //valorCarro += KitMultimidia.getValorOpcionais();
        this.KitMultimidia = KitMultimidia;
    }

    public Opcionais getProtetorCarter() {
        return ProtetorCarter;
    }

    public void setProtetorCarter(Opcionais ProtetorCarter) {
        //valorCarro += ProtetorCarter.getValorOpcionais();
        this.ProtetorCarter = this.ProtetorCarter;
    }
    /*
    public double getValorAmarok() {
        return valorAmarok;
    }

    public void setValorAmarok(double valorAmarok) {
        this.valorAmarok = this.valorAmarok;
    }

    public double getValorS_10() {
        return valorS_10;
    }

    public void setValorS_10(double valorS_10) {
        this.valorS_10 = this.valorS_10;
    }

    public double getValorToro() {
        return valorToro;
    }

    public void setValorToro(double valorToro) {
        this.valorToro = valorToro;
    }
    */
}
