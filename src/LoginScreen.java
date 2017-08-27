

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.text.Position;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MarioPC
 */
public class LoginScreen extends javax.swing.JInternalFrame {
        Connection connection;
        Statement statement;
        ResultSet resultSet;
        
    public LoginScreen() {
        initComponents();  
        mjesto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fieldPassword = new javax.swing.JPasswordField();
        fieldUsername = new javax.swing.JTextField();
        labelUsername = new javax.swing.JLabel();
        labePassword = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setForeground(java.awt.Color.lightGray);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(100, 50));
        setName(""); // NOI18N

        fieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldPasswordKeyPressed(evt);
            }
        });

        fieldUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldUsernameKeyPressed(evt);
            }
        });

        labelUsername.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelUsername.setText("Username:");

        labePassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labePassword.setText("Password:");

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("      Employee Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldUsername))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labePassword)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labePassword, labelUsername});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labePassword)
                    .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
       login();
    }//GEN-LAST:event_loginActionPerformed

    private void fieldUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldUsernameKeyPressed
        char c=evt.getKeyChar();
         if (c==com.sun.glass.events.KeyEvent.VK_ENTER)
         {
          login();
         }
    }//GEN-LAST:event_fieldUsernameKeyPressed

    private void fieldPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldPasswordKeyPressed
        char c=evt.getKeyChar();
         if (c==com.sun.glass.events.KeyEvent.VK_ENTER)
         {
          login();
         }
    }//GEN-LAST:event_fieldPasswordKeyPressed


    
    private void login()
    {
        userField = fieldUsername.getText().trim();
        fieldUsername.setText(userField);
        String Query = "SELECT * FROM LISTARADNIKA WHERE KOR_IME =? AND LOZINKA =?";
        try
    {
        String url = "jdbc:derby://localhost:1527/testBaza";
            String username = "test";
            String password = "test";
        
     
        Connection con = DriverManager.getConnection(url,username,password);
       
        Statement stmt = con.createStatement();
        PreparedStatement pst = con.prepareStatement(Query);
        pst.setString(1,fieldUsername.getText().trim());
        pst.setString(2,fieldPassword.getText().trim());
        ResultSet rs = pst.executeQuery();
        
        if (rs.next())
        {
            razinakor = rs.getString("RAZINA");
            trgovinaKor = rs.getString("TRGOVINA");
                   
             if(fieldUsername.getText().trim().isEmpty() && fieldPassword.getText().trim().isEmpty())
             {JOptionPane.showMessageDialog(null,"Enter username and password!");
             }
             
          
                String sql="SELECT RAZINA_SEF, RAZINA_RADNIK FROM TRGOVINE";
                PreparedStatement  pstt=con.prepareStatement(sql);
                ResultSet  rst=pstt.executeQuery();
             
            while(rst.next())
            {
                razina = rst.getString("RAZINA_SEF");
                razina2 = rst.getString("RAZINA_RADNIK");
              
                
                if(razinakor.equals(razina))
                { sef = true;
                    break; }
                
                if(razinakor.equals(razina2))
                {radnik = true;
                    break;}
            }                
             if(radnik == true) 
             {
                JOptionPane.showMessageDialog(null, "Loging in...");
                this.dispose();
                NewLogin.logged = true;
                Radnik  radnik = new Radnik();
                NewLogin.mainWindow.add(radnik);   
                radnik.show();
                test = true;
                radnik.upisPodatakaRacun(fieldUsername.getText().trim());
           
                
             }
             else if(sef == true)
             {
                JOptionPane.showMessageDialog(null, "Loging in...");
                this.dispose();
                NewLogin.logged = true;
                SefTrg sef = new SefTrg();
                sef.listaN(fieldUsername.getText().trim());
                NewLogin.mainWindow.add(sef);
                sef.show();     
             }
             else if(razinakor.equals("Nabava"))
                 {
                    NewLogin.logged = true;
                    GlavnoSkladiste glavno = new GlavnoSkladiste();
                    NewLogin.mainWindow.add(glavno);
                    glavno.show();
                 }
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "Wrong username or password!");
        }
    }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }    
    }
    
     private void mjesto()
   {
   Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
   }
    public String trgovinaKor;
    public String userRacun;
    public boolean sef = false;
    public boolean radnik = false;
    public boolean test = false;
    public String razina;
    public String razina2;
    public String razinakor;
    public String userField;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField fieldPassword;
    public javax.swing.JTextField fieldUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labePassword;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables
}
