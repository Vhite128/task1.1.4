package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static String HOST = "jdbc:mysql://localhost:3306/new_schema";
    private static String USERNAME = "root";
    private static String PASSWORD = "UsersRoots!";
    public Connection getConnection() {
        Connection connection = null;
        try {

            connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);

        } catch (SQLException e) {
            e.getMessage();
            System.out.println("Соединение не установлено");
        }

        return connection;
    }

}
