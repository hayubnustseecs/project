package semester_project;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class Recepient_SignUp_Cont extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement ps = null;
    PreparedStatement ps2 = null;
    ResultSet rs = null;

    public Recepient_SignUp_Cont() {
        initComponents();
    }
    String cnic;
    String name;
    String fname;

    public Recepient_SignUp_Cont(String cnic, String name, String fname) {
        this.cnic = cnic;
        this.name = name;
        this.fname = fname;

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        fMembers = new javax.swing.JTextField();
        fatherIncome = new javax.swing.JTextField();
        familySupport = new javax.swing.JTextField();
        plotsCost = new javax.swing.JTextField();
        landArea = new javax.swing.JTextField();
        landCost = new javax.swing.JTextField();
        vehiclesCost = new javax.swing.JTextField();
        houseSize = new javax.swing.JTextField();
        houseCost = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        utilityBills = new javax.swing.JTextField();
        medicalBills = new javax.swing.JTextField();
        educationBills = new javax.swing.JTextField();
        accomodationBills = new javax.swing.JTextField();
        miscBills = new javax.swing.JTextField();
        totalBills = new javax.swing.JTextField();
        next = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        fatherStatus = new javax.swing.JComboBox<>();
        qfamilySupport = new javax.swing.JComboBox<>();
        noOfPlots = new javax.swing.JComboBox<>();
        noOfVehicles = new javax.swing.JComboBox<>();
        noOfCars = new javax.swing.JComboBox<>();
        noOfBikes = new javax.swing.JComboBox<>();
        qHouse = new javax.swing.JComboBox<>();
        back = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(109, 192, 197));

        jLabel19.setBackground(new java.awt.Color(153, 128, 120));
        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel19.setText("  Project Insaniyat");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(659, 659, 659)
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addGap(1228, 1228, 1228))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Family & Property Information");

        jLabel2.setText("Family Members:");

        jLabel3.setText("Father Status:");

        jLabel5.setText("Income of Father:");

        jLabel6.setText("Did you have any support from any Family Member:");

        jLabel7.setText("How much did your Family Members support you(mention in rupees): ");

        jLabel8.setText("How many plots have you:");

        jLabel9.setText("Current cost of your Plots: ");

        jLabel10.setText("Agriculture land area(in sq metres):");

        jLabel11.setText("Current Cost of agricultural land area(in rupees):");

        jLabel12.setText("How many vehicles have you:");

        jLabel13.setText("Quantity of Cars:");

        jLabel14.setText("Quantity of Bkies:");

        jLabel15.setText("Current cost of Vehicles:");

        jLabel16.setText("Have you your own house:");

        jLabel17.setText("Size of House(in sq meters):");

        jLabel18.setText("Cost of House:");

        familySupport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familySupportActionPerformed(evt);
            }
        });

        plotsCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plotsCostActionPerformed(evt);
            }
        });

        houseCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseCostActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setText("Expenditures");

        jLabel21.setText("Utility Expenditures:");

        jLabel22.setText("Medical Expenditures:");

        jLabel23.setText("Education Expenditures:");

        jLabel24.setText("Accomodation Expenditures:");

        jLabel25.setText("Misc. Expenditures:");

        jLabel26.setText("Total Expenditures:");

        utilityBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utilityBillsActionPerformed(evt);
            }
        });

        medicalBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalBillsActionPerformed(evt);
            }
        });

        next.setBackground(new java.awt.Color(51, 51, 255));
        next.setForeground(new java.awt.Color(255, 255, 255));
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        Save.setBackground(new java.awt.Color(51, 51, 255));
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        fatherStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alive", "Decreased" }));
        fatherStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatherStatusActionPerformed(evt);
            }
        });

        qfamilySupport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        noOfPlots.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        noOfVehicles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));

        noOfCars.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));

        noOfBikes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3" }));

        qHouse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        back.setBackground(new java.awt.Color(51, 51, 255));
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(51, 51, 255));
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(fMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fatherStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fatherIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(qfamilySupport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(familySupport, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(noOfPlots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(plotsCost, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(qHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(noOfCars, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(noOfBikes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23)
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(vehiclesCost, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(noOfVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(landArea, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(landCost, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel27)
                                .addComponent(jLabel20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 673, Short.MAX_VALUE)
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(utilityBills, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(educationBills, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(miscBills)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(houseSize, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(houseCost, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel24)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(accomodationBills, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel22)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(medicalBills, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel26)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(totalBills, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))))))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fMembers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(fatherIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fatherStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(qfamilySupport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(familySupport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(plotsCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noOfPlots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(landArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(landCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(noOfVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(vehiclesCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noOfCars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noOfBikes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(qHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(houseSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(houseCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel20)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(utilityBills, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(medicalBills, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(educationBills, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(accomodationBills, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(miscBills, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(totalBills, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(118, 118, 118)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save)
                    .addComponent(next)
                    .addComponent(back)
                    .addComponent(exit))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(109, 192, 197));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setText("Money Transaction");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(713, 713, 713)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(736, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void familySupportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familySupportActionPerformed
    }//GEN-LAST:event_familySupportActionPerformed

    private void plotsCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plotsCostActionPerformed
    }//GEN-LAST:event_plotsCostActionPerformed

    private void houseCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseCostActionPerformed
    }//GEN-LAST:event_houseCostActionPerformed

    private void utilityBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utilityBillsActionPerformed
    }//GEN-LAST:event_utilityBillsActionPerformed

    private void medicalBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalBillsActionPerformed
    }//GEN-LAST:event_medicalBillsActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        Semester_Project sp = new Semester_Project();
        String fStatus = (String) fatherStatus.getSelectedItem();
        String qfSupport = (String) qfamilySupport.getSelectedItem();
        String plots = (String) noOfPlots.getSelectedItem();
        String vehicles = (String) noOfVehicles.getSelectedItem();
        String cars = (String) noOfCars.getSelectedItem();
        String bikes = (String) noOfBikes.getSelectedItem();
        String uhouse = (String) qHouse.getSelectedItem();
        String ufmembers = fMembers.getText();
        String ufincome = fatherIncome.getText();
        String ufamilySupport = familySupport.getText();
        String uplotsCost = plotsCost.getText();
        String ulandArea = landArea.getText();
        String ulandCost = landCost.getText();
        String uvCost = vehiclesCost.getText();
        String hsize = houseSize.getText();
        String hcost = houseCost.getText();
        String eUtility = utilityBills.getText();
        String eMedical = medicalBills.getText();
        String eEducation = educationBills.getText();
        String eAccomodation = accomodationBills.getText();
        String eMisc = miscBills.getText();
        int misc = Integer.parseInt(eMisc);
        int edu = Integer.parseInt(eEducation);
        int aco = Integer.parseInt(eAccomodation);
        int med = Integer.parseInt(eMedical);
        int uti = Integer.parseInt(eUtility);
        int exp = misc + edu + aco + med + uti;
        totalBills.setText(String.valueOf(exp));
        totalBills.setEditable(false);
        double income = Double.parseDouble(ufincome);

        double net = income - exp;
        int intCars = Integer.parseInt(cars);
        int intBikes = Integer.parseInt(bikes);
        if (net <= 1000 && intCars > 0 && intBikes > 2) {
            JOptionPane.showMessageDialog(null, "Sorry, you cannot apply for this application.");
        } else {
            boolean b = sp.signUp_ContCheck(ufmembers, ufincome, ufamilySupport, uplotsCost, ulandArea,
                    ulandCost, uvCost, hsize, hcost, eUtility, eMedical, eEducation, eAccomodation, eMisc);
            if (b == true) {
                conn = Semester_Project.connectDB("jdbc:sqlite:C:\\Users\\Lenovo\\Documents\\Databases\\Property_Info.db");
                if (conn != null) {
                    try {
                        String query = "insert into Property_Info values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        ps = conn.prepareStatement(query);
                        ps.setString(1, cnic);
                        ps.setInt(2, Integer.parseInt(ufmembers));
                        ps.setString(3, fStatus);
                        ps.setInt(4, Integer.parseInt(ufincome));
                        ps.setString(5, qfSupport);
                        ps.setInt(6, Integer.parseInt(plots));
                        ps.setInt(7, Integer.parseInt(uplotsCost));
                        ps.setInt(8, Integer.parseInt(ulandArea));
                        ps.setInt(9, Integer.parseInt(ulandCost));
                        ps.setInt(10, Integer.parseInt(vehicles));
                        ps.setInt(11, Integer.parseInt(cars));
                        ps.setInt(12, Integer.parseInt(bikes));
                        ps.setInt(13, Integer.parseInt(uvCost));
                        ps.setInt(14, Integer.parseInt(hsize));
                        ps.setInt(15, Integer.parseInt(hcost));

                        ps.execute();

                        try {
                            conn = Semester_Project.connectDB("jdbc:sqlite:C:\\Users\\Lenovo\\Documents\\Databases\\Expenditures.db");

                            String que = "insert into Expenditures values(?,?,?,?,?,?,?)";
                            ps = conn.prepareStatement(que);
                            ps.setString(1, cnic);
                            ps.setInt(2, uti);
                            ps.setInt(3, med);
                            ps.setInt(4, edu);
                            ps.setInt(5, aco);
                            ps.setInt(6, misc);
                            ps.setInt(7, exp);

                            ps.execute();
                            try{
                            conn = Semester_Project.connectDB("jdbc:sqlite:C:\\Users\\Lenovo\\Documents\\Databases\\Recepient_Account.db");
                            String query2 = "insert into Recepient_Account values(?,?,?,?)";
                            ps2 = conn.prepareStatement(query2);
                            ps2.setString(1, name);
                            ps2.setString(2, fname);
                            ps2.setString(3, cnic);
                            ps2.setDouble(4, 1000);
                            ps2.execute();
                            JOptionPane.showMessageDialog(null, "Your data has been saved.");
                            }catch(HeadlessException | SQLException e){
                                JOptionPane.showMessageDialog(null, e);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    } catch (HeadlessException | NumberFormatException | SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
        }

    }//GEN-LAST:event_SaveActionPerformed

    private void fatherStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatherStatusActionPerformed
    }//GEN-LAST:event_fatherStatusActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Recepient_SignUp signup = new Recepient_SignUp();
        signup.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        conn = Semester_Project.connectDB("jdbc:sqlite:C:\\Users\\Lenovo\\Documents\\Databases\\Property_Info.db");
        String sql = "select CNIC from Property_Info where CNIC = ?";
        String c = "";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, cnic);
            rs = ps.executeQuery();
            while (rs.next()) {
                c = rs.getString("CNIC");
            }
            if (!"".equals(c)) {
                Emp_Password setPass = new Emp_Password(cnic);
                setPass.setVisible(true);
                this.dispose();
            } else {
                Semester_Project sp = new Semester_Project();
                String fStatus = (String) fatherStatus.getSelectedItem();
                String qfSupport = (String) qfamilySupport.getSelectedItem();
                String plots = (String) noOfPlots.getSelectedItem();
                String vehicles = (String) noOfVehicles.getSelectedItem();
                String cars = (String) noOfCars.getSelectedItem();
                String bikes = (String) noOfBikes.getSelectedItem();
                String uhouse = (String) qHouse.getSelectedItem();
                String ufmembers = fMembers.getText();
                String ufincome = fatherIncome.getText();
                String ufamilySupport = familySupport.getText();
                String uplotsCost = plotsCost.getText();
                String ulandArea = landArea.getText();
                String ulandCost = landCost.getText();
                String uvCost = vehiclesCost.getText();
                String hsize = houseSize.getText();
                String hcost = houseCost.getText();
                String eUtility = utilityBills.getText();
                String eMedical = medicalBills.getText();
                String eEducation = educationBills.getText();
                String eAccomodation = accomodationBills.getText();
                String eMisc = miscBills.getText();
                int misc = Integer.parseInt(eMisc);
                int edu = Integer.parseInt(eEducation);
                int aco = Integer.parseInt(eAccomodation);
                int med = Integer.parseInt(eMedical);
                int uti = Integer.parseInt(eUtility);
                int exp = misc + edu + aco + med + uti;
                totalBills.setText(String.valueOf(exp));
                totalBills.setEditable(false);
                double income = Double.parseDouble(ufincome);
                double net = income - exp;
                int intCars = Integer.parseInt(cars);
                int intBikes = Integer.parseInt(bikes);
                if (net <= 1000 && intCars > 0 && intBikes > 2) {

                    JOptionPane.showMessageDialog(null, "Sorry, you cannot apply for this application.");
                } else {
                    boolean b = sp.signUp_ContCheck(ufmembers, ufincome, ufamilySupport, uplotsCost, ulandArea,
                            ulandCost, uvCost, hsize, hcost, eUtility, eMedical, eEducation, eAccomodation, eMisc);
                    if (b == true) {
                        conn = Semester_Project.connectDB("jdbc:sqlite:C:\\Users\\Lenovo\\Documents\\Databases\\Property_Info.db");
                        if (conn != null) {
                            try {
                                String query = "insert into Property_Info values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                                ps = conn.prepareStatement(query);
                                ps.setString(1, cnic);
                                ps.setInt(2, Integer.parseInt(ufmembers));
                                ps.setString(3, fStatus);
                                ps.setInt(4, Integer.parseInt(ufincome));
                                ps.setString(5, qfSupport);
                                ps.setInt(6, Integer.parseInt(plots));
                                ps.setInt(7, Integer.parseInt(uplotsCost));
                                ps.setInt(8, Integer.parseInt(ulandArea));
                                ps.setInt(9, Integer.parseInt(ulandCost));
                                ps.setInt(10, Integer.parseInt(vehicles));
                                ps.setInt(11, Integer.parseInt(cars));
                                ps.setInt(12, Integer.parseInt(bikes));
                                ps.setInt(13, Integer.parseInt(uvCost));
                                ps.setInt(14, Integer.parseInt(hsize));
                                ps.setInt(15, Integer.parseInt(hcost));
                                ps.execute();

                                try {
                                    conn = Semester_Project.connectDB("jdbc:sqlite:C:\\Users\\Lenovo\\Documents\\Databases\\Expenditures.db");
                                    String que = "insert into Expenditures values(?,?,?,?,?,?,?)";
                                    ps = conn.prepareStatement(que);
                                    ps.setString(1, cnic);
                                    ps.setInt(2, Integer.parseInt(eUtility));
                                    ps.setInt(3, Integer.parseInt(eMedical));
                                    ps.setInt(4, Integer.parseInt(eEducation));
                                    ps.setInt(5, Integer.parseInt(eAccomodation));
                                    ps.setInt(6, Integer.parseInt(eMisc));
                                    ps.setInt(7, exp);
                                    ps.execute();
                                    try {
                                        conn = Semester_Project.connectDB("jdbc:sqlite:C:\\Users\\Lenovo\\Documents\\Databases\\Recepient_Account.db");
                                        String query2 = "insert into Recepient_Account values(?,?,?,?)";
                                        ps2 = conn.prepareStatement(query2);
                                        ps2.setString(1, name);
                                        ps2.setString(2, fname);
                                        ps2.setString(3, cnic);
                                        ps2.setDouble(4, 1000.0);
                                        ps2.execute();
                                        JOptionPane.showMessageDialog(null, "Your data has been saved.");
                                        Emp_Password setPass = new Emp_Password(cnic);
                                        setPass.setVisible(true);
                                        this.dispose();
                                        JOptionPane.showMessageDialog(null, "Data Saved");
                                    } catch (HeadlessException | SQLException e) {
                                        JOptionPane.showMessageDialog(null, e);
                                    }
                                } catch (HeadlessException | NumberFormatException | SQLException e) {
                                    JOptionPane.showMessageDialog(null, e);
                                }

                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }

                        }
                    }
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }


    }//GEN-LAST:event_nextActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Recepient_SignUp_Cont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recepient_SignUp_Cont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recepient_SignUp_Cont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recepient_SignUp_Cont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recepient_SignUp_Cont().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JTextField accomodationBills;
    private javax.swing.JButton back;
    private javax.swing.JTextField educationBills;
    private javax.swing.JButton exit;
    private javax.swing.JTextField fMembers;
    private javax.swing.JTextField familySupport;
    private javax.swing.JTextField fatherIncome;
    private javax.swing.JComboBox<String> fatherStatus;
    private javax.swing.JTextField houseCost;
    private javax.swing.JTextField houseSize;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField jTextField1;
    private javax.swing.JTextField landArea;
    private javax.swing.JTextField landCost;
    private javax.swing.JTextField medicalBills;
    private javax.swing.JTextField miscBills;
    private javax.swing.JButton next;
    private javax.swing.JComboBox<String> noOfBikes;
    private javax.swing.JComboBox<String> noOfCars;
    private javax.swing.JComboBox<String> noOfPlots;
    private javax.swing.JComboBox<String> noOfVehicles;
    private javax.swing.JTextField plotsCost;
    private javax.swing.JComboBox<String> qHouse;
    private javax.swing.JComboBox<String> qfamilySupport;
    private javax.swing.JTextField totalBills;
    private javax.swing.JTextField utilityBills;
    private javax.swing.JTextField vehiclesCost;
    // End of variables declaration//GEN-END:variables
}
