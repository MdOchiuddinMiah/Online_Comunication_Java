package gui;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import src.ConnectToDatabase;

public class CreateNewAccountWindow extends javax.swing.JFrame {

    private int varificationNumber;
    private final ConnectToDatabase connectToDatabase = new ConnectToDatabase();
    private ResultSet resultSet;

    private String address;
    private String country;
    private String dateOfBirth;
    private String eMail;
    private String firstName;
    private String lastName;
    private String nickName;
    private String password;
    private String phoneNumber;
    private String sex;
    private String state;
    private String username;
    private String zipCode;

    private String sql;

    public CreateNewAccountWindow() {
        initComponents();
        this.varificationNumber = (int) (Math.random() * 100000000);
        this.tfVarificationDisplay.setText(String.valueOf(this.varificationNumber));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        pCreateNewAccountWindow = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfLastName = new javax.swing.JTextField();
        tfCountry = new javax.swing.JTextField();
        tfFirstName = new javax.swing.JTextField();
        tfNickName = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfPhoneNumber = new javax.swing.JTextField();
        tfDateOfBirth = new javax.swing.JTextField();
        tfState = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfAddress = new javax.swing.JTextArea();
        tfZipCode = new javax.swing.JTextField();
        tfUsername = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        bCheckAvailability = new javax.swing.JButton();
        lMessages = new javax.swing.JLabel();
        tfSex = new javax.swing.JComboBox();
        tfPassword = new javax.swing.JPasswordField();
        tfRepeatPassword = new javax.swing.JPasswordField();
        pButtons = new javax.swing.JPanel();
        bCancel = new javax.swing.JButton();
        tfVarificationDisplayInput = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tfVarificationDisplay = new javax.swing.JTextField();
        bConfirm = new javax.swing.JButton();
        bNewNumberGenerator = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create a New Account");

        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("First Name");

        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Last Name");

        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Nick Name");

        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("E-Mail");

        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("Phone Number");

        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("Date of Birth");

        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText("Sex");

        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setText("Address");

        jLabel9.setForeground(new java.awt.Color(0, 255, 255));
        jLabel9.setText("Zip Code");

        jLabel10.setForeground(new java.awt.Color(0, 255, 255));
        jLabel10.setText("State");

        jLabel11.setForeground(new java.awt.Color(0, 255, 255));
        jLabel11.setText("Country");

        jLabel12.setForeground(new java.awt.Color(0, 255, 255));
        jLabel12.setText("Choose an Username");

        jLabel13.setForeground(new java.awt.Color(0, 255, 255));
        jLabel13.setText("Choose a Password");

        jLabel14.setForeground(new java.awt.Color(0, 255, 255));
        jLabel14.setText("Repeat Password");

        tfLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfLastNameKeyReleased(evt);
            }
        });

        tfCountry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCountryKeyReleased(evt);
            }
        });

        tfFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFirstNameKeyReleased(evt);
            }
        });

        tfNickName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNickNameKeyReleased(evt);
            }
        });

        tfEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfEmailKeyReleased(evt);
            }
        });

        tfPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPhoneNumberKeyReleased(evt);
            }
        });

        tfDateOfBirth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfDateOfBirthKeyReleased(evt);
            }
        });

        tfState.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfStateKeyReleased(evt);
            }
        });

        tfAddress.setColumns(20);
        tfAddress.setRows(5);
        tfAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfAddressKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tfAddress);

        tfZipCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfZipCodeKeyReleased(evt);
            }
        });

        tfUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfUsernameKeyReleased(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("**");

        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("**");

        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("**");

        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("**");

        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("**");

        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("**");

        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setText("**");

        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setText("**");

        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("**");

        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("**");

        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setText("**");

        jLabel26.setForeground(new java.awt.Color(255, 0, 0));
        jLabel26.setText("**");

        jLabel27.setForeground(new java.awt.Color(255, 0, 0));
        jLabel27.setText("**");

        bCheckAvailability.setText("Check Availability");
        bCheckAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCheckAvailabilityActionPerformed(evt);
            }
        });

        lMessages.setForeground(new java.awt.Color(255, 0, 0));
        lMessages.setText(" ");

        tfSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Others" }));

        tfPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPasswordKeyReleased(evt);
            }
        });

        tfRepeatPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfRepeatPasswordKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pCreateNewAccountWindowLayout = new javax.swing.GroupLayout(pCreateNewAccountWindow);
        pCreateNewAccountWindow.setLayout(pCreateNewAccountWindowLayout);
        pCreateNewAccountWindowLayout.setHorizontalGroup(
            pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCreateNewAccountWindowLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pCreateNewAccountWindowLayout.createSequentialGroup()
                        .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfPassword)
                            .addComponent(tfRepeatPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)))
                    .addGroup(pCreateNewAccountWindowLayout.createSequentialGroup()
                        .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pCreateNewAccountWindowLayout.createSequentialGroup()
                                .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel12))
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfUsername)
                                    .addComponent(tfCountry)
                                    .addComponent(tfState)
                                    .addComponent(tfZipCode)
                                    .addComponent(tfNickName)
                                    .addComponent(tfLastName)
                                    .addComponent(tfFirstName)
                                    .addComponent(tfEmail)
                                    .addComponent(tfPhoneNumber)
                                    .addComponent(tfDateOfBirth)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                                    .addComponent(tfSex, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pCreateNewAccountWindowLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(lMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bCheckAvailability)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pCreateNewAccountWindowLayout.setVerticalGroup(
            pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCreateNewAccountWindowLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel18))
                    .addGroup(pCreateNewAccountWindowLayout.createSequentialGroup()
                        .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNickName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel17))
                        .addGap(50, 50, 50)))
                .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCreateNewAccountWindowLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCreateNewAccountWindowLayout.createSequentialGroup()
                        .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel20)
                    .addComponent(tfSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCreateNewAccountWindowLayout.createSequentialGroup()
                        .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pCreateNewAccountWindowLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel21)))
                        .addGap(18, 18, 18)
                        .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel23)))
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCheckAvailability)
                    .addComponent(lMessages))
                .addGap(18, 18, 18)
                .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel26)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCreateNewAccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel27)
                    .addComponent(tfRepeatPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        pCreateNewAccountWindow.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(tfLastName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(tfCountry, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(tfFirstName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(tfNickName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(tfEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(tfPhoneNumber, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(tfDateOfBirth, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(tfState, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(tfZipCode, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(tfUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(jLabel27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(bCheckAvailability, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(lMessages, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(tfSex, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(tfPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pCreateNewAccountWindow.setLayer(tfRepeatPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jScrollPane3.setViewportView(pCreateNewAccountWindow);

        bCancel.setText("Cancel");
        bCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        jLabel28.setText("==>");

        tfVarificationDisplay.setEditable(false);
        tfVarificationDisplay.setFont(new java.awt.Font("Purisa", 3, 12)); // NOI18N

        bConfirm.setText("Confirm");
        bConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConfirmActionPerformed(evt);
            }
        });

        bNewNumberGenerator.setText("New Number");
        bNewNumberGenerator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bNewNumberGenerator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNewNumberGeneratorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pButtonsLayout = new javax.swing.GroupLayout(pButtons);
        pButtons.setLayout(pButtonsLayout);
        pButtonsLayout.setHorizontalGroup(
            pButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bNewNumberGenerator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfVarificationDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfVarificationDisplayInput, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bConfirm)
                .addContainerGap())
        );

        pButtonsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bCancel, bConfirm, bNewNumberGenerator});

        pButtonsLayout.setVerticalGroup(
            pButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancel)
                    .addComponent(jLabel28)
                    .addComponent(tfVarificationDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfVarificationDisplayInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bConfirm)
                    .addComponent(bNewNumberGenerator))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed

        this.dispose();
    }//GEN-LAST:event_bCancelActionPerformed

    private void bNewNumberGeneratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNewNumberGeneratorActionPerformed

        this.varificationNumber = (int) (Math.random() * 100000000);
        this.tfVarificationDisplay.setText(String.valueOf(this.varificationNumber));
    }//GEN-LAST:event_bNewNumberGeneratorActionPerformed

    private void bCheckAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCheckAvailabilityActionPerformed

        if ("".equals(this.tfUsername.getText().trim())) {

            JOptionPane.showMessageDialog(null, "You have not set an username yet.");
        } else {

            this.lMessages.setBackground(Color.yellow);
            this.lMessages.setText("Please wait for a while to complete checking.");

            if (this.chekUsernameAvailability()) {
                this.lMessages.setForeground(Color.GREEN);
                this.tfUsername.setBackground(Color.GREEN);
                this.lMessages.setText(
                        this.tfUsername.getText() + " is available for you!"
                );
            } else {

                this.lMessages.setForeground(Color.RED);
                this.tfUsername.setBackground(Color.WHITE);
                this.lMessages.setText(
                        this.tfUsername.getText() + " is not available for you, try for a new one!"
                );
                this.tfUsername.setText("");
            }
        }
    }//GEN-LAST:event_bCheckAvailabilityActionPerformed

    private boolean chekUsernameAvailability() throws HeadlessException {

        boolean result = false;
        try {

            this.resultSet = this.connectToDatabase.getResult(
                    "select user_info.u_name "
                    + "from user_info "
                    + "where user_info.u_name = \'"
                    + this.tfUsername.getText().toLowerCase().trim() + "\'"
            );

            int i = 0;
            while (this.resultSet.next()) {
                i++;
                break;
            }
            result = i == 0;
        } catch (SQLException ex) {

        }
        return result;
    }

    private void bConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConfirmActionPerformed

        this.firstName = this.tfFirstName.getText().trim();
        this.lastName = this.tfLastName.getText().trim();
        this.nickName = this.tfNickName.getText().trim();
        this.eMail = this.tfEmail.getText().trim();
        this.phoneNumber = this.tfPhoneNumber.getText().trim();
        this.dateOfBirth = this.tfDateOfBirth.getText().trim();
        this.sex = this.tfSex.getSelectedItem().toString();
        this.address = this.tfAddress.getText().trim();
        this.zipCode = this.tfZipCode.getText().trim();
        this.state = this.tfState.getText().trim();
        this.country = this.tfCountry.getText().trim();
        this.username = this.tfUsername.getText().trim();
        this.password = this.tfPassword.getText();

        if (this.tfVarificationDisplay.getText().equals(this.tfVarificationDisplayInput.getText())) {

            boolean confirmationCheck = true;

            if ("".equals(this.firstName)) {
                this.tfFirstName.setBackground(Color.red);
                confirmationCheck = false;
            }
            if ("".equals(this.lastName)) {
                this.tfLastName.setBackground(Color.red);
                confirmationCheck = false;
            }
//            if ("".equals(this.nickName)) {
//                this.tfNickName.setBackground(Color.red);
//                confirmationCheck = false;
//            }
            if ("".equals(this.eMail)) {
                this.tfEmail.setBackground(Color.red);
                confirmationCheck = false;
            }
            if ("".equals(this.phoneNumber)) {
                this.tfPhoneNumber.setBackground(Color.red);
                confirmationCheck = false;
            }
            if ("".equals(this.dateOfBirth)) {
                this.tfDateOfBirth.setBackground(Color.red);
                confirmationCheck = false;
            }
            if ("".equals(this.address)) {
                this.tfAddress.setBackground(Color.red);
                confirmationCheck = false;
            }
            if ("".equals(this.zipCode)) {
                this.tfZipCode.setBackground(Color.red);
                confirmationCheck = false;
            }
            if ("".equals(this.state)) {
                this.tfState.setBackground(Color.red);
                confirmationCheck = false;
            }
            if ("".equals(this.country)) {
                this.tfCountry.setBackground(Color.red);
                confirmationCheck = false;
            }
            if ("".equals(this.username)) {
                this.tfUsername.setBackground(Color.red);
                confirmationCheck = false;
            }
            if ("".equals(this.password)) {
                JOptionPane.showMessageDialog(null, "Space can't be a password.");
                this.tfPassword.setBackground(Color.red);
                confirmationCheck = false;
            }
            if (!this.password.equals(this.tfRepeatPassword.getText())) {
                JOptionPane.showMessageDialog(null, "Password confirmation failed.");
                this.tfPassword.setBackground(Color.red);
                confirmationCheck = false;
            }

            if (confirmationCheck) {

                if (this.chekUsernameAvailability()) {

                    this.sql = "INSERT INTO user_info(u_name, password, f_name,"
                            + " l_name, nick_name, email, phone, dob, sex, adress, "
                            + "zip, state, country) VALUES ("
                            + "\'" + this.username + "\',"
                            + "\'" + this.password + "\',"
                            + "\'" + this.firstName + "\',"
                            + "\'" + this.lastName + "\',"
                            + "\'" + this.nickName + "\',"
                            + "\'" + this.eMail + "\',"
                            + "\'" + this.phoneNumber + "\',"
                            + "\'" + this.dateOfBirth + "\',"
                            + "\'" + this.sex.charAt(0) + "\',"
                            + "\'" + this.address + "\',"
                            + "\'" + this.zipCode + "\',"
                            + "\'" + this.state + "\',"
                            + "\'" + this.country + "\'"
                            + ")";

                    this.connectToDatabase.getResult(sql);

                    JOptionPane.showMessageDialog(null, "Success....");
                    this.dispose();

                } else {

                    JOptionPane.showConfirmDialog(null, "Username is not available. Try for a new one.");
                }
            }
        } else {

            JOptionPane.showMessageDialog(null, "Wrong Varification number. Please try again.");
            this.tfVarificationDisplayInput.setBackground(Color.red);
        }
    }//GEN-LAST:event_bConfirmActionPerformed

    private void tfFirstNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFirstNameKeyReleased

        this.tfFirstName.setBackground(Color.WHITE);
    }//GEN-LAST:event_tfFirstNameKeyReleased

    private void tfLastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLastNameKeyReleased

        this.tfLastName.setBackground(Color.WHITE);
    }//GEN-LAST:event_tfLastNameKeyReleased

    private void tfNickNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNickNameKeyReleased

        this.tfNickName.setBackground(Color.WHITE);
    }//GEN-LAST:event_tfNickNameKeyReleased

    private void tfEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEmailKeyReleased

        this.tfEmail.setBackground(Color.WHITE);
    }//GEN-LAST:event_tfEmailKeyReleased

    private void tfPhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPhoneNumberKeyReleased

        this.tfPhoneNumber.setBackground(Color.WHITE);
    }//GEN-LAST:event_tfPhoneNumberKeyReleased

    private void tfDateOfBirthKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDateOfBirthKeyReleased

        this.tfDateOfBirth.setBackground(Color.WHITE);
    }//GEN-LAST:event_tfDateOfBirthKeyReleased

    private void tfAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAddressKeyReleased

        this.tfAddress.setBackground(Color.WHITE);
    }//GEN-LAST:event_tfAddressKeyReleased

    private void tfZipCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfZipCodeKeyReleased

        this.tfZipCode.setBackground(Color.WHITE);
    }//GEN-LAST:event_tfZipCodeKeyReleased

    private void tfStateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfStateKeyReleased

        this.tfState.setBackground(Color.WHITE);
    }//GEN-LAST:event_tfStateKeyReleased

    private void tfCountryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCountryKeyReleased

        this.tfCountry.setBackground(Color.WHITE);
    }//GEN-LAST:event_tfCountryKeyReleased

    private void tfUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsernameKeyReleased

        this.tfUsername.setBackground(Color.WHITE);
    }//GEN-LAST:event_tfUsernameKeyReleased

    private void tfPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPasswordKeyReleased

        this.tfPassword.setBackground(Color.WHITE);
    }//GEN-LAST:event_tfPasswordKeyReleased

    private void tfRepeatPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRepeatPasswordKeyReleased

        this.tfRepeatPassword.setBackground(Color.WHITE);
    }//GEN-LAST:event_tfRepeatPasswordKeyReleased

    public void launch() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateNewAccountWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CreateNewAccountWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bCheckAvailability;
    private javax.swing.JButton bConfirm;
    private javax.swing.JButton bNewNumberGenerator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lMessages;
    private javax.swing.JPanel pButtons;
    private javax.swing.JDesktopPane pCreateNewAccountWindow;
    private javax.swing.JTextArea tfAddress;
    private javax.swing.JTextField tfCountry;
    private javax.swing.JTextField tfDateOfBirth;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfNickName;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfPhoneNumber;
    private javax.swing.JPasswordField tfRepeatPassword;
    private javax.swing.JComboBox tfSex;
    private javax.swing.JTextField tfState;
    private javax.swing.JTextField tfUsername;
    private javax.swing.JTextField tfVarificationDisplay;
    private javax.swing.JTextField tfVarificationDisplayInput;
    private javax.swing.JTextField tfZipCode;
    // End of variables declaration//GEN-END:variables
}
