package com.platzi.javatest.util;


public class StringUtilTest1 {

    public static void main(String[] args) {
        String result= StringUtil.repeat("Hola",3);
        assertEquals(result,"holahola");
        if (!result.equals("holahola")){
            throw new RuntimeException("Error");
        }
        System.out.println(result);
        String result2= StringUtil.repeat("hola",1);
        if (!result.equals("hola")){
            throw new RuntimeException("Error");
        }
        System.out.println(result2);
    }

    private static void assertEquals(String actual, String expected) {

        if (!actual.equals(expected)) {
            throw new RuntimeException(actual + " is not equal to expected " + expected);
        }
    }
}