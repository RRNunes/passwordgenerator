# Gerador de Senha - Projetinho pessoal para fins de estudos

Gerador de Senhas em Java com Interface com HTML, CSS, E JavaScript.

Status: Em progresso...
#### Descrição do Projeto

O projeto é um gerador de senhas seguras utilizando Java como backend e HTML, CSS, E JavaScript para a interface de usuário. O gerador permite ao usuário definir parâmetros como comprimento da senha e tipos de caracteres (letras, números, caracteres especiais).
Este projeto é uma aplicação full-stack de gerador de senhas, utilizando Java com Spring Boot no backend e HTML, CSS, E JavaScript no frontend.

## Requisitos

- Java 
- Maven
- HTML E CSS
- JavaScript 

## Diagrama UML do Sistema
O diagrama UML será simples, com a classe principal do gerador de senha.

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

