package com.employeesManagement.empManagement.DTO;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class UserDTO {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String userEmail;
    private String userPass;
    private String userRole;

    public UserDTO() {
    }

    public UserDTO(String userEmail, String userPass, String userRole) {
        this.userEmail = userEmail;
        this.userPass = userPass;
        this.userRole = userRole;
    }

    public UserDTO(int userId, String userEmail, String userPass, String userRole) {
        this.userId = userId;
        this.userEmail = userEmail;
        this.userPass = userPass;
        this.userRole = userRole;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userId=" + userId +
                ", userEmail='" + userEmail + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userRole='" + userRole + '\'' +
                '}';
    }
}
