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

  //@Test(expected = IllegalArgumentException.class)
  //public void nullVowel(){
    //   = countvowel.vowel(null);
    //  assertThrows(IllegalArgumentException.class , countvowel.vowel(null))



  //}

    @Test

    public void specialcharacter(){
    int totalvowel = countvowel.vowel("@!#$%&");
    assertEquals(0, totalvowel);
 }
}