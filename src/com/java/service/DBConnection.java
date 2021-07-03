package com.java.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private String dbManager = "postgresql";
    private String host = "localhost";
    private String port = "5432";
    private String db = "postgres";
    private String username = "root";
    private String password = "admin";

    public Connection createConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        Connection pgCon = DriverManager.getConnection("jdbc:" + dbManager + "://" + host + ":" + port + "/" + db, username, password);
        return pgCon;
    }
}
