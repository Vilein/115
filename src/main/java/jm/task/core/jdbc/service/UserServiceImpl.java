package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoJDBCImpl();
    UserDao userHIb= new UserDaoHibernateImpl();
    public void createUsersTable() {
//        userDao.createUsersTable();
        userHIb.createUsersTable();
    }

    public void dropUsersTable() { userHIb.dropUsersTable(); }

    public void saveUser(String name, String lastName, byte age) {
        userHIb.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userHIb.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userHIb.getAllUsers();
    }

    public void cleanUsersTable() {
        userHIb.cleanUsersTable();
    }
}
