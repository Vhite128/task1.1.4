package jm.task.core.jdbc;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util util = new Util();
        util.getConnection();
        UserServiceImpl userService = new UserServiceImpl();

        UserDaoJDBCImpl userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();
        System.out.println("Количество пользователей: " + userService.getAllUsers().size());

        userDao.saveUser("Name1", "LastName1", (byte) 20);
        userDao.saveUser("Name2", "LastName2", (byte) 25);
        userDao.saveUser("Name3", "LastName3", (byte) 31);
        userDao.saveUser("Name4", "LastName4", (byte) 38);

        userDao.removeUserById(1);

        System.out.println("Количество пользователей: " + userService.getAllUsers().size());
        System.out.printf(userDao.getAllUsers().toString());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();


    }
}

