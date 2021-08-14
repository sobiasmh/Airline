package Airline;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Color;

public class Main extends javax.swing.JFrame {

    
    public Main() {
        initComponents();
    }

   
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        
        JLabel lblNewLabel = new JLabel("Welcome To Airline System.");
        lblNewLabel.setForeground(new Color(224, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 43));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1Layout.setHorizontalGroup(
        	jDesktopPane1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jDesktopPane1Layout.createSequentialGroup()
        			.addGap(366)
        			.addComponent(lblNewLabel)
        			.addContainerGap(938, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
        	jDesktopPane1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jDesktopPane1Layout.createSequentialGroup()
        			.addGap(146)
        			.addComponent(lblNewLabel)
        			.addContainerGap(547, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayout(jDesktopPane1Layout);

        jMenu1.setText("Customer");

        jMenuItem1.setText("Add Customer");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Search Customer");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tickets");

        jMenuItem3.setText("Book Ticket");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem6.setText("Ticket List");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);
        
        cancel = new JMenuItem();
        
        cancel.setText("Cancellation");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        
        mntmFlightList = new JMenuItem();
        mntmFlightList.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		flightlistActionPerformed(e);
        	}
        });
        mntmFlightList.setText("Flight List");
        jMenu2.add(mntmFlightList);
        jMenu2.add(cancel);
        
        PaymentDetails = new JMenuItem();
        PaymentDetails.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		PaymentDetailsActionPerformed(e);
        	}
        });
        PaymentDetails.setText("Payment Details");
        jMenu2.add(PaymentDetails);

        jMenu3.setText("Flight");

        jMenuItem4.setText("Add Flight");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);
        
        FlightInformation = new JMenuItem();
        FlightInformation.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		FlightInformationActionPerformed(e);
        	}
        });
        FlightInformation.setText("Flight Information");
        jMenu3.add(FlightInformation);
        
        Journey = new JMenuItem();
        Journey.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JourneyActionPerformed(e);
        	}
        });
        Journey.setText("Check Journey Details");
        jMenu3.add(Journey);
        
        PILOT = new JMenuItem();
        PILOT.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		PILOTActionPerformed(e);
        	}
        });
        PILOT.setText("Pilot Information");
        jMenu3.add(PILOT);

        jMenu4.setText("ADD");

        jMenuItem5.setText("Add User ");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);
        
        mntmAddEmployee = new JMenuItem();
        mntmAddEmployee.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mntmAddEmployeeActionPerformed(e);
        	}
        });
        mntmAddEmployee.setText("Add Employee");
        jMenu4.add(mntmAddEmployee);
        
        mntmAddPilot = new JMenuItem();
        mntmAddPilot.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mntmAddPilotActionPerformed(e);
        	}
        });
        mntmAddPilot.setText("Add Pilot");
        jMenu4.add(mntmAddPilot);
        
        mntmAddPlaneDetails = new JMenuItem();
        mntmAddPlaneDetails.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mntmAddPlaneDetailsActionPerformed(e);
        	}
        });
        mntmAddPlaneDetails.setText("Add Plane details");
        jMenu4.add(mntmAddPlaneDetails);

        setJMenuBar(jMenuBar1);
        
        mnList = new JMenu();
        mnList.setText("List");
        jMenuBar1.add(mnList);
        
        mntmUserList = new JMenuItem();
        mntmUserList.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mntmUserListActionPerformed(e);
        	}
        });
        mntmUserList.setText("User List");
        mnList.add(mntmUserList);
        
        mntmEmployeeList = new JMenuItem();
        mntmEmployeeList.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mntmEmployeeListActionPerformed(e);
        	}
        });
        mntmEmployeeList.setText("Employee List");
        mnList.add(mntmEmployeeList);
        
        mntmCustomerList = new JMenuItem();
        mntmCustomerList.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mntmCustomerListActionPerformed(e);
        	}
        });
        mntmCustomerList.setText("Customer List");
        mnList.add(mntmCustomerList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        addCustomer cus = new addCustomer();
        jDesktopPane1.add(cus);
        cus.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    private void JourneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        Journey_Details jd = new Journey_Details();
        jDesktopPane1.add(jd);
        jd.setVisible(true);
        
    }
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
        searchCustomer scus = new searchCustomer();
        jDesktopPane1.add(scus);
        scus.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    private void flightlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        flightlist fl = new flightlist();
        jDesktopPane1.add(fl);
        fl.setVisible(true);
        
    }
    
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        addflight f = new addflight();
        jDesktopPane1.add(f);
        f.setVisible(true);
        
    }
    private void mntmCustomerListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        CustomerList cl = new CustomerList();
        jDesktopPane1.add(cl);
        cl.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    private void PaymentDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        Payment p = new Payment();
        jDesktopPane1.add(p);
        p.setVisible(true);
        
    }
    private void mntmAddPlaneDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        PlaneDetail pd = new PlaneDetail();
        jDesktopPane1.add(pd);
        pd.setVisible(true);
        
    }
    private void mntmEmployeeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    	EmployeeList el = new EmployeeList();
        jDesktopPane1.add(el);
        el.setVisible(true);
        
    }
    private void FlightInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    	Flight_Info fi = new Flight_Info();
        jDesktopPane1.add(fi);
        fi.setVisible(true);
        
    }
    private void mntmAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    	EmployeeCreation e = new EmployeeCreation();
        jDesktopPane1.add(e);
        e.setVisible(true);
        
    }
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
         ticket t = new ticket();
        jDesktopPane1.add(t);
        t.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        
        ticketreport ti = new ticketreport();
        jDesktopPane1.add(ti);
        ti.setVisible(true);
        
        
    }
    private void mntmAddPilotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        
        addPilot ap = new addPilot();
        jDesktopPane1.add(ap);
        ap.setVisible(true);
        
        
    }
    private void mntmUserListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        
        UserList u = new UserList();
        jDesktopPane1.add(u);
        u.setVisible(true);
        
        
    }
    //GEN-LAST:event_jMenuItem6ActionPerformed
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        
        ticketCancel tC = new ticketCancel();
        jDesktopPane1.add(tC);
        tC.setVisible(true);
        
        
    }//G
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        
         userCreation u = new userCreation();
        jDesktopPane1.add(u);
        u.setVisible(true);
        
        
    }
    private void PILOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        
         PilotList pl = new PilotList();
        jDesktopPane1.add(pl);
        pl.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private JMenuItem cancel;
    private JMenuItem PaymentDetails;
    private JMenuItem FlightInformation;
    private JMenuItem Journey;
    private JMenuItem PILOT;
    private JMenuItem mntmAddEmployee;
    private JMenuItem mntmAddPilot;
    private JMenu mnList;
    private JMenuItem mntmUserList;
    private JMenuItem mntmEmployeeList;
    private JMenuItem mntmAddPlaneDetails;
    private JMenuItem mntmCustomerList;
    private JMenuItem mntmFlightList;
}
