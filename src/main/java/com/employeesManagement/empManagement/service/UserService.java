package com.employeesManagement.empManagement.service;

import com.employeesManagement.empManagement.DTO.HrUpdateDTO;
import com.employeesManagement.empManagement.DTO.UserDTO;
import com.employeesManagement.empManagement.DTO.UserSaveDTO;
import com.employeesManagement.empManagement.DTO.UserUpdateDTO;

import java.util.List;

public interface UserService {
    String addUser(UserSaveDTO userSaveDTO);

    List<UserDTO> getAllUser();

    String updateUser(UserUpdateDTO userUpdateDTO);

    boolean deleteUser(int id);
}
