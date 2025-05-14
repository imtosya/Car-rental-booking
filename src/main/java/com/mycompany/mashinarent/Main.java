package com.mycompany.mashinarent;

import java.io.FileWriter; // Library to export data 
import java.io.IOException; // Error handling
import java.sql.Connection; // Library to connect sql
import java.sql.DriverManager; // Library to connect db
import java.sql.Statement; // Library to prepare requests 
import java.sql.PreparedStatement; // Library to prepare secure requests
import java.sql.ResultSet; // Keeps result of request SELECT (Table with data)
import java.sql.SQLException; //Error handling
import javax.swing.JOptionPane; // To show pop-up windows
import javax.swing.table.DefaultTableModel; // Library to work with JTable
import net.proteanit.sql.DbUtils; // Library to work with JTable (To get data from db)         

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


public class Main extends javax.swing.JFrame {

    
    public Main() {
        initComponents();
        Reset();
        Connect();
        DisplayCars();
    }
    
    Connection Con;
    Statement St;
    ResultSet Rs;
    
    
    private void Reset(){
        StateNumberTb.setText("");
        BrandTb.setText("");
        ModelTb.setText("");
        StatusCb.setSelectedIndex(-1);
        PriceTb.setText("");
    }
    
    
    // Display Cars on Table
    private void DisplayCars(){
        try{
            St = Con.createStatement();
            Rs = St.executeQuery("SELECT * FROM carstable");
            CarsTable.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(SQLException e){
           e.printStackTrace(); 
        }
    }
    


    


    // Connecting db
    public void Connect() {
    try {
            // Installing driver
            Class.forName("org.postgresql.Driver");
            
            Con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/CarRental",  // URL 
                "postgres",  
                "Tosyabakusya030806."        
            );
            
            System.out.println("Connected to the database successfully!");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Driver is not found");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection to database failed");
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ExportBtn = new javax.swing.JButton();
        PriceTb = new javax.swing.JTextField();
        StatusCb = new javax.swing.JComboBox<>();
        DeleteBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BrandTb = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        StateNumberTb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ModelTb = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        CarsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ExportBtn.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        ExportBtn.setText("Export");
        ExportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportBtnActionPerformed(evt);
            }
        });

        StatusCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Booked" }));

        DeleteBtn.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        ResetBtn.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel4.setText("Model:");

        jLabel5.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel5.setText("Status:");

        jLabel6.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel6.setText("Price:");

        jLabel3.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel3.setText("Brand:");

        UpdateBtn.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        AddBtn.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel2.setText("State Number:");

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel1.setText("Car Rental System!");

        CarsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "State Number", "Brand", "Model", "Status", "Price"
            }
        ));
        CarsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarsTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(CarsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BrandTb, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UpdateBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(StateNumberTb, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(AddBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ModelTb, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ResetBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(ExportBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(StatusCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteBtn)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(StateNumberTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(BrandTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ModelTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(DeleteBtn)
                    .addComponent(StatusCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExportBtn))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportBtnActionPerformed
        String filename = System.getProperty("user.home") + "/Desktop/Cars.csv"; // Creating csv file on Desktop
        
        PreparedStatement pst;
        try {
            FileWriter fout = new FileWriter(filename);
            pst = Con.prepareStatement("SELECT * FROM carstable");
            Rs = pst.executeQuery();
            
            // Going throw table in db and getting datas
            while(Rs.next()){
                fout.append(Rs.getString(1));
                fout.append(",");
                fout.append(Rs.getString(2));
                fout.append(",");
                fout.append(Rs.getString(3));
                fout.append(",");
                fout.append(Rs.getString(4));
                fout.append(",");
                fout.append(Rs.getString(5));
                fout.append("\n");
            }
            JOptionPane.showMessageDialog(this, "CSV file exported successfully");
            fout.flush();
            fout.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ExportBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        Reset();
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // Validate input fields
        if (StateNumberTb.getText().isEmpty() || 
            BrandTb.getText().isEmpty() || 
            ModelTb.getText().isEmpty() || 
            StatusCb.getSelectedIndex() == -1 || 
            PriceTb.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Please select the car to be updated!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate State Number
        if (StateNumberTb.getText().length() < 5) {
            JOptionPane.showMessageDialog(this, "State Number is not correct!");
            StateNumberTb.setText("");
            return;
        }

        // Validate and parse price
        int price;
        try {
            price = Integer.parseInt(PriceTb.getText().trim());

            if (price > 300000) {
                JOptionPane.showMessageDialog(this, "Maximum price for rent is 300000!");
                PriceTb.setText("");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Price must be a valid number!", "Input Error", JOptionPane.ERROR_MESSAGE);
            PriceTb.setText("");
            return;
        }

        // Prepare update data
        String Num = StateNumberTb.getText().trim();
        String Brand = BrandTb.getText().trim();
        String Model = ModelTb.getText().trim();
        String Status = StatusCb.getSelectedItem().toString();

        String Query = "UPDATE carstable SET \"Brand\" = ?, \"Model\" = ?, \"Status\" = ?, \"Price\" = ? WHERE \"StateNumber\" = ?";

        try {
            PreparedStatement pst = Con.prepareStatement(Query);
            pst.setString(1, Brand);
            pst.setString(2, Model);
            pst.setString(3, Status);
            pst.setInt(4, price);
            pst.setString(5, Num);

            int k = pst.executeUpdate();

            if (k == 1) {
                JOptionPane.showMessageDialog(this, "The car has been successfully updated!");
                Reset();
                DisplayCars();
            } else {
                JOptionPane.showMessageDialog(this, "Record failed to update!");
                Reset();
            }
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error occurred!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // Basic field validation
        if (StateNumberTb.getText().isEmpty() || 
            BrandTb.getText().isEmpty() || 
            ModelTb.getText().isEmpty() || 
            StatusCb.getSelectedIndex() == -1 || 
            PriceTb.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Please fill in all fields!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate StateNumber length
        if (StateNumberTb.getText().length() < 5) {
            JOptionPane.showMessageDialog(this, "State Number is not correct!");
            StateNumberTb.setText("");
            return;
        }

        // Validate Price as a number and within range
        int price;
        try {
            price = Integer.parseInt(PriceTb.getText().trim());

            if (price > 300000) {
                JOptionPane.showMessageDialog(this, "Maximum price for rent is 300000!");
                PriceTb.setText("");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Price must be a valid number!", "Input Error", JOptionPane.ERROR_MESSAGE);
            PriceTb.setText("");
            return;
        }

        // Save to database
        try {
            PreparedStatement add = Con.prepareStatement("INSERT INTO carstable VALUES(?,?,?,?,?)");
            add.setString(1, StateNumberTb.getText().trim());
            add.setString(2, BrandTb.getText().trim());
            add.setString(3, ModelTb.getText().trim());
            add.setString(4, StatusCb.getSelectedItem().toString());
            add.setInt(5, price);

            int k = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Car Added Successfully!");

            DisplayCars();
            Reset();
            add.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Car with this State Number already exists!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        String Num = StateNumberTb.getText();            
        String Query = "DELETE FROM carstable WHERE \"StateNumber\" = '" + Num + "'";
            try {
                Statement St = Con.createStatement();                
                int k = St.executeUpdate(Query);
                if (k == 1) {
                    JOptionPane.showMessageDialog(this, "The Car Has Been Successfully Deleted!");                    
                    Reset();
                } else {                    
                    JOptionPane.showMessageDialog(this, "Please Select The Car to Be Deleted!");
                }
                DisplayCars(); // Update Cars Table             
            } catch (SQLException e) {
                e.printStackTrace();             }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void CarsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarsTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)CarsTable.getModel(); //Connecting to table
        int MyIndex = CarsTable.getSelectedRow(); // 
        StateNumberTb.setText(model.getValueAt(MyIndex, 0).toString());
        BrandTb.setText(model.getValueAt(MyIndex, 1).toString());
        ModelTb.setText(model.getValueAt(MyIndex, 2).toString());
        StatusCb.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
        PriceTb.setText(model.getValueAt(MyIndex, 4).toString());
    }//GEN-LAST:event_CarsTableMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField BrandTb;
    private javax.swing.JTable CarsTable;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton ExportBtn;
    private javax.swing.JTextField ModelTb;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JTextField StateNumberTb;
    private javax.swing.JComboBox<String> StatusCb;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
