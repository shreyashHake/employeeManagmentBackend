package com.employeesManagement.empManagement.repository;

import com.employeesManagement.empManagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}