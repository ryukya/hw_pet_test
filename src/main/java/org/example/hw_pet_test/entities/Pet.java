package org.example.hw_pet_test.entities;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

import org.example.hw_pet_test.enums.status;

@Data
@Accessors(chain = true)
public class Pet {
    private int id;
    private Category  category;
    private String name;
    private List<Map<String, String>> photoUrls;
    private List<Tag> tags;
    private status statuss;
}
