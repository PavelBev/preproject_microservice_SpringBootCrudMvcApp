package ru.pavelbev.CrudAppWithSpringBoot.service;


import ru.pavelbev.CrudAppWithSpringBoot.model.User;

import java.util.List;

public interface UserService {
    User getUser(int id);
    List<User> getUsers();
    void saveUser(User user);
    void deleteUser(int id);
    void updateUser(User user);
}
