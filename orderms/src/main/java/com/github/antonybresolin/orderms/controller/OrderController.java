package com.github.antonybresolin.orderms.controller;

import com.github.antonybresolin.orderms.controller.dto.ApiResponse;
import com.github.antonybresolin.orderms.controller.dto.OrderResponse;
import com.github.antonybresolin.orderms.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/customer/{customerId}/orders")
    public ResponseEntity<ApiResponse<OrderResponse>> listOrders(@RequestParam(name = "page" , defaultValue = "0") int page,
                                                                 @RequestParam(name = "size", defaultValue = "10") int pageSize) {

        return ResponseEntity.ok(null);
    }
}
