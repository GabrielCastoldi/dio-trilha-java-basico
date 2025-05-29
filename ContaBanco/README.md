# ContaBanco

**ContaBanco** é um programa simples em Java que interage com o usuário via terminal, coletando informações sobre uma conta bancária e exibindo uma mensagem de boas-vindas com os dados fornecidos.

## Funcionalidades

O programa realiza as seguintes ações:

1. Solicita ao usuário o nome do cliente.  
2. Solicita o número da agência.  
3. Solicita o número da conta.  
4. Solicita o saldo inicial da conta.  
5. Exibe uma mensagem de boas-vindas personalizada com as informações fornecidas.

## Como executar

Para executar este programa, é necessário ter o **Java Development Kit (JDK)** instalado em seu sistema. Siga os passos abaixo:

### 1. Salvar o código

Salve o código Java em um arquivo chamado `ContaBanco.java`.

### 2. Compilar o código

Abra o terminal (ou prompt de comando), navegue até o diretório onde o arquivo foi salvo e execute:

```bash
javac ContaBanco.java
```

Isso irá gerar um arquivo chamado `ContaBanco.class`.

### 3. Executar o programa

No mesmo terminal, execute:

```bash
java ContaBanco
```

O programa solicitará as informações da conta passo a passo.

## Exemplo de interação

```text
Por favor, digite o nome do cliente:
Gabriel Castoldi
Por favor, digite o número da agência:
1234-5
Por favor, digite o número da conta:
9876
Por favor, digite o saldo da conta:
1500.75
Olá Gabriel Castoldi, obrigado por criar uma conta em nosso banco. Sua agência é 1234-5, conta 9876 e seu saldo 1500.75 já está disponível para saque!
```

## Tecnologias utilizadas

- Java

## Autor

Gabriel Castoldi