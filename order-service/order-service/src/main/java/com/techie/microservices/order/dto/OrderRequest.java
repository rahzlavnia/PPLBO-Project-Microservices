package com.techie.microservices.order.dto;

import java.math.BigDecimal;

public record OrderRequest(Long id, String orderNumber, String skuCode,
                           BigDecimal price, int quantity, UserDetails userDetails) {

    public record UserDetails(String email, String firstName, String lastName) {}
}
