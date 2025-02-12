package com.anxobo;

public class EmailValidator {
    public EmailValidator() {
        // This constructor is implicitly available even if not explicitly declared.
        // But, if you'd like to initialize some values or configurations, you can add logic here.
    }

    // Method to validate the email address
    public boolean isValid(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        
        // Check if the email contains exactly one '@' symbol
        int atIndex = email.indexOf('@');
        if (atIndex == -1 || atIndex != email.lastIndexOf('@')) {
            return false;
        }
        
        // Check if the domain part (after '@') contains at least one '.' symbol
        String domain = email.substring(atIndex + 1);
        if (domain.indexOf('.') == -1) {
            return false;
        }
    
        // Check that there is at least one character before the '@'
        String localPart = email.substring(0, atIndex);
        if (localPart.isEmpty()) {
            return false;
        }
    
        // Email is valid if it passes all checks
        return true;
    }
}

