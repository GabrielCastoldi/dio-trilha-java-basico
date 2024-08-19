public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual:  " + smartTv.canal);
        System.out.println("Volume atual:  " + smartTv.volume);

        smartTv.ligar();

        System.out.println("Novo status. TV Ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume atual:  " + smartTv.volume);

        smartTv.mudarCanal(13);

        System.out.println("Canal atual:  " + smartTv.canal);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();

        System.out.println("Canal atual:  " + smartTv.canal);

        smartTv.desligar();

        System.out.println("Novo status. TV Ligada? " + smartTv.ligada);
    }
}