package com.teckiz.ecommerce.service.definition;

import com.teckiz.ecommerce.dto.Response;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

public interface ProductServiceInterface {

    Response createProduct(Long categoryId, MultipartFile image, String name, String description, BigDecimal price);
    Response updateProduct(Long productId, Long categoryId, MultipartFile image, String name, String description, BigDecimal price);
    Response deleteProduct(Long productId);
    Response getProductById(Long productId);
    Response getAllProducts();
    Response getProductsByCategory(Long categoryId);
    Response searchProduct(String searchValue);
}
