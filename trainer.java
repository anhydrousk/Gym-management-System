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
public class trainer extends javax.swing.JFrame {

    /**
     * Creates new form trainer
     */
    public trainer() {
        initComponents();
        Connect();
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
            pst = con.prepareStatement("select * from trainer");
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
                    v2.add(rs.getString("name"));
                    v2.add(rs.getString("age"));
                    v2.add(rs.getString("address"));
                    v2.add(rs.getString("mobile"));
                    v2.add(rs.getString("doj"));
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                }
                
                
                
                df.addRow(v2);
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(trainer.class.getName()).log(Level.SEVERE, null, ex);
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

        jTextField7 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        txttrainer = new javax.swing.JTextField();
        txtmob = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtdoj = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jTextField7.setText("jTextField1");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/pxfuel (3).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Trainer Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Age");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Address");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Mobile No");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Date of Join");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        txtage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtage.setText(" ");
        jPanel2.add(txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 199, -1));

        txttrainer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txttrainer.setText(" ");
        txttrainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttrainerActionPerformed(evt);
            }
        });
        jPanel2.add(txttrainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 199, -1));

        txtmob.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtmob.setText(" ");
        txtmob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmobActionPerformed(evt);
            }
        });
        jPanel2.add(txtmob, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 199, -1));

        jTextField5.setText("jTextField1");
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 133, 199, 0));

        jTextField6.setText("jTextField1");
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 143, 199, 0));

        txtaddress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtaddress.setText(" ");
        jPanel2.add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 199, -1));

        txtdoj.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(txtdoj, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 199, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/pxfuel (4).jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-630, -10, 1080, 360));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText(" Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 100, 52));

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Address", "Mobile", "Date of Joint"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 510, 400));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText(" Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 101, 52));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Delete ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 100, 52));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText(" Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 100, 52));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" Registration");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/pxfuel (4).jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, -100, 1630, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txttrainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttrainerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttrainerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String tname = txttrainer.getText();
        String age = txtage.getText();
        String address = txtaddress.getText();
        String mobile = txtmob.getText();
        SimpleDateFormat df = new  SimpleDateFormat("yyyy-MM-dd");
        String date  = df.format(txtdoj.getDate());
        
        
        try {
            pst = con.prepareStatement("insert into trainer(name,age,address,mobile,doj)values(?,?,?,?,?)");
            pst.setString(1, tname);
            pst.setString(2, age);
            pst.setString(3, address);
            pst.setString(4, mobile);
            pst.setString(5, date);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "TRAINER ADDED");
            
            txttrainer.setText("");
            txtage.setText("");
            txtaddress.setText("");
            txtmob.setText("");
            txttrainer.requestFocus();
            
            table_load();
            
        } catch (SQLException ex) {
            Logger.getLogger(trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try{
        df = ( DefaultTableModel)jTable1.getModel();
        int selected = jTable1.getSelectedRow();
        int id = Integer.parseInt(df.getValueAt(selected, 0).toString());
        
        txttrainer.setText(df.getValueAt(selected, 1).toString());
        txtage.setText(df.getValueAt(selected, 2).toString());
        txtaddress.setText(df.getValueAt(selected, 3).toString());
        txtmob.setText(df.getValueAt(selected, 4).toString());
        
        
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)df.getValueAt(selected, 5));
            txtdoj.setDate(date);
            
            jButton1.setEnabled(false);
            
            
            
        } catch (ParseException ex) {
            Logger.getLogger(trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        df = ( DefaultTableModel)jTable1.getModel();
        int selected = jTable1.getSelectedRow();
        int id = Integer.parseInt(df.getValueAt(selected, 0).toString());
        
        
         String tname = txttrainer.getText();
        String age = txtage.getText();
        String address = txtaddress.getText();
        String mobile = txtmob.getText();
        SimpleDateFormat df = new  SimpleDateFormat("yyyy-MM-dd");
        String date  = df.format(txtdoj.getDate());
        
        
        try {
            pst = con.prepareStatement("update trainer set name = ?, age = ?, address = ?, mobile = ?, doj = ? where id = ?");
            pst.setString(1, tname);
            pst.setString(2, age);
            pst.setString(3, address);
            pst.setString(4, mobile);
            pst.setString(5, date);
            pst.setInt(6, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "TRAINER UPDATED");
            
            txttrainer.setText("");
            txtage.setText("");
            txtaddress.setText("");
            txtmob.setText("");
            txttrainer.requestFocus();
            
            jButton1.setEnabled(true);
            table_load();
            
        } catch (SQLException ex) {
            Logger.getLogger(trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         df = ( DefaultTableModel)jTable1.getModel();
        int selected = jTable1.getSelectedRow();
        int id = Integer.parseInt(df.getValueAt(selected, 0).toString());
        
        
        
        try {
            pst = con.prepareStatement("delete from trainer where id = ?");
            
            pst.setInt(1, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "TRAINER DELETED");
            
            txttrainer.setText("");
            txtage.setText("");
            txtaddress.setText("");
            txtmob.setText("");
            txttrainer.requestFocus();
            
            jButton1.setEnabled(true);
            table_load();
            
        } catch (SQLException ex) {
            Logger.getLogger(trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtmobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobActionPerformed

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
            java.util.logging.Logger.getLogger(trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trainer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtage;
    private com.toedter.calendar.JDateChooser txtdoj;
    private javax.swing.JTextField txtmob;
    private javax.swing.JTextField txttrainer;
    // End of variables declaration//GEN-END:variables
}