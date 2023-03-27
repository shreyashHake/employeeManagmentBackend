package com.employeesManagement.empManagement.DTO;

public class UserUpdateDTO {
    private int userId;
    private String userEmail;
    private String userPass;
    private String userRole;

    public UserUpdateDTO() {
    }

    public UserUpdateDTO(int userId, String userEmail, String userPass, String userRole) {
       this.userId = userId;
        this.userEmail = userEmail;
        this.userPass = userPass;
        this.userRole = userRole;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserUpdateDTO{" +
                "userId=" + userId +
                ", userEmail='" + userEmail + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userRole='" + userRole + '\'' +
                '}';
    }
}
