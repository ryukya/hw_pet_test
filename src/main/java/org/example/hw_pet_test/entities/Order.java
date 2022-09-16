package org.example.hw_pet_test.entities;

import lombok.Data;
import lombok.experimental.Accessors;
import org.example.hw_pet_test.enums.orderStatus;

@Data
@Accessors(chain = true)
public class Order {
    private int id;
    private int petId;
    private int quantity;
    private String datetime;
    private orderStatus orderState;
    private boolean complete;
}
