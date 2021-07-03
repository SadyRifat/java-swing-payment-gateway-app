/*
 * Created by JFormDesigner on Sat Jul 03 10:54:00 BDT 2021
 */

package com.java.frame;

import com.java.models.UserModel;
import com.java.service.LoginService;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Sady
 */
public class LoginFrame extends JFrame {
    public LoginFrame() {
        initComponents();
    }

    private void signUpBtnActionPerformed(ActionEvent e) {
        this.dispose();
        RegistrationFrame registrationFrame = new RegistrationFrame();
        registrationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registrationFrame.setResizable(true);
        registrationFrame.setVisible(true);
    }

    private void loginBtnActionPerformed(ActionEvent e) {
        try {
            LoginService loginService = new LoginService();
            UserModel userModel = loginService.doLogin(userMail.getText(), userPass.getText());
            if (userModel != null) {
                this.dispose();
                DashboardFrame dashboardFrame = new DashboardFrame();
                dashboardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dashboardFrame.setResizable(true);
                dashboardFrame.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Credential mismatched", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Sady
        userMail = new JTextField();
        userPass = new JTextField();
        loginBtn = new JButton();
        signUpBtn = new JButton();
        label2 = new JLabel();
        label3 = new JLabel();

        //======== this ========
        setBackground(Color.white);
        setForeground(SystemColor.windowText);
        var contentPane = getContentPane();

        //---- loginBtn ----
        loginBtn.setText("Login");
        loginBtn.setForeground(Color.black);
        loginBtn.setBackground(new Color(153, 153, 255));
        loginBtn.addActionListener(e -> loginBtnActionPerformed(e));

        //---- signUpBtn ----
        signUpBtn.setText("SignUp");
        signUpBtn.setBackground(new Color(102, 204, 255));
        signUpBtn.addActionListener(e -> signUpBtnActionPerformed(e));

        //---- label2 ----
        label2.setText("Password");

        //---- label3 ----
        label3.setText("Email");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(signUpBtn)
                            .addGap(18, 18, 18)
                            .addComponent(loginBtn))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label2)
                                .addComponent(label3))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(userMail, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
                                .addComponent(userPass))))
                    .addGap(91, 91, 91))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(userMail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(userPass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(loginBtn)
                        .addComponent(signUpBtn))
                    .addContainerGap(89, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Sady
    private JTextField userMail;
    private JTextField userPass;
    private JButton loginBtn;
    private JButton signUpBtn;
    private JLabel label2;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
