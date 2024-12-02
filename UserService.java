package service;

import model.User;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, User> users;
    private User loggedInUser;

    public UserService() {
        users = new HashMap<>();
    }

    public void register(String username, String password, boolean isAdmin) {
        if (!users.containsKey(username)) {
            users.put(username, new User(username, password, isAdmin));
        }
    }

    public boolean login(String username, String password) {
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            loggedInUser = user;
            return true;
        }
        return false;
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }
}
