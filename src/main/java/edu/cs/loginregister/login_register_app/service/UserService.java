package edu.cs.loginregister.login_register_app.service;

import edu.cs.loginregister.login_register_app.entity.User;

import java.util.List;

public interface UserService {
    void createUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    void deleteUser(Long id);

    User findByEmailAndPassword(String email, String password);
}
