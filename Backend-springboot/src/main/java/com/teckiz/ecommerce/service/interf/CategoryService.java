package com.teckiz.ecommerce.service.interf;

import com.teckiz.ecommerce.dto.CategoryDto;
import com.teckiz.ecommerce.dto.Response;

public interface CategoryService {

    Response createCategory(CategoryDto categoryRequest);
    Response updateCategory(Long categoryId, CategoryDto categoryRequest);
    Response getAllCategories();
    Response getCategoryById(Long categoryId);
    Response deleteCategory(Long categoryId);
}
