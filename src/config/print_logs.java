/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package config;

import com.formdev.flatlaf.FlatLightLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author MARITIME 02
 */
public class print_logs extends javax.swing.JFrame {

    /**
     * Creates new form print_logs
     */
    public print_logs() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sds = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        print_this = new javax.swing.JPanel();
        details = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        logsnum = new javax.swing.JLabel();
        action = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        full_name = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        shop = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        loc = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        picture = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        home = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sds.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        sds.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 160, 40));

        print_this.setBackground(new java.awt.Color(255, 255, 255));

        details.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        details.setForeground(new java.awt.Color(153, 153, 153));
        details.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        details.setText("Seller # succesfully logged in");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Seller ID #: ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Timestamp: ");

        date.setForeground(new java.awt.Color(153, 153, 153));
        date.setText("10-24-2000");

        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("123");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel10.setText("Activity logs");

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Action");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 6, 180, 40));

        jPanel4.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Details");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(1, 6, 390, 40);

        logsnum.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        logsnum.setForeground(new java.awt.Color(153, 153, 153));
        logsnum.setText("12312");

        action.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        action.setForeground(new java.awt.Color(153, 153, 153));
        action.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        action.setText("Logged in");

        full_name.setFont(new java.awt.Font("Segoe UI Black", 1, 40)); // NOI18N
        full_name.setText("Archie Albarico");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/print-location.png"))); // NOI18N

        shop.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        shop.setForeground(new java.awt.Color(153, 153, 153));
        shop.setText("123");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/print_phone.png"))); // NOI18N

        loc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        loc.setForeground(new java.awt.Color(153, 153, 153));
        loc.setText("123");

        email.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        email.setForeground(new java.awt.Color(153, 153, 153));
        email.setText("123");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/print_email.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pprint_shop.png"))); // NOI18N

        phone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        phone.setForeground(new java.awt.Color(153, 153, 153));
        phone.setText("123");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel21.setText("Logs #:");

        javax.swing.GroupLayout print_thisLayout = new javax.swing.GroupLayout(print_this);
        print_this.setLayout(print_thisLayout);
        print_thisLayout.setHorizontalGroup(
            print_thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(print_thisLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(print_thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(print_thisLayout.createSequentialGroup()
                        .addGroup(print_thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(print_thisLayout.createSequentialGroup()
                                .addGroup(print_thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel21))
                                .addGap(12, 12, 12)
                                .addGroup(print_thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(logsnum)
                                    .addComponent(date)))
                            .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(print_thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(print_thisLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(full_name, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(print_thisLayout.createSequentialGroup()
                                .addGroup(print_thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(print_thisLayout.createSequentialGroup()
                                        .addGroup(print_thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel13))
                                        .addGroup(print_thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(shop)
                                            .addComponent(loc)
                                            .addComponent(email)))
                                    .addGroup(print_thisLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel3))
                                    .addGroup(print_thisLayout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(phone))
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel15))
                                .addGap(6, 6, 6)
                                .addComponent(jLabel9))))
                    .addGroup(print_thisLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(print_thisLayout.createSequentialGroup()
                        .addComponent(action, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(details, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        print_thisLayout.setVerticalGroup(
            print_thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(print_thisLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addGap(23, 23, 23)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(print_thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(print_thisLayout.createSequentialGroup()
                        .addGroup(print_thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(logsnum)
                            .addGroup(print_thisLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(print_thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(print_thisLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(full_name, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(print_thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(print_thisLayout.createSequentialGroup()
                                .addGroup(print_thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(print_thisLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(print_thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(print_thisLayout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel13))))
                                    .addGroup(print_thisLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(shop, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(loc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3))
                                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(print_thisLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(print_thisLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel15))
                            .addComponent(jLabel9))))
                .addGap(20, 20, 20)
                .addGroup(print_thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(print_thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(action)
                    .addComponent(details)))
        );

        sds.add(print_this, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 660, 560));

        jButton2.setBackground(new java.awt.Color(0, 158, 226));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        sds.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 90, 40));

        home.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        home.setForeground(new java.awt.Color(0, 158, 226));
        home.setText("PRINTING FORMS");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        sds.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 40));
        animation.customizeLabel(home);

        getContentPane().add(sds, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PanelPrinter panelPrinter = new PanelPrinter(print_this);
        panelPrinter.printPanel();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
      
    }//GEN-LAST:event_homeMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(() -> {
                new print_logs().setVisible(true);
            });

        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(print_logs.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel action;
    public javax.swing.JLabel date;
    public javax.swing.JLabel details;
    public javax.swing.JLabel email;
    public javax.swing.JLabel full_name;
    private javax.swing.JLabel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel loc;
    public javax.swing.JLabel logsnum;
    public javax.swing.JLabel phone;
    public javax.swing.JLabel picture;
    private javax.swing.JPanel print_this;
    public javax.swing.JPanel sds;
    public javax.swing.JLabel shop;
    // End of variables declaration//GEN-END:variables
}