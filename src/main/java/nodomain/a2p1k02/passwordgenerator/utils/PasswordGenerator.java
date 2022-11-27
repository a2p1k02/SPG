package nodomain.a2p1k02.passwordgenerator.utils;

import java.util.Random;

public class PasswordGenerator {
    private final String upperCase = "ABCDEFGHIKLMNOPQRSTVWXYZ";
    private final String lowerCase = upperCase.toLowerCase();
    private final String digits = "0123456789";
    private final String symbols = "!@#$%^&*_";
    protected final String combined = upperCase + digits + lowerCase + symbols;

    private StringBuilder finalPassword;

    public String passwd(int passwordLength) {
        finalPassword = new StringBuilder();
        Random random = new Random();

        final char[] password = new char[passwordLength];
        for (int i = 0; i < passwordLength; i++) {
            password[i] = combined.charAt(random.nextInt(combined.length()));
        }
        for (char symbol : password) {
            this.finalPassword.append(symbol);
        }

        return finalPassword.toString();
    }

}
