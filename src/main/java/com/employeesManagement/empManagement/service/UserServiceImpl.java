package com.employeesManagement.empManagement.service;

import com.employeesManagement.empManagement.DTO.UserDTO;
import com.employeesManagement.empManagement.DTO.UserSaveDTO;
import com.employeesManagement.empManagement.DTO.UserUpdateDTO;
import com.employeesManagement.empManagement.entity.Hr;
import com.employeesManagement.empManagement.entity.User;
import com.employeesManagement.empManagement.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public String addUser(UserSaveDTO userSaveDTO) {
        User user = new User(
                userSaveDTO.getUserEmail(),
                userSaveDTO.getUserPass(),
                userSaveDTO.getUserRole()
        );

        userRepo.save(user);
        return user.getUserEmail();
    }

    @Override
    public List<UserDTO> getAllUser() {
        List<User> getUser = userRepo.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();

        for (User user: getUser) {
            UserDTO userDTO = new UserDTO(
                    user.getUserId(),
                    user.getUserEmail(),
                    user.getUserPass(),
                    user.getUserRole()
            );

            userDTOList.add(userDTO);
        }
        return userDTOList;
    }

    @Override
    public String updateUser(UserUpdateDTO userUpdateDTO) {
        if (userRepo.existsById(userUpdateDTO.getUserId())) {
            User user = userRepo.getById(userUpdateDTO.getUserId());

            user.setUserEmail(userUpdateDTO.getUserEmail());
            user.setUserPass(userUpdateDTO.getUserPass());

            userRepo.save(user);

            return "Updated Successfully!";

        } else {
            System.out.println("Customer Id does not exits");
        }

        return null;
    }

    @Override
    public boolean deleteUser(int id) {
        if (userRepo.existsById(id)) {
            userRepo.deleteById(id);
        } else {
            System.out.println("Customer Not found");
        }
        return true;
    }
}
