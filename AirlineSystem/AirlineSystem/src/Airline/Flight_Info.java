package Airline;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

import net.proteanit.sql.DbUtils;

public class Flight_Info extends JFrame{  //Second Frame
	Connection con;
    PreparedStatement pst;
    private JTextField textField;
    private JTable table;
    
    public static void main(String[] args){		 
	new Flight_Info().setVisible(true);    
    }
    
    public Flight_Info(){
        
        getContentPane().setBackground(new Color(224, 255, 255));
        getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(860,523);
	getContentPane().setLayout(null);
	setVisible(true);
		
	JLabel Fcode = new JLabel("FLIGHT CODE");
	Fcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Fcode.setBounds(50, 100, 200, 30);
	getContentPane().add(Fcode);
	
   
		
	JLabel FlightDetails = new JLabel("FLIGHT INFORMATION");
	FlightDetails.setFont(new Font("Tahoma", Font.PLAIN, 31));
	FlightDetails.setForeground(new Color(0, 128, 0));
	FlightDetails.setBounds(50, 20, 570, 35);
	getContentPane().add(FlightDetails);
		
	JButton btnShow = new JButton("SHOW BY ID");
	btnShow.setBackground(new Color(192, 192, 192));
	btnShow.setForeground(new Color(46, 139, 87));
	btnShow.setFont(new Font("Tahoma", Font.PLAIN, 14));
	
        btnShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
	
                String id = textField.getText();
                
                try {
                	Class.forName("com.mysql.jdbc.Driver");
		            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedata?autoReconnect=true&useSSL=false","root","sobia");
		            pst = con.prepareStatement("select * from flight NATURAL join planedetail where FlightId = ? and planedetail.Flight_FlightId=flight.FlightId");
		            pst.setString(1, id);
                    ResultSet rs = pst.executeQuery();
                    table.setModel(DbUtils.resultSetToTableModel(rs));	
                    //pst.executeUpdate();
                }catch(SQLException e){
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        
        
        

        btnShow.setBounds(442, 99, 120, 30);
	getContentPane().add(btnShow);
		
	textField = new JTextField();
        textField.setBounds(220, 100, 200, 30);
	getContentPane().add(textField);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(23, 245, 839, 355);
	getContentPane().add(scrollPane);
	
	table = new JTable();
	scrollPane.setViewportView(table);
	table.setCellSelectionEnabled(true);
	table.setColumnSelectionAllowed(true);
	
	JButton btnShowAll = new JButton("SHOW ALL");
	btnShowAll.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			btnShowAllActionPerformed(e);
		}
	});
	
	btnShowAll.setBackground(new Color(192, 192, 192));
	btnShowAll.setForeground(new Color(46, 139, 87));
	btnShowAll.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnShowAll.setBounds(442, 155, 120, 30);
	getContentPane().add(btnShowAll);
		
	
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	setSize(900,650);
        setVisible(true);
        setLocation(400,200);
		
    }
    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {
        
    	        
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedata?autoReconnect=true&useSSL=false","root","sobia");
            pst = con.prepareStatement("select * from flight NATURAL join planedetail where planedetail.Flight_FlightId=flight.FlightId");
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));	
        }catch(SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}