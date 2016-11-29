package com.ssoon.web;

/**
 * @author LeeSoohoon
 */
public class User {
    private String userId;
    private String password;
    private String name;
    private String email;

    public void setUserId(final String userId) {
        this.userId = userId;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
