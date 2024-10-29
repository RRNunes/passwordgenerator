package com.example.passwordgenerator;

import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/api/password")
public class PasswordController {

    @PostMapping("/generate")
    public String generatePassword(@RequestBody PasswordRequest request) {
        int length = request.getLength();

        // Verifica o numero de caracteres menor que 4
        if (length < 4) {
            return "Erro: O comprimento da senha deve ser de no mínimo 4 caracteres.";
        }

        //Conjunto de caracteres
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()-_+=<>?";

        StringBuilder characterSet = new StringBuilder();

        // Add os conjuntos de caracteres com base nas escolhas do usuario
        if (request.isUseUpperCase()) {
            characterSet.append(upperCaseLetters);
        }
        if (request.isUseNumbers()) {
            characterSet.append(numbers);
        }
        if (request.isUseSpecialChars()) {
            characterSet.append(specialChars);
        }
        // Casa nenhum conjunto de caracteres seja escolhido, incluiletras minusculas por padrao
        if (characterSet.length() == 0) {
            characterSet.append("abcdefghijklmnopqrstuvwxyz");
        }
        // Gera a senha
        StringBuilder passaword = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterSet.length());
            passaword.append(characterSet.charAt(index));
        }
        return  passaword.toString();
    }
}
