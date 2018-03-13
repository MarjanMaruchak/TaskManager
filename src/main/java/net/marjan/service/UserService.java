package net.marjan.service;

import net.marjan.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
