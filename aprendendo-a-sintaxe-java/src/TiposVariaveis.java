public class TiposVariaveis {
    public static void main(String[] args) {
        // Tipos primitivos
        byte idadeEmAnos = 30;
        short numeroPequeno = 1000;
        int idade = 30;
        long numeroLongo = 1234567890L; // Note o "L" no final para indicar que é um long
        float altura = 1.75f; // Note o "f" no final para indicar que é um float
        double peso = 70.5;
        char primeiraLetra = 'A';
        boolean temCarro = true;

        // Tipos não primitivos (objetos)
        String nomeCompleto = "Nome Sobrenome";
        Integer numeroInteiroObjeto = Integer.valueOf(42);
        Double alturaObjeto = Double.valueOf(1.75);

        // Exibindo os valores
        System.out.println("Idade em anos (byte): " + idadeEmAnos);
        System.out.println("Número pequeno (short): " + numeroPequeno);
        System.out.println("Idade (int): " + idade);
        System.out.println("Número longo (long): " + numeroLongo);
        System.out.println("Altura (float): " + altura);
        System.out.println("Peso (double): " + peso);
        System.out.println("Primeira letra (char): " + primeiraLetra);
        System.out.println("Tem carro? (boolean)" + temCarro);
        System.out.println("Nome completo (String): " + nomeCompleto);
        System.out.println("Número inteiro (Integer): " + numeroInteiroObjeto);
        System.out.println("Altura (Double): " + alturaObjeto);

        // Exemplo de array
        int[] numeros = { 10, 20, 30, 40, 50 };
        System.out.println("Primeiro número do array: " + numeros[0]);

        // Exemplo de cast (conversão de tipos)
        int valorInteiro = (int) altura;
        System.out.println("Valor inteiro a partir da altura: " + valorInteiro);
    }
}