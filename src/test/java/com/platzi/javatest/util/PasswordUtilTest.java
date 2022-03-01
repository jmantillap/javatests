package com.platzi.javatest.util;

import org.junit.Test;
import static com.platzi.javatest.util.PasswordUtil.Securitylevel.*;

import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters(){
       assertEquals(WEAK,PasswordUtil.assessPassword("12345!"));
    }

    @Test
    public void weak_when_has_only_letters(){
        assertEquals(WEAK,PasswordUtil.assessPassword("asdadadadasdas"));
    }

    @Test
    public void medium_when_has_letters_and_numbers(){
        assertEquals(MEDIUM,PasswordUtil.assessPassword("asa45525adasdas"));
    }

    @Test
    public void string_when_has_letters_and_numbers_and_simbols(){
        assertEquals(STRONG,PasswordUtil.assessPassword("abcnd1254!"));
    }

}