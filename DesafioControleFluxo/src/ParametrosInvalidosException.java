// Define uma classe de exceção personalizada chamada ParametrosInvalidosException
// Ela herda da classe Exception, que é a superclasse para exceções verificadas (checked exceptions)
public class ParametrosInvalidosException extends Exception {

    // Construtor da exceção que recebe uma mensagem personalizada
    public ParametrosInvalidosException(String message) {
        // Chama o construtor da superclasse (Exception) passando a mensagem recebida
        super(message);
    }
}