package com.example.testtaskrest.controllers;

import com.example.testtaskrest.service.GetLettersSequenceService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class LetterSequenceTest {

    private  GetLettersSequenceService getLettersSequenceService = new GetLettersSequenceService();

    private LettersSequence lettersSequence = new LettersSequence(getLettersSequenceService);


    @Test
    void shouldReturnHashMapFromStringWithNumOfLettersInReverseOrderOfValue(){

//     lettersSequence.getletters("aaaaabcccc") {"a":5,"c":4,"b":1}
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        map.put('a',5);
        map.put('c',4);
        map.put('b',1);


        // Вызов метода вашего контроллера
        HashMap<Character, Integer> result = lettersSequence.getletters("aaaaabcccc");

        // Проверка ожидаемых результатов
        Assertions.assertEquals(map, result);

    }
}
