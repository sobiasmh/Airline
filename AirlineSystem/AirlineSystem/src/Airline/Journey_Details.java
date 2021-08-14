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
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Journey_Details extends javax.swing.JInternalFrame {
	
        public Journey_Details() {
        	getContentPane().setBackground(new Color(224, 255, 255));
        initComponents();
    }

    Connection con;
    PreparedStatement pst;
   
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(new Color(60, 179, 113));
        txtsource = new javax.swing.JComboBox<>();
        txtdepart = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(new Color(255, 255, 0));
        jLabel1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setForeground(new Color(255, 255, 0));
        jLabel2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
        	@Override
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
        		jScrollPane1MouseClicked(evt);
        	}
        });
       
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select City", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        txtsource.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Karachi", "Islamabad", "Lahore", "Quetta", "Sialkot", "Peshawar" }));

        txtdepart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Karachi", "Islamabad", "Lahore", "Quetta", "Sialkot", "Peshawar" }));

        jLabel1.setText("Source");

        jLabel2.setText("Departure");

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        			.addGap(25)
        			.addComponent(jLabel1)
        			.addGap(38)
        			.addComponent(txtsource, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
        			.addGap(87)
        			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(txtdepart, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
        			.addGap(36)
        			.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(52)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(txtsource, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        				.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(txtdepart, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
        			.addGap(64))
        );
        jPanel1.setLayout(jPanel1Layout);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight No", "Flight Name", "Source", "Departure", "Date", "DepTime", "ArrTime", "Charge", "TicketID","Class","Seat","CustomerID"
            }
        ));
        
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(805, Short.MAX_VALUE)
        			.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
        			.addGap(40))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(32)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jScrollPane1, Alignment.LEADING)
        				.addComponent(jPanel1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 925, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(42)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(20)
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        			.addGap(18)
        			.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addGap(26))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        String source = txtsource.getSelectedItem().toString().trim();
        String depart = txtdepart.getSelectedItem().toString().trim();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedata?autoReconnect=true&useSSL=false","root","sobia");
             pst = con.prepareStatement("SELECT * from flight,ticket WHERE Source = ? and Departure = ? and ticket.Flight_FlightId=flight.FlightId");
             
             
          
             
             pst.setString(1, source);
             pst.setString(2, depart);
             ResultSet rs = pst.executeQuery();
             
             ResultSetMetaData rsm = rs.getMetaData();
             int c;
             c = rsm.getColumnCount();
             
             DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
             
             if(rs.next())
             {
                 Vector v2 = new Vector();
                 
                 for(int i = 1; i<= c; i ++)
                 {
                     v2.add(rs.getString("FlightId"));
                  v2.add(rs.getString("FlightName"));
                  v2.add(rs.getString("Source"));
                  v2.add(rs.getString("Departure"));
                  v2.add(rs.getString("Date"));
                  v2.add(rs.getString("DepartTime"));
                  v2.add(rs.getString("ArrivalTime"));
                  v2.add(rs.getString("FlightCharge"));
                  v2.add(rs.getString("TicketId"));
                  v2.add(rs.getString("Class"));
                  v2.add(rs.getString("Seat"));
                  v2.add(rs.getString("Customer_CustomerId"));






                 }
                 
                 Df.addRow(v2);
                 

                	 
                 
                 
             }
             else{
                 JOptionPane.showMessageDialog(null,"No Flights between Source and Destination");
                 
             }
             
             
             
             
             
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ticket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
        
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed
    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
    	Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedata?autoReconnect=true&useSSL=false","root","sobia");
       	 pst = con.prepareStatement("insert into reservation(JourneyDate,JourneyTime,Source,Destination,Ticket_TicketId,Ticket_Flight_FlightId,"
       	 		+ "Ticket_Flight_FlightId) values(?,?,?,?,?,?,?,?)");
       	 
       	DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        
        int selectIndex = jTable1.getSelectedRow();
        
       	 pst.setString(1,Df.getValueAt(selectIndex, 4).toString());
       	 pst.setString(2,Df.getValueAt(selectIndex, 5).toString());
       	 pst.setString(3,Df.getValueAt(selectIndex, 2).toString());
       	 pst.setString(4,Df.getValueAt(selectIndex, 3).toString());
       	 pst.setString(5,Df.getValueAt(selectIndex, 8).toString());
       	 pst.setString(6,Df.getValueAt(selectIndex, 0).toString());

       	 pst.executeUpdate();        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ticket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ticket.class.getName()).log(Level.SEVERE, null, ex);
        }}
    
     //GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        this.hide();
        
    }//GEN-LAST:event_jButton2ActionPerformed
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> txtdepart;
    private javax.swing.JComboBox<String> txtsource;
    // End of variables declaration//GEN-END:variables
}
