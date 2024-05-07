package com.yaksh.orderservice.controller;

import com.yaksh.orderservice.dto.OrderRequest;
import com.yaksh.orderservice.dto.OrderResponse;
import com.yaksh.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderController {
    private final OrderService orderService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);
        return "order created successfully";
    }

//    @GetMapping
//    public List<OrderResponse> getOrders(){
//
//    }
}
