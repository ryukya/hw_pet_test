package org.example.hw_pet_test.entities;

import lombok.Data;
import lombok.experimental.Accessors;
import org.example.hw_pet_test.enums.status;

import java.util.List;

@Data
@Accessors(chain = true)
public class Pet {
    private int id;
    private Category category;
    private String name;
    private List<String> photoUrls;
    private List<Tag> tags;
    private status statuss;
}
