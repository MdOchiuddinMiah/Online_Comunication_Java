package gui;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import src.ConnectToDatabase;

public class LoginWindow extends javax.swing.JFrame {

    private final ConnectToDatabase connectToDatabase = new ConnectToDatabase();
    private String sql;
    public static String username1;
    private String password;
    private ResultSet resultSet;

    public LoginWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pLogin = new javax.swing.JPanel();
        dpLoginWindow = new javax.swing.JDesktopPane();
        lPassword = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        lUsername = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        bForgetPassword = new javax.swing.JButton();
        lMessage = new javax.swing.JLabel();
        bLogin = new javax.swing.JButton();
        bCreateNewAccount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        pLogin.setBackground(new java.awt.Color(204, 255, 204));

        dpLoginWindow.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abyssinica SIL", 3, 36), java.awt.Color.pink)); // NOI18N
        dpLoginWindow.setToolTipText("Login");
        dpLoginWindow.setName("Login"); // NOI18N

        lPassword.setForeground(new java.awt.Color(0, 255, 255));
        lPassword.setText("Password");

        tfUsername.setToolTipText("Please enter your username here.");

        lUsername.setForeground(new java.awt.Color(0, 255, 255));
        lUsername.setText("Username");

        tfPassword.setToolTipText("Please enter your user password to login.");

        bForgetPassword.setText("Forget Password ?");

        javax.swing.GroupLayout dpLoginWindowLayout = new javax.swing.GroupLayout(dpLoginWindow);
        dpLoginWindow.setLayout(dpLoginWindowLayout);
        dpLoginWindowLayout.setHorizontalGroup(
            dpLoginWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpLoginWindowLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(dpLoginWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dpLoginWindowLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bForgetPassword)
                        .addGap(63, 63, 63))
                    .addGroup(dpLoginWindowLayout.createSequentialGroup()
                        .addGroup(dpLoginWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lUsername)
                            .addComponent(lPassword))
                        .addGap(18, 18, 18)
                        .addGroup(dpLoginWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfUsername)
                            .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(dpLoginWindowLayout.createSequentialGroup()
                        .addComponent(lMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        dpLoginWindowLayout.setVerticalGroup(
            dpLoginWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dpLoginWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dpLoginWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lUsername)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dpLoginWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPassword)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bForgetPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );
        dpLoginWindow.setLayer(lPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpLoginWindow.setLayer(tfUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpLoginWindow.setLayer(lUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpLoginWindow.setLayer(tfPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpLoginWindow.setLayer(bForgetPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpLoginWindow.setLayer(lMessage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bLogin.setText("Login");
        bLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginActionPerformed(evt);
            }
        });

        bCreateNewAccount.setText("Create New Account");
        bCreateNewAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCreateNewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCreateNewAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pLoginLayout = new javax.swing.GroupLayout(pLogin);
        pLogin.setLayout(pLoginLayout);
        pLoginLayout.setHorizontalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pLoginLayout.createSequentialGroup()
                        .addComponent(bCreateNewAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bLogin))
                    .addComponent(dpLoginWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pLoginLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bCreateNewAccount, bLogin});

        pLoginLayout.setVerticalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(dpLoginWindow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bLogin)
                    .addComponent(bCreateNewAccount))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCreateNewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCreateNewAccountActionPerformed

        new CreateNewAccountWindow().launch();
    }//GEN-LAST:event_bCreateNewAccountActionPerformed

    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed

        try {

            this.lMessage.setForeground(Color.green);
            this.lMessage.setText("Please wait, database quering..");

            this.username1 = this.tfUsername.getText();
            
            System.out.println(username1);

            this.sql = "SELECT u_name, password FROM user_info WHERE u_name = \'" + this.username1 + "\'";

            this.resultSet = this.connectToDatabase.getResult(sql);

            if (this.resultSet.next()) {

                this.password = this.resultSet.getString("password");
            }

            if (this.tfPassword.getText().equals(this.password)) {

                new ProfilePreviewWindow(this.username1).launcher();
                this.dispose();
            } else {

                this.lMessage.setForeground(Color.red);
                this.tfUsername.setText("");
                this.tfPassword.setText("");
                this.lMessage.setText("Username or Password is not correct!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bLoginActionPerformed

    public void launch() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCreateNewAccount;
    private javax.swing.JButton bForgetPassword;
    private javax.swing.JButton bLogin;
    private javax.swing.JDesktopPane dpLoginWindow;
    private javax.swing.JLabel lMessage;
    private javax.swing.JLabel lPassword;
    private javax.swing.JLabel lUsername;
    private javax.swing.JPanel pLogin;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables


    
    
}
