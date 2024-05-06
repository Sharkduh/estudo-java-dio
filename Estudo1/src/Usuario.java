public class Usuario {
    public static void main(String[] args) throws Exception {
          
          SmartTv smartTv = new SmartTv();
        
               System.out.println("tv esta " + smartTv.ligar);
               System.out.println("o canal esta no " + smartTv.canal);
               System.out.println("o volume atual " + smartTv.volume);
          
          smartTv.desligarTv();
               System.out.println("tv esta " + smartTv.ligar);

          smartTv.mudarCanal(32);
          smartTv.aumentarCanal();
          smartTv.aumentarCanal();
          smartTv.aumentarCanal();
          smartTv.diminuirCanal();
          smartTv.diminuirCanal();
               System.out.println("tv esta no canal " + smartTv.canal);
               
          
          smartTv.diminuirVolume();
          smartTv.aumentarVolume();
          smartTv.aumentarVolume();
          smartTv.aumentarVolume();
               System.out.println(smartTv.volume);
              
     }

     
}
