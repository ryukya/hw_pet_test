package org.example.hw_pet_test.entities;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Category {
    private int idCat;
    private  String nameCat;

}
