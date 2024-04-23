/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;

import accounts.Login;
import accounts.UserManager;
import com.formdev.flatlaf.FlatLightLaf;
import config.GetImage;
import config.databaseConnector;
import java.awt.geom.RoundRectangle2D;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author MARITIME 02
 */
public class adminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form adminDashboard
     */
    public adminDashboard() {
        initComponents();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));

        displayAccounts();
        displayAccountName();
        UXmethods.RoundBorders.setArcStyle(scroll, 15);
        UXmethods.RoundBorders.setArcStyle(search, 15);
        UXmethods.RoundBorders.setArcStyle(edit, 15);
        UXmethods.RoundBorders.setArcStyle(delete, 15);
        UXmethods.RoundBorders.setArcStyle(add, 15);

        UXmethods.RoundBorders.setArcStyle(searchIcon, 15);
        UXmethods.RoundBorders.setArcStyle(yawa, 30);
        UXmethods.RoundBorders.setArcStyle(yawa1, 30);
        UXmethods.RoundBorders.setArcStyle(hays, 15);
        UXmethods.RoundBorders.setArcStyle(save, 15);
        UXmethods.RoundBorders.setArcStyle(delete, 15);

        UXmethods.RoundBorders.setArcStyle(fullname, 15);
        UXmethods.RoundBorders.setArcStyle(email, 15);
        UXmethods.RoundBorders.setArcStyle(number, 15);
        UXmethods.RoundBorders.setArcStyle(address, 15);
        UXmethods.RoundBorders.setArcStyle(role, 15);
        UXmethods.RoundBorders.setArcStyle(status, 15);

        UXmethods.RoundBorders.setArcStyle(dashboard, 50);
        UXmethods.RoundBorders.setArcStyle(profile, 50);
        UXmethods.RoundBorders.setArcStyle(logout, 50);

    }

    public void displayAccountName() {
        try {
            int accountId = UserManager.getLoggedInUserId();

            databaseConnector dbc = new databaseConnector();
            String query = "SELECT fname FROM accounts_table WHERE account_id = ?";
            PreparedStatement pst = dbc.getConnection().prepareStatement(query);
            pst.setInt(1, accountId);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String firstName = rs.getString("fname");

                name.setText(firstName + "!");
            }
            rs.close();
            pst.close();
        } catch (Exception ex) {
            System.out.println("Errors: " + ex.getMessage());
        }
    }

    public void displayAccounts() {

        try {
            databaseConnector dbc = new databaseConnector();

            ResultSet rs = dbc.getData("SELECT * FROM accounts_table");
            accounts_table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        } catch (Exception ex) {
            System.out.println("Errors: " + ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hays = new javax.swing.JPanel();
        dashboard = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        profile = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        add = new javax.swing.JButton();
        searchIcon = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        tabs = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        yawa = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        accounts_table = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        yawa1 = new javax.swing.JPanel();
        myprofile1 = new javax.swing.JLabel();
        manage1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        photo = new javax.swing.JLabel();
        manage2 = new javax.swing.JLabel();
        manage3 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        manage4 = new javax.swing.JLabel();
        manage5 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        role = new javax.swing.JComboBox<>();
        save = new javax.swing.JButton();
        manage6 = new javax.swing.JLabel();
        manage7 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        manage8 = new javax.swing.JLabel();
        myprofile2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hays.setBackground(new java.awt.Color(241, 241, 241));
        hays.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboard.setBackground(new java.awt.Color(153, 204, 255));
        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-dashboard-24.png"))); // NOI18N
        dashboard.setBorderPainted(false);
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });
        hays.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/2.png"))); // NOI18N
        hays.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 50));

        profile.setBackground(new java.awt.Color(153, 204, 255));
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-account-24.png"))); // NOI18N
        profile.setBorderPainted(false);
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });
        hays.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 50, 50));

        logout.setBackground(new java.awt.Color(255, 102, 102));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-logout-24.png"))); // NOI18N
        logout.setBorderPainted(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        hays.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 50, 50));
        hays.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 50, -1));

        jPanel1.add(hays, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 670));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 158, 226));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Dashboard");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 30));

        name.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel5.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 50, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Welcome, ");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 50, 30));

        delete.setBackground(new java.awt.Color(255, 102, 102));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.setBorder(null);
        delete.setBorderPainted(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel5.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 40, 80, 50));

        edit.setBackground(new java.awt.Color(102, 102, 102));
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("Edit");
        edit.setBorder(null);
        edit.setBorderPainted(false);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel5.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 40, 80, 50));

        add.setBackground(new java.awt.Color(122, 183, 147));
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add Account");
        add.setBorder(null);
        add.setBorderPainted(false);
        jPanel5.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, 180, 50));

        searchIcon.setBackground(new java.awt.Color(204, 204, 204));
        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-search-24.png"))); // NOI18N
        searchIcon.setBorder(null);
        searchIcon.setBorderPainted(false);
        jPanel5.add(searchIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 60, 50));

        search.setForeground(new java.awt.Color(102, 102, 102));
        search.setText("  Search");
        search.setCaretColor(new java.awt.Color(241, 241, 241));
        search.setFocusable(false);
        jPanel5.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 330, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 1210, 120));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        yawa.setBackground(new java.awt.Color(241, 241, 241));
        yawa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scroll.setBackground(new java.awt.Color(0, 0, 0));

        accounts_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        accounts_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scroll.setViewportView(accounts_table);

        yawa.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 1070, 500));

        jPanel7.add(yawa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1150, 570));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 690));

        tabs.addTab("tab1", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        yawa1.setBackground(new java.awt.Color(241, 241, 241));
        yawa1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myprofile1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        myprofile1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myprofile1.setText("Account Picture");
        yawa1.add(myprofile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 560, 30));

        manage1.setForeground(new java.awt.Color(102, 102, 102));
        manage1.setText("Manage Profile");
        yawa1.add(manage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 30));
        yawa1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 1090, 20));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        yawa1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 30, 380));

        photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sampleProfiles/default.png"))); // NOI18N
        yawa1.add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 120, 120));

        manage2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manage2.setForeground(new java.awt.Color(102, 102, 102));
        manage2.setText("Account ID");
        yawa1.add(manage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        manage3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manage3.setForeground(new java.awt.Color(102, 102, 102));
        manage3.setText("Status");
        yawa1.add(manage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, 40));

        fullname.setEditable(false);
        yawa1.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 270, 40));

        email.setEditable(false);
        yawa1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 270, 40));

        address.setEditable(false);
        yawa1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 270, 40));

        id.setForeground(new java.awt.Color(153, 153, 153));
        id.setText("chielbrc");
        yawa1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, 40));

        manage4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manage4.setForeground(new java.awt.Color(102, 102, 102));
        manage4.setText("Name");
        yawa1.add(manage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, 40));

        manage5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manage5.setForeground(new java.awt.Color(102, 102, 102));
        manage5.setText("Email");
        yawa1.add(manage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, 40));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive", "Pending" }));
        yawa1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 270, 40));

        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Seller", "Buyer" }));
        yawa1.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 270, 40));

        save.setBackground(new java.awt.Color(0, 158, 226));
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        yawa1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, -1, 40));

        manage6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manage6.setForeground(new java.awt.Color(102, 102, 102));
        manage6.setText("Address");
        yawa1.add(manage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, 40));

        manage7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manage7.setForeground(new java.awt.Color(102, 102, 102));
        manage7.setText("Role");
        yawa1.add(manage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, 40));

        number.setEditable(false);
        yawa1.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 270, 40));

        manage8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manage8.setForeground(new java.awt.Color(102, 102, 102));
        manage8.setText("Phone Number");
        yawa1.add(manage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, 40));

        myprofile2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        myprofile2.setText("Account Profile");
        yawa1.add(myprofile2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 30));

        jPanel4.add(yawa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1150, 570));

        tabs.addTab("tab2", jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1210, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        tabs.addTab("tab3", jPanel6);

        jPanel1.add(tabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 1210, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        int rowIndex = accounts_table.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please Select an Item!");
        } else {
            TableModel model = accounts_table.getModel();
            try {
                databaseConnector dbc = new databaseConnector();
                ResultSet rs = dbc.getData("SELECT * FROM accounts_table WHERE account_id =" + model.getValueAt(rowIndex, 0));

                if (rs.next()) {

                    id.setText("" + rs.getString("account_id"));
                    fullname.setText(rs.getString("fname") + " " + rs.getString("lname"));
                    email.setText("" + rs.getString("email"));
                    number.setText("" + rs.getString("phone number"));
                    address.setText("" + rs.getString("address"));
                    role.setSelectedItem(rs.getString("role"));
                    status.setSelectedItem(rs.getString("Status"));

                    int height = 120;
                    int width = 120;
                    String getImageFromDatabase = rs.getString("profile_picture");
                    GetImage.displayImage(photo, getImageFromDatabase, height, width);

                    tabs.setSelectedIndex(1);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error retrieving data: " + e.getMessage());
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_editActionPerformed

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        tabs.setSelectedIndex(0);
    }//GEN-LAST:event_dashboardActionPerformed

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
        tabs.setSelectedIndex(1);
    }//GEN-LAST:event_profileActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {
            databaseConnector dbc = new databaseConnector();
            String sql;
            String accountID = id.getText();
            String stats = (String) status.getSelectedItem();
            String rolee = (String) role.getSelectedItem();

            sql = "UPDATE accounts_table SET status=?, role=? WHERE account_id=?";
            try (PreparedStatement pst = dbc.getConnection().prepareStatement(sql)) {
                pst.setString(1, stats);
                pst.setString(2, rolee);
                pst.setString(3, accountID);

                int rowsUpdated = pst.executeUpdate();

                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(null, "Account Updated Successfully!");
                    displayAccounts();
                    tabs.setSelectedIndex(0);
                    id.setText("");
                    fullname.setText("");
                    email.setText("");
                    number.setText("");
                    address.setText("");
                    role.setSelectedItem("Admin");
                    status.setSelectedItem("Active");
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to update Account!");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SQL Error updating data: " + e.getMessage());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_saveActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Login logout = new Login();
        logout.setVisible(true);
        this.hide();
    }//GEN-LAST:event_logoutActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int rowIndex = accounts_table.getSelectedRow();
        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a account first");
        } else {
            TableModel model = accounts_table.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
            int a = JOptionPane.showConfirmDialog(null, "Are you sure?");
            if (a == JOptionPane.YES_OPTION) {
                databaseConnector dbc = new databaseConnector();
                dbc.deleteAccount(Integer.parseInt(id));
                JOptionPane.showMessageDialog(null, "Account deleted successfully!");
                displayAccounts();
            }
        }    }//GEN-LAST:event_deleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new adminDashboard().setVisible(true);
                }
            });

        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(adminDashboard.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable accounts_table;
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JButton dashboard;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fullname;
    private javax.swing.JPanel hays;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton logout;
    private javax.swing.JLabel manage1;
    private javax.swing.JLabel manage2;
    private javax.swing.JLabel manage3;
    private javax.swing.JLabel manage4;
    private javax.swing.JLabel manage5;
    private javax.swing.JLabel manage6;
    private javax.swing.JLabel manage7;
    private javax.swing.JLabel manage8;
    private javax.swing.JLabel myprofile1;
    private javax.swing.JLabel myprofile2;
    private javax.swing.JLabel name;
    private javax.swing.JTextField number;
    private javax.swing.JLabel photo;
    private javax.swing.JButton profile;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JButton save;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextField search;
    private javax.swing.JButton searchIcon;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JPanel yawa;
    private javax.swing.JPanel yawa1;
    // End of variables declaration//GEN-END:variables
}
