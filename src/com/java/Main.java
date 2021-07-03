package com.java;

import com.java.frame.LoginFrame;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setResizable(true);
        loginFrame.setVisible(true);
    }
}
