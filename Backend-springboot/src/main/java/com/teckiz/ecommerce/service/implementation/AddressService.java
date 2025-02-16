package com.teckiz.ecommerce.service.implementation;

import com.teckiz.ecommerce.dto.AddressDto;
import com.teckiz.ecommerce.dto.Response;
import com.teckiz.ecommerce.entity.Address;
import com.teckiz.ecommerce.entity.User;
import com.teckiz.ecommerce.repository.AddressRepository;
import com.teckiz.ecommerce.service.definition.AddressServiceInterface;
import com.teckiz.ecommerce.service.definition.UserServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService implements AddressServiceInterface {

    private final AddressRepository addressRepo;
    private final UserServiceInterface userService;


    @Override
    public Response saveAndUpdateAddress(AddressDto addressDto) {
        User user = userService.getLoginUser();
        Address address = user.getAddress();

        if (address == null){
            address = new Address();
            address.setUser(user);
        }
        if (addressDto.getStreet() != null) address.setStreet(addressDto.getStreet());
        if (addressDto.getCity() != null) address.setCity(addressDto.getCity());
        if (addressDto.getState() != null) address.setState(addressDto.getState());
        if (addressDto.getZipCode() != null) address.setZipCode(addressDto.getZipCode());
        if (addressDto.getCountry() != null) address.setCountry(addressDto.getCountry());

        addressRepo.save(address);

        String message = (user.getAddress() == null) ? "Address successfully created" : "Address successfully updated";
        return Response.builder()
                .status(200)
                .message(message)
                .build();
    }
}
