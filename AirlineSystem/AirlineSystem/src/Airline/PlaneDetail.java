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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JTextField;
import java.awt.Choice;

public class PlaneDetail extends javax.swing.JInternalFrame {

        public PlaneDetail() {
        	getContentPane().setBackground(new Color(224, 255, 255));
        	setBackground(new Color(224, 255, 255));
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
        jLabel8 = new javax.swing.JLabel();
        flightname = new javax.swing.JLabel();
        txttotal = new javax.swing.JLabel();

        jLabel5.setText("Flight ID");

        jLabel6.setText("FlightName");

        jLabel7.setText("Capacity");

        jLabel8.setText("Classes");

        flightname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        flightname.setForeground(new java.awt.Color(255, 0, 0));
        flightname.setText("jLabel9");
        c1.setForeground(new Color(47, 79, 79));
		c1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		c1.setBounds(174, 66, 156, 20);
		jPanel3.add(c1);
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedata?autoReconnect=true&useSSL=false","root","sobia");
            pst = con.prepareStatement("select * from flight");
          //  pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
	        while(rs.next()){
	        	c1.add(rs.getString("FlightId"));
	            }
	        }catch(Exception ee) { }
		
		c1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				try{
					Class.forName("com.mysql.jdbc.Driver");
		            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedata?autoReconnect=true&useSSL=false","root","sobia");
		            pst = con.prepareStatement("select flightName from flight where FlightId=?");
		            pst.setString(1, c1.getSelectedItem());
		            ResultSet rs = pst.executeQuery();
		            while(rs.next()){
		                flightname.setText(rs.getString("FlightName"));
		                pst = con.prepareStatement("select * from planedetail where Flight_FlightId=?");
		                pst.setString(1, c1.getSelectedItem());
		                ResultSet r1 = pst.executeQuery();
		                while(r1.next()) {
		                capacityy.setText(r1.getString("Capacity"));
		            	classess.setText(r1.getString("ClassName"));
		            	pst.executeUpdate();
		            	
		            }
		            }
		        }catch(Exception ee){}
				
			}
		});
        capacityy = new JTextField();
        
        classess = new JTextField();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGap(49)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
        					.addGap(117))
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(classess, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
        					.addGap(300))
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
        					.addGap(63)
        					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(capacityy, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
        						.addComponent(flightname))
        					.addGap(303))))
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGap(61)
        			.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        				.addComponent(flightname))
        			.addGap(18)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        				.addComponent(capacityy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(28)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        				.addComponent(classess, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel3.setLayout(jPanel3Layout);

        txttotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txttotal.setForeground(new java.awt.Color(255, 0, 0));
        txttotal.setText("jLabel4");
        
        JLabel label = new JLabel();
        label.setText("Plane Details");
        label.setForeground(Color.RED);
        label.setFont(new Font("Tahoma", Font.BOLD, 24));
        
        JButton button = new JButton();
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		buttonActionPerformed(e);
        	}
        });
        button.setText("ADD");
        
        JButton button_1 = new JButton();
        button_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		button_1ActionPerformed(e);
        	}
        });
        button_1.setText("Close");
        
        btnUpdate = new JButton();
        btnUpdate.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		btnUpdateActionPerformed(e);
        	}
        });
        btnUpdate.setText("Update");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(txttotal, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
        					.addGap(91)))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(label, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
        				.addComponent(button, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
        				.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
        			.addGap(252))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(62)
        			.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
        			.addGap(38)
        			.addComponent(txttotal, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(67, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(89)
        			.addComponent(label, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
        			.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(button, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addGap(90))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
     
    
    
    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    	String id = c1.getSelectedItem();
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedata?autoReconnect=true&useSSL=false","root","sobia");
            
            	pst = con.prepareStatement("insert into planedetail(Capacity,ClassName,Flight_FlightId)values(?,?,?)");
            	pst.setString(1, capacityy.getText());
                pst.setString(2, classess.getText());
                pst.setString(3, c1.getSelectedItem());
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Added Successfully");
            }
            catch (ClassNotFoundException ex) {
            Logger.getLogger(ticketCancel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ticketCancel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
	private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
		String id = c1.getSelectedItem();
		try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedata?autoReconnect=true&useSSL=false","root","sobia");
            pst = con.prepareStatement("update planedetail set Capacity=?,ClassName=? where Flight_FlightId = ?");
        	pst.setString(1, capacityy.getText());
            pst.setString(2, classess.getText());
            pst.setString(3, c1.getSelectedItem());
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Updated Successfully");
            }
		catch (ClassNotFoundException ex) {
            Logger.getLogger(ticketCancel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ticketCancel.class.getName()).log(Level.SEVERE, null, ex);
        }
		
	}
    private void button_1ActionPerformed(java.awt.event.ActionEvent evt) {
    	this.hide();
    }
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel flightname;
    private javax.swing.JLabel txttotal;
    private JTextField capacityy;
    private JTextField classess;
    /**
     * @wbp.nonvisual location=218,159
     */
    private final Choice c1 = new Choice();
    private JButton btnUpdate;
}
