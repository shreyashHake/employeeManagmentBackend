package com.employeesManagement.empManagement.controller;

import com.employeesManagement.empManagement.DTO.*;
import com.employeesManagement.empManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(path = "/save")
    public String saveUser(@RequestBody UserSaveDTO userSaveDTO) {
        return userService.addUser(userSaveDTO);
    }

    @GetMapping(path = "/get")
    public List<UserDTO> getAllUser() {
        List<UserDTO> allUsers = userService.getAllUser();
        return allUsers;
    }


    @PutMapping(path = "/update")
    public String updatUser(@RequestBody UserUpdateDTO userUpdateDTO) {
        return userService.updateUser(userUpdateDTO);
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteUser(@PathVariable(value = "id") int id) {
        boolean deleteUser = userService.deleteUser(id);
        return "deleted";
    }

}
