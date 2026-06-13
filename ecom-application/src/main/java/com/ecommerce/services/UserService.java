package com.ecommerce.services;

import com.ecommerce.dto.UserRequestDTO;
import com.ecommerce.dto.UserResponseDTO;

import java.util.List;

public interface UserService {
    UserResponseDTO createUser(UserRequestDTO requestDTO);

    UserResponseDTO getUserById(Long id);

   // UserResponseDTO updateUser(Long id, UserRequestDTO requestDTO);

    List<UserResponseDTO> getAllUsers();

}
