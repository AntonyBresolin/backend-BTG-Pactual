package com.github.antonybresolin.orderms.factory;

import com.github.antonybresolin.orderms.listener.dto.OrderCreatedEvent;
import com.github.antonybresolin.orderms.listener.dto.OrderItemEvent;

import java.math.BigDecimal;
import java.util.List;

public class OrderCreatedEventFactory {
    public static OrderCreatedEvent buildWithOneItem() {
        var items = new OrderItemEvent("notebook", 1, BigDecimal.valueOf(20.50));
        var event = new OrderCreatedEvent(1L, 2L, List.of(items));

        return event;
    }

    public static OrderCreatedEvent buildWithTwoItems() {
        var item1 = new OrderItemEvent("notebook", 1, BigDecimal.valueOf(20.50));
        var item2 = new OrderItemEvent("mouse", 2, BigDecimal.valueOf(10.50));

        var events = new OrderCreatedEvent(1L, 2L, List.of(item1, item2));

        return events;
    }
}
