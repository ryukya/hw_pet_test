package org.example.hw_pet_test;

import org.example.hw_pet_test.entities.Order;
import org.example.hw_pet_test.enums.orderStatus;
import org.example.hw_pet_test.steps.OrderServiceSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderServiceTest {
    @Test
    public void createOrderPositiveTest() {
        Order expectedOrder = createOrder(1, orderStatus.placed, 1, 1);
        Order createdOrder = OrderServiceSteps.createOrder(expectedOrder);
        Assert.assertEquals(createdOrder.getPetId(), expectedOrder.getPetId(), "Expected order doesn't have correct pet ID");
    }

    @Test
    public void createOrderNegativeTest1() {
        Order expectedOrder = createOrder(1, orderStatus.delivered, 1, 0);
        Assert.assertNotEquals(expectedOrder.getQuantity(), 0, "Quantity of order should not be 0");
    }

    @Test
    public void getOrderByIdTest() {
        Order order = OrderServiceSteps.getOrderById(1);
        Order order1 = OrderServiceSteps.getOrderById(order.getId());
        Assert.assertEquals(order1.getPetId(), order.getPetId(), "Expected order does not have the  correct pet");
    }

    private Order createOrder(int id, orderStatus state, int petId, int quantity) {
        return new Order()
                .setId(id)
                .setDatetime(java.time.LocalDateTime.now().toString())
                .setOrderState(state)
                .setQuantity(quantity)
                .setPetId(petId)
                .setComplete(true);
    }
}
