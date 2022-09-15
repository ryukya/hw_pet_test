package org.example.hw_pet_test.entities;

import groovyjarjarantlr4.v4.misc.OrderedHashMap;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

@Data
@Accessors(chain = true)
public class Pet {
    private int id;
    private Category  category;
    private String name;
    private TreeMap<String,String> photoUrls;
    private TreeMap<Integer,String> tags;
    private String status;
}
