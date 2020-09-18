package semester_project;

import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.sql.*;
import javax.swing.*;

public class PrintgetAmount extends javax.swing.JFrame {

    String stat = "", name = "", cnic = "", d = "", s = "", string = "", str = "", word = "";
    double amount = 0, newAmount = 0, money = 0;
    boolean bool = false;
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    boolean b;
    String re;
    String con1,con2,stat1,stat2;

    public PrintgetAmount() {
        initComponents();
    }

    public PrintgetAmount(String stat, String s, String cnic, String d, double amount, String string,String re) {
        initComponents();
        this.stat = stat;
        this.string = string;
        this.s = s;
        this.cnic = cnic;
        this.d = d;
        this.amount = amount;
        this.re = re;
        if("r".equals(re)){
            con1 = stat1 = "Recepient_Personal_Info";
            con2 = stat2 = "Recepient_Account";
        }            
        else{
            con1 = "Emp_Info";
            stat1 = "Emp_SignUp_Info";
            con2 = "Emp_Account";
            stat2 = "Emp_Account_Info";
        }
    }

    public void setAll(String re) {

    }

    public void withdraw(double amount) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        generate = new javax.swing.JButton();
        print = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        balance = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(109, 192, 197));

        jLabel4.setBackground(new java.awt.Color(153, 128, 120));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setText("Money Transaction");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(615, 615, 615)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1061, 1061, 1061))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("RECEIPTS");

        back.setBackground(new java.awt.Color(51, 51, 255));
        back.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(51, 51, 255));
        exit.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Enter amount:");

        generate.setBackground(new java.awt.Color(51, 51, 255));
        generate.setForeground(new java.awt.Color(255, 255, 255));
        generate.setText("Generate Receipt");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        print.setBackground(new java.awt.Color(51, 51, 255));
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("Print Receipt");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        ok.setBackground(new java.awt.Color(51, 51, 255));
        ok.setForeground(new java.awt.Color(255, 255, 255));
        ok.setText("Ok");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(244, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(generate)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(220, 220, 220))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(306, 306, 306))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(ok)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generate)
                    .addComponent(print))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(exit))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Options c = new Options(cnic,re);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        amount = Double.parseDouble(balance.getText());
        if ("D".equals(string)) {
            if (amount > 0) {
                con = Semester_Project.connectDB("jdbc:sqlite:C:\\Users\\Lenovo\\Documents\\Databases\\Emp_Info.db");
                try {
                    String query = "SELECT Name  from Emp_SignUp_Info WHERE CNIC = ?";
                    ps = con.prepareStatement(query);
                    ps.setString(1, cnic);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        name = rs.getString("Name");
                    }
                    con = Semester_Project.connectDB("jdbc:sqlite:C:\\Users\\Lenovo\\Documents\\Databases\\Donation.db");
                    String query2 = "insert into Donations values(?,?,?,?)";
                    ps = con.prepareStatement(query2);
                    ps.setString(1, cnic);
                    ps.setString(2, word);
                    ps.setString(4, d);
                    ps.setDouble(3, amount);

                    con = Semester_Project.connectDB("jdbc:sqlite:C:\\Users\\Lenovo\\Documents\\Databases\\Emp_Account.db");

                    String que = "SELECT Amount FROM Emp_Account_Info WHERE CNIC = ?";

                    ps.execute();
                    ps = con.prepareStatement(que);
                    ps.setString(1, cnic);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        money = Double.parseDouble(rs.getString("Amount"));
                    }

                    if (money - amount >= 0) {
                        newAmount = money - amount;
                        String que2 = "UPDATE Emp_Account_Info SET Amount = ? WHERE CNIC = ?";
                        ps = con.prepareStatement(que2);
                        ps.setString(2, cnic);
                        ps.setDouble(1, newAmount);
                        ps.execute();
                    } else {
                        JOptionPane.showMessageDialog(null, "You don't have enough money");
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Hasn't entered connection");
            }
        } else if ("w".equals(string)) {
            if (amount > 0) {
                try {
                    con = Semester_Project.connectDB("jdbc:sqlite:C:\\Users\\Lenovo\\Documents\\Databases\\"+con1+".db");
                    try {
                        String query = "SELECT Name  from "+stat1+" WHERE CNIC = ?";
                        ps = con.prepareStatement(query);
                        ps.setString(1, cnic);
                        rs = ps.executeQuery();
                        while (rs.next()) {

                            name = rs.getString("Name");
                            System.out.println(name);
                        }
                        con = Semester_Project.connectDB("jdbc:sqlite:C:\\Users\\Lenovo\\Documents\\Databases\\"+con2+".db");
                        if (con != null) {
                            String query2 = "SELECT Amount FROM "+stat2+" WHERE CNIC = ?";
                            ps = con.prepareStatement(query2);
                            ps.setString(1, cnic);
                            rs = ps.executeQuery();
                            while (rs.next()) {
                                money = Double.parseDouble(rs.getString("Amount"));
                            }
                            String query3 = "UPDATE "+stat2+" SET Amount = ? where CNIC= ?";
                            ps = con.prepareStatement(query3);
                            newAmount = (money - amount);
                            if (newAmount >= 0) {
                                ps.setDouble(1, newAmount);
                                ps.setString(2, cnic);
                                ps.executeUpdate();
                                JOptionPane.showMessageDialog(null, "Amount Withdrawn");
                            } else {
                                JOptionPane.showMessageDialog(null, "You don't have enough balance");
                            }
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }

                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Invalid amount");
            }
        }
    }//GEN-LAST:event_okActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        try {
            area.setText("************************************************\n");
            area.setText(area.getText() + "*" + stat + "*\n");
            area.setText(area.getText() + "************************************************\n");
            area.setText(area.getText() + "\n");
            area.setText(area.getText() + "Name: " + name + "\n");
            area.setText(area.getText() + "CNIC:  " + cnic + "\n");
            area.setText(area.getText() + s + " " + amount + "\n");
            area.setText(area.getText() + "Current Amount: " + newAmount + "\n\n");
            area.setText(area.getText() + "Date:  " + d + "\n");
            area.setText(area.getText() + "\n");
            area.setText(area.getText() + "*********************************");
            area.setEditable(false);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_generateActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        try {
            area.print();
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_printActionPerformed




    public static void main(String args[]) throws SQLException {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrintgetAmount().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton back;
    private javax.swing.JTextField balance;
    private javax.swing.JButton exit;
    private javax.swing.JButton generate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ok;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables
}
