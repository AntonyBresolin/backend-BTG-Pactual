package com.github.antonybresolin.orderms.listener;

import com.github.antonybresolin.orderms.config.RabbitMqConfig;
import com.github.antonybresolin.orderms.listener.dto.OrderCreatedEvent;
import com.github.antonybresolin.orderms.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class OrderCreatedListener {

    private final Logger logger = LoggerFactory.getLogger(OrderCreatedListener.class);

    private final OrderService orderService;

    public OrderCreatedListener(OrderService orderService) {
        this.orderService = orderService;
    }

    @RabbitListener(queues = RabbitMqConfig.ORDER_CREATED_QUEUE)
    public void listen(Message<OrderCreatedEvent> message){
        logger.info("Message received: {}", message);
        orderService.save(message.getPayload());
    }


}
