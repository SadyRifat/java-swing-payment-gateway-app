/*
 * Created by JFormDesigner on Sat Jul 03 11:22:06 BDT 2021
 */

package com.java.frame;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Sady
 */
public class DashboardFrame extends JFrame {
    public DashboardFrame() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Sady
        searchField = new JTextField();
        searchBtn = new JButton();
        radioMobile = new JRadioButton();
        radioAccount = new JRadioButton();
        label1 = new JLabel();
        paymentAddBtn = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        label2 = new JLabel();
        scrollPane2 = new JScrollPane();
        table2 = new JTable();

        //======== this ========
        var contentPane = getContentPane();

        //---- searchBtn ----
        searchBtn.setText("Search");
        searchBtn.setBackground(new Color(204, 255, 255));

        //---- radioMobile ----
        radioMobile.setText("Mobile Number");

        //---- radioAccount ----
        radioAccount.setText("Account Number");

        //---- label1 ----
        label1.setText("My Payment Methods");

        //---- paymentAddBtn ----
        paymentAddBtn.setText("Add");
        paymentAddBtn.setBackground(new Color(204, 255, 204));

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }

        //---- label2 ----
        label2.setText("My Benificiaries");

        //======== scrollPane2 ========
        {
            scrollPane2.setViewportView(table2);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(label2)
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                .addComponent(label1)
                                .addGap(114, 114, 114)
                                .addComponent(paymentAddBtn)))
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(radioMobile)
                                .addGap(18, 18, 18)
                                .addComponent(radioAccount))
                            .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                .addComponent(searchField, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchBtn))))
                    .addContainerGap(28, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(radioMobile)
                        .addComponent(radioAccount))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(searchBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchField))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label1)
                        .addComponent(paymentAddBtn))
                    .addGap(18, 18, 18)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(label2)
                    .addGap(18, 18, 18)
                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(27, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());

        //---- buttonGroup1 ----
        var buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioMobile);
        buttonGroup1.add(radioAccount);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Sady
    private JTextField searchField;
    private JButton searchBtn;
    private JRadioButton radioMobile;
    private JRadioButton radioAccount;
    private JLabel label1;
    private JButton paymentAddBtn;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel label2;
    private JScrollPane scrollPane2;
    private JTable table2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
