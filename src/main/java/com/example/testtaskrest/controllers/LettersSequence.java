package com.example.testtaskrest.controllers;


import com.example.testtaskrest.service.GetLettersSequenceService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@AllArgsConstructor
@RestController
public class LettersSequence {


    @Autowired
    private final GetLettersSequenceService getLettersSequenceService;

    @GetMapping("/testAPI")
    public HashMap<Character, Integer> getletters(@RequestParam(value = "text", required = false, defaultValue = "")String text){
        return getLettersSequenceService.getMap(text);
    }


}
