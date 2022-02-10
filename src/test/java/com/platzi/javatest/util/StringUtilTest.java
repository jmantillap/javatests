package com.platzi.javatest.util;


public class StringUtilTest {

    public static void main(String[] args) {
         String result= StringUtil.repeat("Hola",3);
         System.out.println(result);

        String result2= StringUtil.repeat("Hola",1);
        System.out.println(result2);
    }
}