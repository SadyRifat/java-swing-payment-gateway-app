package com.java.service;

import com.java.models.UserModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class LoginService {
    public UserModel doLogin(String email, String password) throws SQLException, ClassNotFoundException {
        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.createConnection();
        String query = "SELECT * FROM public.reg_user WHERE email='" + email + "' AND password='" + password + "'";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        UserService userService = new UserService();
        List<UserModel> usersFromResultSet = userService.getUsersFromResultSet(resultSet);
        return usersFromResultSet.size() > 0 ? usersFromResultSet.get(0) : null;
    }
}
