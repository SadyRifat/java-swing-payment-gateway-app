/*
 * Created by JFormDesigner on Sat Jul 03 11:07:46 BDT 2021
 */

package com.java.frame;

import com.java.models.RegistrationModel;
import com.java.service.FieldValidation;
import com.java.service.RegistrationService;
import com.java.service.UserService;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Sady
 */
public class RegistrationFrame extends JFrame {
    public RegistrationFrame() {
        initComponents();
    }

    private void loginBtnActionPerformed(ActionEvent e) {
        this.dispose();
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setResizable(true);
        loginFrame.setVisible(true);
    }

    private void registerBtnActionPerformed(ActionEvent e) {
        FieldValidation fieldValidation = new FieldValidation();
        if (!fieldValidation.isValidEmail(emailField.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Email");
        } else if (!passField.getText().equals(cPassField.getText())) {
            JOptionPane.showMessageDialog(this, "Password Mismatched");
        } else {
            try {
                UserService userService = new UserService();
                if (userService.isUserExists(emailField.getText())) {
                    JOptionPane.showMessageDialog(this, "User already exists. Please login.");
                    return;
                }

                RegistrationModel registrationModel = new RegistrationModel(firstNameField.getText(), lastNameField.getText(),
                        emailField.getText(), passField.getText());
                RegistrationService registrationService = new RegistrationService();
                registrationService.doRegister(registrationModel);

                JOptionPane.showMessageDialog(this, "Registration Successful. Please Login.");
            } catch (SQLException | ClassNotFoundException exception) {
                JOptionPane.showMessageDialog(this, "Something went wrong. Please try again", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Sady
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        firstNameField = new JTextField();
        lastNameField = new JTextField();
        emailField = new JTextField();
        passField = new JTextField();
        cPassField = new JTextField();
        registerBtn = new JButton();
        loginBtn = new JButton();
        label5 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("First Name");

        //---- label2 ----
        label2.setText("Last Name");

        //---- label3 ----
        label3.setText("Email");

        //---- label4 ----
        label4.setText("Password");

        //---- registerBtn ----
        registerBtn.setText("Register");
        registerBtn.setBackground(new Color(153, 153, 255));
        registerBtn.addActionListener(e -> registerBtnActionPerformed(e));

        //---- loginBtn ----
        loginBtn.setText("Login");
        loginBtn.setBackground(new Color(102, 204, 255));
        loginBtn.addActionListener(e -> loginBtnActionPerformed(e));

        //---- label5 ----
        label5.setText("Confirm Password");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(loginBtn)
                            .addGap(18, 18, 18)
                            .addComponent(registerBtn))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label3)
                                .addComponent(label2)
                                .addComponent(label4)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                    .addComponent(label5, GroupLayout.Alignment.TRAILING)
                                    .addComponent(label1)))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lastNameField)
                                    .addComponent(emailField)
                                    .addComponent(passField, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstNameField))
                                .addComponent(cPassField, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))))
                    .addGap(60, 60, 60))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(firstNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lastNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2))
                    .addGap(17, 17, 17)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(emailField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(passField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label4))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(cPassField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label5))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(registerBtn)
                        .addComponent(loginBtn))
                    .addContainerGap(31, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Sady
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField emailField;
    private JTextField passField;
    private JTextField cPassField;
    private JButton registerBtn;
    private JButton loginBtn;
    private JLabel label5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
