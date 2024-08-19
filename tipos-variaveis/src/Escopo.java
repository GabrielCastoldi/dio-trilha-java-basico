public class Escopo {
    // Variável de classe (escopo de classe)
    private static int w = 10;

    public static void main(String[] args) {
        // Variável local (escopo de método)
        int x = 20;

        System.out.println("Valor de w: " + w);
        System.out.println("Valor de x: " + x);

        // Bloco de código (escopo de bloco)
        {
            // Variável local (escopo de bloco)
            int y = 30;

            System.out.println("Valor de y: " + y);
        }

        // Chamada de método com parâmetro (escopo de método)
        metodoComParametro(40);
    }

    public static void metodoComParametro(int parametro) {
        // Variável local (escopo de método)
        int z = parametro;

        System.out.println("Valor de z: " + z);
    }
}