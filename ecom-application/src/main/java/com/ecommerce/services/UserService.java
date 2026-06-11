package com.ecommerce.services;

import com.ecommerce.dto.UserRequestDTO;
import com.ecommerce.dto.UserResponseDTO;

public interface UserService {
    UserResponseDTO createUser(UserRequestDTO requestDTO);
}
