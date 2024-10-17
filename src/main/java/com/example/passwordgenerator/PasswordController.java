package com.example.passwordgenerator;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/password")
public class PasswordController {

    @PostMapping("/generate")
    public String generatePassword(@RequestParam int length, @RequestParam boolean useUpperCase,
                                   @RequestParam boolean useNumbers, @RequestParam boolean useSpecialChars) {
        PasswordGenerator generator = new PasswordGenerator(length, useUpperCase, useNumbers, useSpecialChars);
        return generator.generatePassword();
    }
}
