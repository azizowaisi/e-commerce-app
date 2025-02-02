package com.teckiz.ecommerce.service.interf;

import com.teckiz.ecommerce.dto.AddressDto;
import com.teckiz.ecommerce.dto.Response;

public interface AddressService {
    Response saveAndUpdateAddress(AddressDto addressDto);
}
