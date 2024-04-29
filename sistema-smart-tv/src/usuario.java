public class usuario {
    
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        smartTV.mudarCanal(15);
        smartTV.aumentarCanal();
        smartTV.diminuirCanal();
        smartTV.diminuirCanal();

        System.out.println("A TV esta ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar ();
            System.out.println("Novo status -> A TV esta ligada? " + smartTV.ligada);

        smartTV.desligar();
            System.out.println("Novo status -> A TV esta ligada? " + smartTV.ligada);


    }


}
