package com.example.orderservice.vo;

import lombok.Data;

@Data
public class RequestOrder {
    private String productId;
    private Integer qty;
    // TODO : business domain 마다 다름
    private Integer unitPrice;
}
