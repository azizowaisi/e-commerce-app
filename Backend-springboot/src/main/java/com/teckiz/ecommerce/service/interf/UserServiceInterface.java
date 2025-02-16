package com.teckiz.ecommerce.service.interf;

import com.teckiz.ecommerce.dto.LoginRequest;
import com.teckiz.ecommerce.dto.Response;
import com.teckiz.ecommerce.dto.UserDto;
import com.teckiz.ecommerce.entity.User;

public interface UserServiceInterface {
    Response registerUser(UserDto registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getLoginUser();
    Response getUserInfoAndOrderHistory();
}
