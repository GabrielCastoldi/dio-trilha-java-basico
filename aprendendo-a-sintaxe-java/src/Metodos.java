/*
 * Qual a proposta principal do método?
 * Resposta: a proposta principal do método é encapsular
 * um bloco de código reutilizável que pode ser chamado várias
 * vezes a partir de diferentes partes do programa, facilitando
 * a manutenção, a organização e a reutilização de código.
 * 
 * Qual o tipo de retorno esperado após executar o método?
 * Resposta: o tipo de retorno esperado após executar um método
 * depende do tipo de retorno declarado no método, que pode ser
 * um valor específico (como int, double, boolean, etc.) ou
 * nenhum valor (void).
 * 
 * Quais parâmetros serão necessários para a execução do método?
 * Resposta: os parâmetros necessários para a execução de um
 * método dependem da tarefa que o método precisa realizar e
 * das informações que ele precisa para realizar essa tarefa.
 * 
 * O método possui o risco de apresentar alguma exceção?
 * Resposta: é importante considerar as possíveis excessões
 * que podem ocorrer durante a execução de um método e tratar-as
 * de forma apropriada para garantir a robustez e a confiabilidade
 * do programa.
 * 
 * Qual a visibilidade do método?
 * Resposta:  a visibilidade de um método é importante para
 * controlar o acesso ao método e evitar que ele seja usado
 * indevidamente. É importante escolher a visibilidade mais
 * apropriada para cada método com base no propósito do método
 * e na forma como ele será usado. (public, private, protected
 * e default).
 */

public class Metodos {
    public static void main(String[] args) {
        Metodos exemplo = new Metodos();

        // Chamada do método incrementaContador()
        exemplo.incrementaContador();
        System.out.println("Contador: " + exemplo.getContador());

        // Chamada do método decrementaContador()
        exemplo.decrementaContador();
        System.out.println("Contador: " + exemplo.getContador());

        // Chamada do método soma()
        int resultado = exemplo.soma(2, 3);
        System.out.println("Resultado da soma: " + resultado);

        // Chamada do método imprimeMensagem()
        exemplo.imprimeMensagem("Hello, world!");

    }

    // Atributo da classe
    private int contador = 0;

    // Método que incrementa o contador
    public void incrementaContador() {
        contador++;
    }

    // Método que decrementa o contador
    public void decrementaContador() {
        contador--;
    }

    // Método que retorna o valor do contador
    public int getContador() {
        return contador;
    }

    // Método que soma dois números e retorna o resultado
    public int soma(int a, int b) {
        return a + b;
    }

    // Método que imprime uma mensagem na tela
    public void imprimeMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}