package com.java.service;

import com.java.models.RegistrationModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

public class RegistrationService {
    public void doRegister(RegistrationModel registrationModel) throws SQLException, ClassNotFoundException {
        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.createConnection();
        String query = "INSERT INTO public.reg_user(id, first_name, last_name, email, password) VALUES (?, ?, ?, ?, ?);";
        PreparedStatement prepareStatement = connection.prepareStatement(query);
        prepareStatement.setString(1, UUID.randomUUID().toString());
        prepareStatement.setString(2, registrationModel.getFirstName());
        prepareStatement.setString(3, registrationModel.getLastName());
        prepareStatement.setString(4, registrationModel.getEmail());
        prepareStatement.setString(5, registrationModel.getPassword());

        prepareStatement.executeUpdate();
    }
}
