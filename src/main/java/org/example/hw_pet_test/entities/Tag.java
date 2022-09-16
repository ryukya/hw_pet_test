package org.example.hw_pet_test.entities;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Tag {
    private int id;
    private  String name;
}
