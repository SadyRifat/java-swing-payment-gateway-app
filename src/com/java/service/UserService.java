package com.java.service;

import com.java.models.UserModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    public UserModel getUserByEmail(String email) throws SQLException, ClassNotFoundException {
        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.createConnection();
        String query = "SELECT * FROM public.reg_user WHERE email='" + email + "'";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        List<UserModel> userList = getUsersFromResultSet(resultSet);
        return userList.size() > 0 ? userList.get(0) : null;
    }

    public boolean isUserExists(String email) throws SQLException, ClassNotFoundException {
        UserModel userByEmail = getUserByEmail(email);
        return userByEmail != null;
    }

    public List<UserModel> getUsersFromResultSet(ResultSet resultSet) throws SQLException {
        List<UserModel> userModelList = new ArrayList<>();
        while (resultSet.next()) {
            UserModel userModel = new UserModel();
            userModel.setId(resultSet.getString("id"));
            userModel.setEmail(resultSet.getString("email"));
            userModel.setFirstName(resultSet.getString("first_name"));
            userModel.setLastName(resultSet.getString("last_name"));
            userModel.setPassword(resultSet.getString("password"));
            userModelList.add(userModel);
        }
        return userModelList;
    }
}
