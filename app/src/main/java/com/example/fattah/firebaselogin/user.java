package com.example.fattah.firebaselogin;

/**
 * Created by Fattah on 5/13/2017.
 */

public class user {
    public String id;
    public String password;
    public String name;

    public user() {
    }

    public user(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
