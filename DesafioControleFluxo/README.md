# DesafioControleFluxo

DesafioControleFluxo é um programa Java que solicita dois parâmetros do usuário via terminal, e realiza uma contagem com base nesses valores, exibindo a sequência de números no console. O programa também trata uma exceção personalizada caso o segundo valor seja menor que o primeiro.

## Funcionalidades

O programa realiza as seguintes ações:

- Solicita ao usuário dois números inteiros.
- Valida se o segundo número é maior que o primeiro.
- Imprime uma sequência de números com base na diferença entre os valores.
- Exibe uma mensagem de erro personalizada caso os parâmetros estejam incorretos.

## Como executar

Para executar este programa, é necessário ter o Java Development Kit (JDK) instalado em seu sistema. Siga os passos abaixo:

### 1. Salvar os arquivos

Crie dois arquivos Java:

**Contador.java**
```java
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
```

**ParametrosInvalidosException.java**
```java
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
```

### 2. Compilar os arquivos

Abra o terminal no diretório onde os arquivos foram salvos e execute:

```
javac Contador.java ParametrosInvalidosException.java
```

### 3. Executar o programa

```
java Contador
```

## Exemplo de interação

```
Digite o primeiro parâmetro
5
Digite o segundo parâmetro
8
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
```

## Tecnologias utilizadas

- Java

## Autor

Gabriel Castoldi