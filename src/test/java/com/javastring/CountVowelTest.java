package com.javastring;


import static org.junit.Assert.*;
import org.junit.Test;


public class CountVowelTest  {
  CountVowel countvowel = new CountVowel();


    @Test

    public void vowel(){
      int totalvowel = countvowel.vowel("surabhi");
      assertEquals(3,totalvowel);
    }



    @Test

    public void specialcharacter(){
    int totalvowel = countvowel.vowel("@!#$%&");

 }
}