package Airline;

import java.awt.Image;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ticketCancel extends javax.swing.JInternalFrame {

        public ticketCancel() {
        	getContentPane().setBackground(new Color(224, 255, 255));
        initComponents();
      //  autoID();
    }

    Connection con;
    PreparedStatement pst;
   
    private void initComponents() {
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setBackground(new Color(60, 179, 113));
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcustid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JLabel();
        txtlastname = new javax.swing.JLabel();
        txtpassport = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txttotal = new javax.swing.JLabel();

        jLabel5.setText("Customer ID");

        jLabel6.setText("FirstName");

        jLabel7.setText("LastName");

        jLabel8.setText("Passportno");

        txtfirstname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtfirstname.setForeground(new java.awt.Color(255, 0, 0));
        txtfirstname.setText("jLabel9");

        txtlastname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtlastname.setForeground(new java.awt.Color(255, 0, 0));
        txtlastname.setText("jLabel10");

        txtpassport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtpassport.setForeground(new java.awt.Color(255, 0, 0));
        txtpassport.setText("jLabel11");

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jLabel15 = new javax.swing.JLabel();
        
                jLabel15.setText("Class");
        jLabel12 = new javax.swing.JLabel();
        
                jLabel12.setText("Flight ID");
        
        lblTicketId = new JLabel();
        lblTicketId.setText("Ticket ID");
        
        classs = new JLabel();
        classs.setText("jLabel12");
        classs.setForeground(Color.RED);
        classs.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        flightIdtext = new JLabel();
        flightIdtext.setText("jLabel13");
        flightIdtext.setForeground(Color.RED);
        flightIdtext.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        ticketidtext = new JLabel();
        ticketidtext.setText("jLabel14");
        ticketidtext.setForeground(Color.RED);
        ticketidtext.setFont(new Font("Tahoma", Font.BOLD, 14));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGap(57)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addComponent(jLabel5)
        					.addGap(34)
        					.addComponent(txtcustid, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
        					.addComponent(jButton4))
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel6)
        						.addComponent(jLabel7)
        						.addComponent(jLabel8)
        						.addComponent(jLabel15)
        						.addComponent(jLabel12)
        						.addComponent(lblTicketId, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
        					.addGap(39)
        					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(ticketidtext, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
        						.addComponent(flightIdtext, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
        						.addComponent(classs, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtpassport)
        						.addComponent(txtlastname)
        						.addComponent(txtfirstname))))
        			.addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGap(20)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(txtcustid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton4))
        			.addGap(26)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(txtfirstname))
        			.addGap(31)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel7)
        				.addComponent(txtlastname))
        			.addGap(36)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel8)
        				.addComponent(txtpassport))
        			.addGap(29)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel15)
        				.addComponent(classs, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel12)
        				.addComponent(flightIdtext, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
        			.addGap(32)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblTicketId)
        				.addComponent(ticketidtext, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3.setLayout(jPanel3Layout);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txttotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txttotal.setForeground(new java.awt.Color(255, 0, 0));
        txttotal.setText("jLabel4");
        
        lblTicketCancel = new JLabel();
        lblTicketCancel.setText("Ticket Cancel");
        lblTicketCancel.setForeground(Color.RED);
        lblTicketCancel.setFont(new Font("Tahoma", Font.BOLD, 24));
        
        JButton btnClose = new JButton();
        btnClose.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		btnCloseActionPerformed(e);
        	}
        });
        btnClose.setText("Close");
        
        JButton btnUpdateSystem = new JButton();
        btnUpdateSystem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		btnUpdateSystemActionPerformed(e);
        	}
        });
        btnUpdateSystem.setText("Update System");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(txttotal, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
        					.addGap(220))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 588, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGap(57)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(lblTicketCancel, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnClose, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnUpdateSystem, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(80)
        					.addComponent(lblTicketCancel)
        					.addGap(213)
        					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnUpdateSystem, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        					.addGap(9)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(txttotal, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnClose, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(62)
        					.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(27, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
          String id = txtcustid.getText();
        
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedata?autoReconnect=true&useSSL=false","root","sobia");
            pst = con.prepareStatement("select * from ticket, Customer where Customer_CustomerId = ? and ticket.Customer_CustomerId=customer.CustomerId");
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next() == false)
            {
                JOptionPane.showMessageDialog(this, "Record not Found");
            }
            else
            {
                 String fname = rs.getString("FirstName");
                 String lname = rs.getString("LastName");
                 String clas = rs.getString("Class");
                 String ticketId = rs.getString("TicketId");
                 String flightid = rs.getString("Flight_FlightId");
                 String passport = rs.getString("PassportNo");
        
                 
                 txtfirstname.setText(fname.trim());
                 txtlastname.setText(lname.trim());
                 classs.setText(clas.trim());
                 flightIdtext.setText(flightid.trim());
                 ticketidtext.setText(ticketId.trim());
                  txtpassport.setText(passport.trim());


            
        } 
            
      
                
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(ticketCancel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ticketCancel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    	String id = ticketidtext.getText();
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedata?autoReconnect=true&useSSL=false","root","sobia");
            pst = con.prepareStatement("delete from ticket where TicketId = ?");
            pst.setString(1, id);
            
            if(ticketidtext.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Record not Found");
            }
            else
            {
            	int a=JOptionPane.showConfirmDialog(rootPane, "Do you really want to Cancel your ticket?", "Cancellation", JOptionPane.YES_NO_OPTION);
                
                if(a==JOptionPane.YES_OPTION)
                {
                        
                        pst = con.prepareStatement("INSERT into cancellation(CancellationDate,Ticket_TicketId,Ticket_Customer_CustomerId,Ticket_Flight_FlightId) values(?,?,?,?)");
                        LocalDateTime now = LocalDateTime.now();
                        String isoFormat = DateTimeFormatter.ISO_INSTANT.format(now.toInstant(ZoneOffset.UTC));
                        pst.setString(1, isoFormat);
                        pst.setString(2, id);
                        pst.setString(3, txtcustid.getText());
                        pst.setString(4, flightIdtext.getText());
                        pst.executeUpdate();
                        
                     
                   }


        } 
            
      
                
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(ticketCancel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ticketCancel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
    private void btnUpdateSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    	String id = txtcustid.getText();
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedata?autoReconnect=true&useSSL=false","root","sobia");
            pst = con.prepareStatement("delete from ticket where Customer_CustomerID = ?");
            pst.setString(1, id);
            pst.executeUpdate();
            
            if(txtcustid.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Record not Found");
            }
            else
            {
            	JOptionPane.showMessageDialog(rootPane, "Cancelled Successfully", "Ticket Cancellation", JOptionPane.INFORMATION_MESSAGE);
                flightIdtext.setText("");
                ticketidtext.setText("");
                 txtpassport.setText("");
                 txtfirstname.setText("");  
                 txtcustid.setText("");
                 txtlastname.setText("");
             classs.setText("");
                JOptionPane.showMessageDialog(this, "Deleted and Update");



        } 
            
      
                
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(ticketCancel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ticketCancel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        this.hide();
        
    }//GEN-LAST:event_jButton2ActionPerformed
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtcustid;
    private javax.swing.JLabel txtfirstname;
    private javax.swing.JLabel txtlastname;
    private javax.swing.JLabel txtpassport;
    private javax.swing.JLabel txttotal;
    private JLabel lblTicketId;
    private JLabel classs;
    private JLabel flightIdtext;
    private JLabel ticketidtext;
    private JLabel lblTicketCancel;
}
