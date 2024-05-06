public class SmartTv{
    boolean ligar = true;
    int canal = 1;
    int volume = 20;

    public void ligarTv(){
        ligar = true;
    }

    public void desligarTv(){
        ligar = false;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }


    public void aumentarCanal(){
        canal ++;
    }

    public void diminuirCanal(){
        canal --;
    }

    public void aumentarVolume(){
        volume ++;
    }

    public void diminuirVolume(){
        volume --;
    }


}
