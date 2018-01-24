package com.abhinaya;

import java.lang.annotation.Target;

import org.junit.Test;
import com.abhinaya.Division;

public class DivisionTest{
    @Test
    public void testDiv(){
        int a = 70;
        int b = 20;

        Division division = new Division();
        int c = division.division(a, b);
        System.out.println(c);
    
    }
}