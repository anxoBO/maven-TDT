package com.anxobo;

public class EmailValidator {

    public boolean isValid(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        int arroba = email.indexOf('@');
        int punto = email.lastIndexOf('.');

        if (arroba <= 0 || punto <= arroba || punto >= email.length() - 1) {
            return false;
        }

        String domain = email.substring(arroba + 1);
        if (domain.startsWith(".")) {
            return false;
        }

        return true;
    }
}