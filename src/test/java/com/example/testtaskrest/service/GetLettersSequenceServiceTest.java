package com.example.testtaskrest.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class GetLettersSequenceServiceTest {
    private GetLettersSequenceService getLettersSequenceService =new GetLettersSequenceService();

    @Test
    void IfDataCorrectFromService(){
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        map.put('a',5);
        map.put('c',4);
        map.put('b',1);
        Assertions.assertEquals(map,getLettersSequenceService.getMap("aaaaabcccc"));
    }
}
