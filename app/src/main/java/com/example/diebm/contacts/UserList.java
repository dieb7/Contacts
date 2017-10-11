package com.example.diebm.contacts;

import java.util.ArrayList;

/**
 * Created by diebm on 10/10/17.
 */

public class UserList {
    private static ArrayList<User> users;

    public UserList() {
        users = new ArrayList<User>();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<User> getAllUsernames() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public User getUser(int index) {
        return users.get(index);
    }

    public int getSize() {
        return users.size();
    }

    public int getIndex(User user) {
        int pos = 0;
        for (User u : users) {
            if (user.getId().equals(u.getId())) {
                return pos;
            }
            pos = pos+1;
        }
        return -1;
    }

    public boolean hasUser(User user) {
        for (User u : users) {
            if (user.getId().equals(u.getId())) {
                return true;
            }
        }
        return false;
    }

    public User getUserByUsername(String username) {
        for (User u : users) {
            if (u.getId().equals(username)) {
                return u;
            }
        }
        return null;
    }

    public boolean isUserNameAvailable(String username) {
        if (getUserByUsername(username) != null) {
            return false;
        }
        return true;
    }
}
