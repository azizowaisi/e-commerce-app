package com.teckiz.ecommerce.service.definition;

import com.teckiz.ecommerce.dto.AddressDto;
import com.teckiz.ecommerce.dto.Response;

public interface AddressServiceInterface {
    Response saveAndUpdateAddress(AddressDto addressDto);
}
