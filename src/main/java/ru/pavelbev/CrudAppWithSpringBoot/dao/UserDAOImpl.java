package ru.pavelbev.CrudAppWithSpringBoot.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.pavelbev.CrudAppWithSpringBoot.model.User;

import java.util.List;


@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public User getUser(int id) {
        return em.find(User.class, id);
    }

    @Override
    public List<User> getUsers() {
        return em.createQuery("select u from User u").getResultList();
    }

    @Override
    public void saveUser(User user) {
        em.persist(user);

    }

    @Override
    public void deleteUser(int id) {
        User user = em.find(User.class, id);
        if (user != null) {
            em.remove(user);
        }
    }

    @Override
    public void updateUser(User user) {
        em.merge(user);
    }
}
