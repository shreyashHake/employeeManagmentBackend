package com.employeesManagement.empManagement.DTO;

public class UserSaveDTO {
    private String userEmail;
    private String userPass;
    private String userRole;

    public UserSaveDTO() {
    }

    public UserSaveDTO(String userEmail, String userPass, String userRole) {
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

    @Override
    public String toString() {
        return "UserSaveDTO{" +
                "userEmail='" + userEmail + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userRole='" + userRole + '\'' +
                '}';
    }
}
