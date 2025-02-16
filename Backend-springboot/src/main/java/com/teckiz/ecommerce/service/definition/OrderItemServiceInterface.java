package com.teckiz.ecommerce.service.definition;

import com.teckiz.ecommerce.dto.OrderRequest;
import com.teckiz.ecommerce.dto.Response;
import com.teckiz.ecommerce.enums.OrderStatus;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;

public interface OrderItemServiceInterface {
    Response placeOrder(OrderRequest orderRequest);
    Response updateOrderItemStatus(Long orderItemId, String status);
    Response filterOrderItems(OrderStatus status, LocalDateTime startDate, LocalDateTime endDate, Long itemId, Pageable pageable);
}
