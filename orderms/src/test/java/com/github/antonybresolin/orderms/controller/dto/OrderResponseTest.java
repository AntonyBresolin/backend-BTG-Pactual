package com.github.antonybresolin.orderms.controller.dto;

import com.github.antonybresolin.orderms.factory.OrderEntityFactory;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.doReturn;

class OrderResponseTest {
    @Nested
    class FromEntity {

        @Test
        void shouldMapCorrectly () {
            var entity = OrderEntityFactory.build();

            var output = OrderResponse.fromEntity(entity);

            assertEquals(entity.getOrderId(), output.orderId());
            assertEquals(entity.getCustomerId(), output.customerId());
            assertEquals(entity.getTotal(), output.total());
        }
    }

}