/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gym;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class member extends javax.swing.JFrame {

    /**
     * Creates new form member
     */
    public member() {
        initComponents();
        Connect();
        load_trainer();
        table_load();
        jTable1.setBackground(new Color(0,0,0,0));
        ((DefaultTableCellRenderer)jTable1.getDefaultRenderer(Object.class)).setBackground(new Color(0,0,0,0));
        jTable1.setGridColor(Color.white);
        jTable1.setForeground(Color.white);
        jScrollPane1.setBackground(new Color(0,0,0,0));
        jScrollPane1.setOpaque(false);
         jTable1.setOpaque(false);
          ((DefaultTableCellRenderer)jTable1.getDefaultRenderer(Object.class)).setOpaque(false);
         jScrollPane1.getViewport().setOpaque(false);
         jTable1.setShowGrid(true);
    }
    
    
    Connection con;
    PreparedStatement pst;
    DefaultTableModel df;
    
    
    public void Connect()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/gymmanagement", "root", "");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(trainer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void table_load()
    {
        try {
            pst = con.prepareStatement("select * from member");
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rd = rs.getMetaData();
            int c;
            c = rd.getColumnCount();
            df = (DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2 = new Vector();
                
                for(int i=1; i<=c; i++)
                {
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("firstname"));
                    v2.add(rs.getString("lastname"));
                    v2.add(rs.getString("dob"));
                    v2.add(rs.getString("mobile"));
                    v2.add(rs.getString("gender"));
                    v2.add(rs.getString("address"));
                    v2.add(rs.getString("which"));
                    v2.add(rs.getString("weight"));
                    v2.add(rs.getString("height"));
                    v2.add(rs.getString("date"));
                    v2.add(rs.getString("trainer"));
                    
                    
                    
                    
                    
                    
                }
                
                
                
                df.addRow(v2);
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    
    public void load_trainer()
    {
        try {
            pst = con.prepareStatement("select Distinct name from trainer");
            
            ResultSet rs;
            rs = pst.executeQuery();
            txttrain.removeAllItems();
            
            
            
            while(rs.next())
            {
                txttrain.addItem(rs.getString("name"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(member.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        txtmob = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtdob = new com.toedter.calendar.JDateChooser();
        txtgen = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtstart = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        txttrain = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtwe = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txthe = new javax.swing.JTextField();
        txtveg = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" First Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 32, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Last Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 83, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Date of Birth");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mobile No");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 175, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Gender");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 219, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" Address");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 272, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Veg/Non-Veg");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 326, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" Trainer");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 547, -1, -1));

        txtfname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtfname.setText(" ");
        jPanel2.add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 29, 164, -1));

        txtlname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtlname.setText(" ");
        jPanel2.add(txtlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 80, 164, -1));

        txtmob.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtmob.setText(" ");
        jPanel2.add(txtmob, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 172, 164, -1));

        txtaddress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtaddress.setText(" ");
        jPanel2.add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 269, 164, -1));

        txtdob.setDateFormatString("dd-MM-yyyy");
        jPanel2.add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 160, 30));

        txtgen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtgen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel2.add(txtgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 216, 164, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" Start Date");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 489, -1, -1));

        txtstart.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(txtstart, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 481, 164, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText(" ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 612, 83, 64));

        txttrain.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txttrain.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        txttrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttrainActionPerformed(evt);
            }
        });
        jPanel2.add(txttrain, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 544, 164, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText(" Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, -1, 64));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText(" Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, 100, 64));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText(" Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 610, 83, 64));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(" Weight in Kg");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 377, -1, -1));

        txtwe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtwe.setText(" ");
        jPanel2.add(txtwe, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 377, 164, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(" Height in Cm");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 429, -1, -1));

        txthe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txthe.setText(" ");
        jPanel2.add(txthe, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 426, 164, -1));

        txtveg.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtveg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veg", "Non-Veg" }));
        jPanel2.add(txtveg, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 323, 164, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/wp10391834-personal-trainer-wallpapers.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -110, 510, 790));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 134, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "Dob", "Mobile", "Gender", "Address", "Veg/Non-veg", "Weight", "Height", "Start date", "Trainer"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 134, 920, 573));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" Registration");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/wp10391834-personal-trainer-wallpapers.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 850));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String fname = txtfname.getText();
         String lname = txtlname.getText();
          SimpleDateFormat df = new  SimpleDateFormat("dd-MM-yyyy");
        String dob  = df.format(txtdob.getDate());
         String mobile = txtmob.getText();
         String gender = txtgen.getSelectedItem().toString();
         String address = txtaddress.getText();
         String vegnonveg = txtveg.getSelectedItem().toString(); 
         String weight = txtwe.getText();
         String height = txthe.getText();
         SimpleDateFormat df1 = new  SimpleDateFormat("dd-MM-yyyy");
        String sdate  = df1.format(txtstart.getDate());
         String trainer = txttrain.getSelectedItem().toString();
        
         
        
         
        
        try {
            pst = con.prepareStatement("insert into member(firstname,lastname,dob,mobile,gender,address,which,weight,height,date,trainer)values(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, fname);
            pst.setString(2, lname);
            pst.setString(3, dob);
            pst.setString(4, mobile);
            pst.setString(5, gender);
            pst.setString(6, address);
            pst.setString(7, vegnonveg);
             pst.setString(8, weight);
              pst.setString(9, height);
            pst.setString(10, sdate);
            pst.setString(11, trainer);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "MEMBER ADDED");
            
             
            txtfname.setText("");
            txtlname.setText("");
            txtmob.setText("");
            txtaddress.setText("");
             txtwe.setText("");
              txthe.setText("");
            txtfname.requestFocus();
            
            table_load();
            
        } catch (SQLException ex) {
            Logger.getLogger(trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        df = ( DefaultTableModel)jTable1.getModel();
        int selected = jTable1.getSelectedRow();
        int id = Integer.parseInt(df.getValueAt(selected, 0).toString());
        
        String fname = txtfname.getText();
         String lname = txtlname.getText();
          SimpleDateFormat df = new  SimpleDateFormat("dd-MM-yyyy");
        String dob  = df.format(txtdob.getDate());
         String mobile = txtmob.getText();
         String gender = txtgen.getSelectedItem().toString();
         String address = txtaddress.getText();
         String vegnonveg = txtveg.getSelectedItem().toString(); 
         String weight = txtwe.getText();
         String height = txthe.getText();
         SimpleDateFormat df1 = new  SimpleDateFormat("dd-MM-yyyy");
        String sdate  = df1.format(txtstart.getDate());
         String trainer = txttrain.getSelectedItem().toString();
        
        try {
            pst = con.prepareStatement("update member set firstname = ?, lastname = ?, dob = ?, mobile = ?, gender = ?, address = ?, which = ?, weight = ?, height = ?, date = ?, trainer = ? where id = ?");
            pst.setString(1, fname);
            pst.setString(2, lname);
            pst.setString(3, dob);
            pst.setString(4, mobile);
            pst.setString(5, gender);
            pst.setString(6, address);
            pst.setString(7, vegnonveg);
             pst.setString(8, weight);
              pst.setString(9, height);
            pst.setString(10, sdate);
            pst.setString(11, trainer);
            pst.setInt(12, id);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "MEMBER UPDATED");
            
            txtfname.setText("");
            txtlname.setText("");
            txtmob.setText("");
            txtaddress.setText("");
            txtwe.setText("");
            txthe.setText("");
            txtfname.requestFocus();
            
            jButton1.setEnabled(true);
            table_load();
            
        } catch (SQLException ex) {
            Logger.getLogger(trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        df = ( DefaultTableModel)jTable1.getModel();
        int selected = jTable1.getSelectedRow();
        int id = Integer.parseInt(df.getValueAt(selected, 0).toString());
        
        
        
        try {
            pst = con.prepareStatement("delete from member where id = ?");
            
            pst.setInt(1, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "MEMBER DELETED");
             
             
            txtfname.setText("");
            txtlname.setText("");
            txtmob.setText("");
            txtaddress.setText("");
            txtfname.requestFocus();
            
            jButton1.setEnabled(true);
            table_load();
            
        } catch (SQLException ex) {
            Logger.getLogger(trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         try{
        df = ( DefaultTableModel)jTable1.getModel();
        int selected = jTable1.getSelectedRow();
        int id = Integer.parseInt(df.getValueAt(selected, 0).toString());
        
        txtfname.setText(df.getValueAt(selected, 1).toString());
        txtlname.setText(df.getValueAt(selected, 2).toString());
         Date date = new SimpleDateFormat("dd-MM-yyyy").parse((String)df.getValueAt(selected, 3));
         txtdob.setDate(date);
        txtmob.setText(df.getValueAt(selected, 4).toString());
        txtaddress.setText(df.getValueAt(selected, 6).toString());
         txtwe.setText(df.getValueAt(selected, 8).toString());
          txthe.setText(df.getValueAt(selected, 9).toString());
            Date sdate = new SimpleDateFormat("dd-MM-yyyy").parse((String)df.getValueAt(selected, 10));
         txtstart.setDate(sdate);
        txtfname.requestFocus();
        
        
            
            
            jButton1.setEnabled(false);
            
            
            
        } catch (ParseException ex) {
            Logger.getLogger(trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void txttrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttrainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttrainActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtaddress;
    private com.toedter.calendar.JDateChooser txtdob;
    private javax.swing.JTextField txtfname;
    private javax.swing.JComboBox<String> txtgen;
    private javax.swing.JTextField txthe;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtmob;
    private com.toedter.calendar.JDateChooser txtstart;
    private javax.swing.JComboBox<String> txttrain;
    private javax.swing.JComboBox<String> txtveg;
    private javax.swing.JTextField txtwe;
    // End of variables declaration//GEN-END:variables
}
