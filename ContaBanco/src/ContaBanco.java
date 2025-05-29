import java.util.Scanner; // Importa a classe Scanner para permitir a leitura de dados do terminal.

public class ContaBanco { // Declara a classe principal chamada ContaBanco.
    public static void main(String[] args) { // Método principal.
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário.

        System.out.println("Por favor, digite o número do cliente: "); // Exibe uma mensagem pedindo o nome do cliente.
        String nomeCliente = scanner.nextLine(); // Lê a linha de texto digitada pelo usuário e armazena na variável nomeCliente.

        System.out.println("Por favor, digite o número da agência: "); // Exibe uma mensagem pedindo o número da agência.
        String agencia = scanner.nextLine(); // Lê a linha de texto digitada pelo usuário e armazena na variável agencia.

        System.out.println("Por favor, digite o número da conta: "); // Exibe uma mensagem pedindo o número da conta.
        Integer numeroConta = scanner.nextInt(); // Lê o próximo inteiro digitado pelo usuário e armazena na variável numeroConta.

        System.out.println("Por favor, digite o saldo da conta: "); // Exibe uma mensagem pedindo o saldo da conta.
        Double saldo = scanner.nextDouble(); // Lê o próximo número de ponto flutuante digitado pelo usuário e armazena na variável saldo.

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco." +
                           " Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo +
                           " já esta disponível para saque!"); // Exibe uma mensagem de boas-vindas com os dados da conta inseridos pelo usuário.

        scanner.close(); // Fecha o objeto Scanner para liberar os recursos do sistema.
    }
}