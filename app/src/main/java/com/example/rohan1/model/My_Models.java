package com.example.rohan1.model;

public class My_Models {
    String email , name , password;

    public My_Models(String name,String email, String password) {
        this.name = name;
        this.email = email;

        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
