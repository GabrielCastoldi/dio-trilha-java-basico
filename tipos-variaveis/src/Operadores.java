public class Operadores {
    public static void main(String[] args) {

        // Operadores unários
        System.out.println("\nOperadores unários");
        int x = 10;
        System.out.println("Valor inicial de x: " + x);
        System.out.println("x++ (pós-incremento): " + (x++)); // Imprime 10 e depois incrementa x para 11
        System.out.println("Valor atualizado de x: " + x);
        System.out.println("++x (pré-incremento): " + (++x)); // Incrementa x para 12 e depois imprime
        System.out.println("Valor atualizado de x: " + x);
        System.out.println("x-- (pós-decremento): " + (x--)); // Imprime 12 e depois decrementa x para 11
        System.out.println("Valor atualizado de x: " + x);
        System.out.println("--x (pré-decremento): " + (--x)); // Decrementa x para 10 e depois imprime
        System.out.println("Valor atualizado de x: " + x);

        // Operadores aritméticos
        System.out.println("\nOperadores aritiméticos");
        int a = 10;
        int b = 5;

        System.out.printf("Valor de A: %d. Valor de B: %d\n", a, b);
        System.out.println("Soma: " + (a + b)); // 15
        System.out.println("Subtração: " + (a - b)); // 5
        System.out.println("Multiplicação: " + (a * b)); // 50
        System.out.println("Divisão: " + ((double) a / b)); // 2.0 (com cast para double)
        System.out.println("Módulo: " + (a % b)); // 0

        /*
         * Operador shift (deslocamento para a esquerda)
         * O operador de deslocamento para a esquerda (<<)
         * move os bits de um número para a esquerda,
         * preenchendo os bits vazios com zeros.
         * Cada deslocamento para a esquerda em um número
         * inteiro é equivalente a multiplicar o número
         * por 2 elevado à potência do deslocamento.
         */

        System.out.println("\nOperador shift");
        int num = 10;
        System.out.println("Número: 10");
        System.out.println("Deslocamento para a esquerda (10 << 2): " + (num << 2)); // 40

        // Operadores relacionais
        System.out.println("\nOperadores relacionais");
        boolean igual = (1 == 2);
        boolean diferente = (1 != 2);
        boolean maiorQue = (1 > 2);
        boolean menorQue = (1 < 2);
        System.out.println("1 é gual a 2?: " + igual); // false
        System.out.println("1 é diferente de 2?: " + diferente); // true
        System.out.println("1 é maior que 2?: " + maiorQue); // false
        System.out.println("1 é menor que 2?: " + menorQue); // true

        // Operadores lógicos
        System.out.println("\nOperadores lógicos");
        boolean condicao1 = true;
        boolean condicao2 = false;
        System.out.println("AND lógico (condição1 && condição2): " + (condicao1 && condicao2)); // false
        System.out.println("OR lógico (condição1 || condição2): " + (condicao1 || condicao2)); // true
        System.out.println("NOT lógico (!condicao1): " + (!condicao1)); // false

        // Operador ternário
        System.out.println("\nOperador ternário");
        int idade = 18;
        String mensagem = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println("Mensagem: " + mensagem); // "Maior de idade"
    }
}