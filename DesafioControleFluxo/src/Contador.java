import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

// Classe principal do programa
public class Contador {
    public static void main(String[] args) {
        // Cria o objeto Scanner para receber entrada do usuário via terminal
        Scanner terminal = new Scanner(System.in);

        // Solicita o primeiro número ao usuário
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt(); // Lê o primeiro número

        // Solicita o segundo número ao usuário
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt(); // Lê o segundo número

        try {
            // Tenta executar o método contar com os dois parâmetros lidos
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Caso a exceção seja lançada, imprime a mensagem de erro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Fecha o Scanner para liberar o recurso
        terminal.close();
    }

    // Método responsável pela lógica de contagem
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Se o primeiro parâmetro for maior que o segundo, lança exceção customizada
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calcula quantas vezes o laço deverá repetir
        int contagem = parametroDois - parametroUm;

        // Laço de repetição que imprime do 1 até o número de interações
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}