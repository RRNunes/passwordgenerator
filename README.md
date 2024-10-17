# Gerador de Senha

Gerador de Senhas em Java com Interface Angular.

Projeto pessoal para fins de estudos.

#### Descrição do Projeto

O projeto é um gerador de senhas seguras utilizando Java como backend e Angular para a interface de usuário. O gerador permite ao usuário definir parâmetros como comprimento da senha e tipos de caracteres (letras, números, caracteres especiais).
Este projeto é uma aplicação full-stack de gerador de senhas, utilizando Java com Spring Boot no backend e Angular no frontend.

## Requisitos

- Java 11+
- Maven
- Node.js e NPM
- Angular CLI

## Diagrama UML do Sistema
O diagrama UML será simples, com a classe principal do gerador de senha e as interfaces entre o frontend e o backend.

1. Diagrama de Classes UML

```
+-------------------------------------+
|             PasswordGenerator       |
+-------------------------------------+
| - length: int                       |
| - useUpperCase: boolean             |
| - useNumbers: boolean               |
| - useSpecialChars: boolean          |
+-------------------------------------+
| + generatePassword(): String        |
+-------------------------------------+

+-------------------------------------+
|            PasswordController       |
+-------------------------------------+
| - generator: PasswordGenerator      |
+-------------------------------------+
| + getGeneratedPassword(): String    |
+-------------------------------------+

````
2. Diagrama de Componentes

```
+----------------------------------------------------+
| Angular Frontend                                   |
+----------------------------------------------------+
| - Tela: Formulário com parâmetros da senha         |
| - Botão: Gerar Senha                               |
+----------------------------------------------------+

+----------------------------------------------------+
| Backend (Java - Spring Boot)                       |
+----------------------------------------------------+
| - Endpoint: /generate-password                     |
| - Método: POST                                     |
| - Parâmetros: length, useUpperCase, useNumbers,    |
|   useSpecialChars                                  |
+----------------------------------------------------+
