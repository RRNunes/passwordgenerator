package com.example.passwordgenerator;

import java.security.SecureRandom;

public class PasswordGenerator {
    private int length;
    private boolean useUpperCase;
    private boolean useNumbers;
    private boolean useSpecialChars;

    public PasswordGenerator(int length, boolean useUpperCase, boolean useNumbers, boolean useSpecialChars) {
        this.length = length;
        this.useUpperCase = useUpperCase;
        this.useNumbers = useNumbers;
        this.useSpecialChars = useSpecialChars;
    }

    public String generatePassword() {
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()-_";

        String base = lowerCase;
        if (useUpperCase) base += upperCase;
        if (useNumbers) base += numbers;
        if (useSpecialChars) base += specialChars;

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(base.length());
            password.append(base.charAt(index));
        }
        return password.toString();
    }
}
