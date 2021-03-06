package com.example.diebm.contacts;

/**
 * Created by diebm on 10/10/17.
 */

public class User {
    private String username;
    private String email;
    private String id;

    public User(String username, String email, String id) {
        this.username = username;
        this.email = email;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void updateId(String id) {
        setId(id);
    }
}
