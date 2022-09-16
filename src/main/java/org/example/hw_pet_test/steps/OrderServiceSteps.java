package org.example.hw_pet_test.steps;

import org.example.hw_pet_test.entities.Order;
import org.example.hw_pet_test.service.OrderService;

import static org.example.hw_pet_test.service.uritemplate.OrderServiceUri.ORDER_BY_ID;
import static org.example.hw_pet_test.service.uritemplate.OrderServiceUri.STORE_ORDERS;

public class OrderServiceSteps {
    private static final OrderService ORDER_SERVICE = OrderService.getInstance();

    public static Order createOrder(Order order1) {
        return ORDER_SERVICE.postRequest(STORE_ORDERS, order1).as(Order.class);
    }

    public static Order getOrderById(int id) {
        return ORDER_SERVICE.getRequest(ORDER_BY_ID, id).as(Order.class);
    }


}
