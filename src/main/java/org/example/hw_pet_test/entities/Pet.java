package org.example.hw_pet_test.entities;

import groovyjarjarantlr4.v4.misc.OrderedHashMap;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

@Data
@Accessors(chain = true)
public class Pet {
    private int id;
    private Category  category;
    private String name;
    private List<Map<String, String>> photoUrls;
    private List<Tag> tags;
    private String status;
}
