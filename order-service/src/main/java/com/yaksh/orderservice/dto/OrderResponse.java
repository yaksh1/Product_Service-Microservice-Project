package com.yaksh.orderservice.dto;


import com.yaksh.orderservice.model.OrderLineItems;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OrderResponse {
    private Long id;
    private String orderNumber;
    private List<OrderLineItems> orderLineItemsList;
}
