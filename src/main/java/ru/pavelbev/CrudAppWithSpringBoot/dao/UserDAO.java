package ru.pavelbev.CrudAppWithSpringBoot.dao;


import ru.pavelbev.CrudAppWithSpringBoot.model.User;

import java.util.List;

public interface UserDAO {
    User getUser(int id);
    List<User> getUsers();
    void saveUser(User user);
    void deleteUser(int id);
    void updateUser(User user);
}
