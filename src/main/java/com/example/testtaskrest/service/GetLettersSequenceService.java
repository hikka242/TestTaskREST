package com.example.testtaskrest.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GetLettersSequenceService {
    public HashMap<Character,Integer> getMap(String text){
        HashMap<Character,Integer> mapUnsorted = new HashMap<>();
        for(int i=0;i<text.length();i++){
            if(!mapUnsorted.containsKey(text.charAt(i))){
                mapUnsorted.put(text.charAt(i),1);
            }else {
                mapUnsorted.put(text.charAt(i),mapUnsorted.get(text.charAt(i))+1);
            }
        }
        List<Map.Entry<Character, Integer>> list = new LinkedList<>(mapUnsorted.entrySet());

        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<Character, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
