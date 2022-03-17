package com.jww.domain;

import lombok.Data;



public class User {
    int id;
    String username;
    String password;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword(){return password;}
}
