package com.example.passwordgenerator;


public class PasswordRequest {
    private int length;
    private boolean useUpperCase;
    private boolean useNumbers;
    private boolean useSpecialChars;


    // Getters e Setters

    public int getLength() { return length; }
    public void setLength(int length) { this.length = length; }

    public boolean isUseUpperCase() { return useUpperCase; }
    public void setUseUpperCase(boolean useUpperCase) { this.useUpperCase = useUpperCase; }

    public boolean isUseNumbers() { return useNumbers; }
    public void setUseNumbers(boolean useNumbers) { this.useNumbers = useNumbers; }

    public boolean isUseSpecialChars() { return useSpecialChars; }
    public void setUseSpecialChars(boolean useSpecialChars) { this.useSpecialChars = useSpecialChars; }



}
