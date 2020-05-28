package gui;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import src.ConnectToDatabase;
import src.FriendsInfo;

public class ProfilePreviewWindow extends javax.swing.JFrame {

    public final String username;
    public static String sender;
    private String sql;
    private ResultSet resultSet;
   

    private FriendsInfo friendsInfo = null;
    private final Map<Integer, FriendsInfo> friendsMap = new HashMap<>();
    private Map<Integer, FriendsInfo> searchPeoples = new HashMap<>();

    private  final ConnectToDatabase connectToDatabase = new ConnectToDatabase();

    public ProfilePreviewWindow(String username) {

        initComponents();
        //System.out.println(username);

        this.username = username;
        this.sql = "select f_name, l_name, nick_name "
                + "from user_info "
                + "where u_name = \'"
                + this.username + "\'";

        this.resultSet = this.connectToDatabase.getResult(this.sql);

        try {
            if (this.resultSet.next()) {

                this.lProfileName.setText(
                        this.resultSet.getString("f_name")
                        + " "
                        + this.resultSet.getString("l_name")
                        + " ( "
                        + this.resultSet.getString("nick_name")
                        + " )"
                );
            }
        } catch (SQLException ex) {
        }

        this.friendListInitializer();
        
        this.notificationsInitializer();
    }

    ProfilePreviewWindow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getusername(){
        return username;
    }

    private void notificationsInitializer() {
        
        this.lstNotifications.setForeground(Color.red);
        
        this.sql = "SELECT nfn_type, f_name, l_name, send_time "
                + "FROM notification, user_info "
                + "WHERE "
                + "notification.f_id = \'"
                + this.username +"\' "
                + "and notification.u_id = user_info.u_name"
            ;
        
        this.resultSet = this.connectToDatabase.getResult(this.sql);
        
        try {
            
            while(this.resultSet.next()){
                
                String type = this.resultSet.getString("nfn_type");
                String cmd = "";
                switch (type) {
                    case "M":
                        cmd = "Message";
                        break;
                    case "V":
                        cmd = "Voice Call";
                        break;
                    case "A":
                        cmd = "Audio Call";
                        break;
                    case "F":
                        cmd = "Friend Request";
                        break;
                }
                this.lstNotifications.add(
                          "New "
                        + cmd
                        + " from \""
                        + this.resultSet.getString("f_name")
                        + " "
                        + this.resultSet.getString("l_name")
                        + "\" at "
                        + this.resultSet.getString("send_time")
                );
            }
        } catch (SQLException ex) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPersonalInfo = new javax.swing.JPanel();
        lProfileName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lstFriendList = new java.awt.List();
        pOptions = new javax.swing.JPanel();
        lOptions = new javax.swing.JLabel();
        bAudioCall = new javax.swing.JButton();
        bVideoCall = new javax.swing.JButton();
        bMessage = new javax.swing.JButton();
        bAddOrRemove = new javax.swing.JButton();
        bViewProfile = new javax.swing.JButton();
        pMessage = new javax.swing.JPanel();
        lstNotifications = new java.awt.List();
        lNotifications = new javax.swing.JLabel();
        pSearchFriends = new javax.swing.JPanel();
        lSearchPeoples = new javax.swing.JLabel();
        tfSearchPeoples = new javax.swing.JTextField();
        lstSearchPeoples = new java.awt.List();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Profile");

        lProfileName.setForeground(new java.awt.Color(153, 153, 0));

        jLabel1.setText("Friends");

        lstFriendList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstFriendListMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pPersonalInfoLayout = new javax.swing.GroupLayout(pPersonalInfo);
        pPersonalInfo.setLayout(pPersonalInfoLayout);
        pPersonalInfoLayout.setHorizontalGroup(
            pPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPersonalInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lstFriendList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lProfileName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pPersonalInfoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 185, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pPersonalInfoLayout.setVerticalGroup(
            pPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPersonalInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lProfileName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lstFriendList, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addContainerGap())
        );

        bAudioCall.setText("Audio Call");

        bVideoCall.setText("Video Call");

        bMessage.setText("Message");
        bMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMessageActionPerformed(evt);
            }
        });

        bAddOrRemove.setText("Add/Remove");
        bAddOrRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddOrRemoveActionPerformed(evt);
            }
        });

        bViewProfile.setText("View Massage");
        bViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bViewProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pOptionsLayout = new javax.swing.GroupLayout(pOptions);
        pOptions.setLayout(pOptionsLayout);
        pOptionsLayout.setHorizontalGroup(
            pOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bViewProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pOptionsLayout.createSequentialGroup()
                        .addComponent(bAudioCall)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bVideoCall))
                    .addGroup(pOptionsLayout.createSequentialGroup()
                        .addComponent(bMessage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAddOrRemove)))
                .addContainerGap())
        );

        pOptionsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bAddOrRemove, bAudioCall, bMessage, bVideoCall});

        pOptionsLayout.setVerticalGroup(
            pOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAudioCall)
                    .addComponent(bVideoCall))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bMessage)
                    .addComponent(bAddOrRemove))
                .addGap(18, 18, 18)
                .addComponent(bViewProfile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lstNotifications.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstNotificationsMouseClicked(evt);
            }
        });

        lNotifications.setText("Notifications");

        javax.swing.GroupLayout pMessageLayout = new javax.swing.GroupLayout(pMessage);
        pMessage.setLayout(pMessageLayout);
        pMessageLayout.setHorizontalGroup(
            pMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMessageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lstNotifications, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pMessageLayout.createSequentialGroup()
                        .addGap(0, 97, Short.MAX_VALUE)
                        .addComponent(lNotifications, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pMessageLayout.setVerticalGroup(
            pMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMessageLayout.createSequentialGroup()
                .addComponent(lNotifications)
                .addGap(20, 20, 20)
                .addComponent(lstNotifications, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
        );

        lSearchPeoples.setText("Search Peoples");

        tfSearchPeoples.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchPeoplesKeyReleased(evt);
            }
        });

        lstSearchPeoples.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstSearchPeoplesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pSearchFriendsLayout = new javax.swing.GroupLayout(pSearchFriends);
        pSearchFriends.setLayout(pSearchFriendsLayout);
        pSearchFriendsLayout.setHorizontalGroup(
            pSearchFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSearchFriendsLayout.createSequentialGroup()
                .addGroup(pSearchFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pSearchFriendsLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(lSearchPeoples)
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addGroup(pSearchFriendsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pSearchFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lstSearchPeoples, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfSearchPeoples))))
                .addContainerGap())
        );
        pSearchFriendsLayout.setVerticalGroup(
            pSearchFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSearchFriendsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lSearchPeoples)
                .addGap(18, 18, 18)
                .addComponent(tfSearchPeoples, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lstSearchPeoples, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPersonalInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pSearchFriends, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pPersonalInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pSearchFriends, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(pMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSearchPeoplesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchPeoplesKeyReleased

        this.sql = "SELECT u_name, f_name, l_name "
                + "FROM user_info "
                + "WHERE concat(f_name, ' ',l_name) LIKE \'%"
                + this.tfSearchPeoples.getText()
                + "%\' "
                + "ORDER BY f_name, l_name "
                + "LIMIT 0 , 30";
        
        this.resultSet = this.connectToDatabase.getResult(this.sql);
        
        try {
            
            this.lstSearchPeoples.clear();
            while(this.resultSet.next()){
                
                this.friendsInfo = new FriendsInfo();
                
                this.friendsInfo.u_name = this.resultSet.getString("u_name");
                this.friendsInfo.f_name = this.resultSet.getString("f_name");
                this.friendsInfo.l_name = this.resultSet.getString("l_name");
                
                this.searchPeoples.put(this.resultSet.getRow(), friendsInfo);
                
                this.lstSearchPeoples.add(this.friendsInfo.f_name+" "+this.friendsInfo.l_name);
            }
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_tfSearchPeoplesKeyReleased

    //new
    
    
    
    
    private void bViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bViewProfileActionPerformed
        
        new showmesage().launches();
    }//GEN-LAST:event_bViewProfileActionPerformed

    private void lstFriendListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstFriendListMouseClicked
        
        this.lOptions.setText(this.lstFriendList.getSelectedItem());
        sender = lOptions.getText();
        this.lstNotifications.deselect(this.lstNotifications.getSelectedIndex());
        this.lstSearchPeoples.deselect(this.lstSearchPeoples.getSelectedIndex());
    }//GEN-LAST:event_lstFriendListMouseClicked

    private void lstNotificationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstNotificationsMouseClicked
        
        this.lstFriendList.deselect(this.lstFriendList.getSelectedIndex());
        this.lstSearchPeoples.deselect(this.lstSearchPeoples.getSelectedIndex());
    }//GEN-LAST:event_lstNotificationsMouseClicked

    private void lstSearchPeoplesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstSearchPeoplesMouseClicked

        this.lOptions.setText(this.lstSearchPeoples.getSelectedItem());
         sender = lOptions.getText();
        this.lstNotifications.deselect(this.lstNotifications.getSelectedIndex());
        this.lstFriendList.deselect(this.lstSearchPeoples.getSelectedIndex());
    }//GEN-LAST:event_lstSearchPeoplesMouseClicked
    //message
    
    private void bMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMessageActionPerformed
        
        new message().launch();
    }//GEN-LAST:event_bMessageActionPerformed

    //delete
    private void bAddOrRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddOrRemoveActionPerformed
       
       new unfriend().launc();
        
           
            // this.sql="update friend_list set rln_stat='N' where f_id=' "+sender+"' " ;
    
    }//GEN-LAST:event_bAddOrRemoveActionPerformed

    
    
    public void launcher() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfilePreviewWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProfilePreviewWindow(username).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddOrRemove;
    private javax.swing.JButton bAudioCall;
    private javax.swing.JButton bMessage;
    private javax.swing.JButton bVideoCall;
    private javax.swing.JButton bViewProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lNotifications;
    private javax.swing.JLabel lOptions;
    private javax.swing.JLabel lProfileName;
    private javax.swing.JLabel lSearchPeoples;
    private java.awt.List lstFriendList;
    private java.awt.List lstNotifications;
    private java.awt.List lstSearchPeoples;
    private javax.swing.JPanel pMessage;
    private javax.swing.JPanel pOptions;
    private javax.swing.JPanel pPersonalInfo;
    private javax.swing.JPanel pSearchFriends;
    private javax.swing.JTextField tfSearchPeoples;
    // End of variables declaration//GEN-END:variables

    private void friendListInitializer() {

        try {

            this.sql = "select u_name, f_name, l_name "
                    + "from user_info "
                    + "where u_name in ( "
                    + "select f_id from friend_list where u_id = \'"
                    + this.username + "\' and rln_stat = \'F\' ) ";

            this.resultSet = this.connectToDatabase.getResult(this.sql);
            
            
            while (this.resultSet.next()) {

                this.friendsInfo = new FriendsInfo();
                this.friendsInfo.u_name = this.resultSet.getString("u_name");
                this.friendsInfo.f_name = this.resultSet.getString("f_name");
                this.friendsInfo.l_name = this.resultSet.getString("l_name");

                this.friendsMap.put(this.resultSet.getRow(), friendsInfo);

                this.lstFriendList.add(this.friendsInfo.f_name + " " + this.friendsInfo.l_name);
            }

            //----------------------------------------------------------------------
            
            this.sql = "select u_id from friend_list where f_id = \'"
                    + this.username + "\' and rln_stat = \'F\'";

            this.resultSet = this.connectToDatabase.getResult(this.sql);

            while (this.resultSet.next()) {

                this.lstFriendList.add(this.resultSet.getString("u_id"));
            }
        } catch (SQLException ex) {
        }
    }
}
