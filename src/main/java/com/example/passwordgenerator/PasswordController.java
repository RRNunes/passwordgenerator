package com.example.passwordgenerator;

import org.springframework.web.bind.annotation.*;

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



