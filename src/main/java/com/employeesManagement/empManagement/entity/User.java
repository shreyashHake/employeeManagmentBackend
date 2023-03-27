package com.employeesManagement.empManagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", length = 10)
    private int userId;

    @Column(name = "user_email", length = 50)
    private String userEmail;

    @Column(name = "user_pass", length = 50)
    private String userPass;

    @Column(name = "user_role", length = 50)
    private String userRole;

    public User() {
    }

    public User(String userEmail, String userPass, String userRole) {
        this.userEmail = userEmail;
        this.userPass = userPass;
        this.userRole = userRole;
    }

    public User(int userId, String userEmail, String userPass, String userRole) {
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
}
