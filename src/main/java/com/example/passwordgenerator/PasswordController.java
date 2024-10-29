package com.example.passwordgenerator;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/password")
public class PasswordController {

    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping("/generate")
    public String generatePassword(@RequestBody Map<String, Object> requestData) { 
        int length = (int) requestData.get("length"); 
        boolean useUpperCase = (boolean) requestData.get("useUpperCase"); 
        boolean useNumbers = (boolean) requestData.get("useNumbers"); 
        boolean useSpecialChars = (boolean) requestData.get("useSpecialChars"); 
        PasswordGenerator generator = new PasswordGenerator(length, useUpperCase, useNumbers, useSpecialChars); 
        return generator.generatePassword();
    }
}



