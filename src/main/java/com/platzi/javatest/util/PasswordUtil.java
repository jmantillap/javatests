package com.platzi.javatest.util;

public class PasswordUtil {

    public static enum Securitylevel{
        WEAK, MEDIUM, STRONG
    }

    public static Securitylevel assessPassword(String password){

        if (password.length()<8) return Securitylevel.WEAK;
        if (password.matches("[a-zA-Z]+")) return Securitylevel.WEAK;
        if (password.matches("[a-zA-Z0-9]+")) return Securitylevel.MEDIUM;
        return Securitylevel.STRONG;
    }

}
