/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Doctor;

import Model.Doctor.Doctor;
import Model.Doctor.DoctorDirectory;
import Model.Hospital.HospitalDirectory;
import Model.Patient.PatientDirectory;
import Model.SignUp.SignUpDirectory;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class ReadSADoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReadSADoctorJPanel
     */
    SignUpDirectory SignUpDirectory;
    HospitalDirectory HospitalDirectory;
    DoctorDirectory DoctorDirectory;
    PatientDirectory PatientDirectory;
    public ReadSADoctorJPanel(SignUpDirectory SignUpDirectory, HospitalDirectory HospitalDirectory, DoctorDirectory DoctorDirectory, PatientDirectory PatientDirectory) {
        initComponents();
        this.SignUpDirectory = SignUpDirectory;
        this.HospitalDirectory = HospitalDirectory;
        this.DoctorDirectory = DoctorDirectory;
        this.PatientDirectory = PatientDirectory;
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSearchPerson = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctorDirectory = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        txtHospitalID = new javax.swing.JTextField();
        btnPersonView = new javax.swing.JButton();
        btnPersonDelete = new javax.swing.JButton();
        btnUpdateSignUp = new javax.swing.JButton();
        lblConfirmPassword = new javax.swing.JLabel();
        txtConfirmPasswordDoctor = new javax.swing.JTextField();
        txtCreatePasswordDoctor = new javax.swing.JTextField();
        txtPinCodeSignUp = new javax.swing.JTextField();
        txtStateSignUp = new javax.swing.JTextField();
        txtCitySignUp = new javax.swing.JTextField();
        txtAddressSignUp = new javax.swing.JTextField();
        txtAgeSignUp = new javax.swing.JTextField();
        txtNameSignUp = new javax.swing.JTextField();
        lblName1 = new javax.swing.JLabel();
        txtPersonID = new javax.swing.JTextField();
        lblName2 = new javax.swing.JLabel();
        txtDoctorID = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblPinCode = new javax.swing.JLabel();
        lblCreatePassword = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        jLabel2.setText("Doctor Records");

        jLabel3.setText("Search Doctor:");

        txtSearchPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPersonActionPerformed(evt);
            }
        });
        txtSearchPerson.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchPersonKeyPressed(evt);
            }
        });

        tblDoctorDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Hospital Name", "Hospital ID", "DoctorID", "Doctor's Name", "PersonID", "Age", "Address", "City", "State", "Pin Code", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDoctorDirectory);

        jLabel4.setText("Hospital Name:");

        jLabel5.setText("Hospital ID:");

        txtHospitalName.setEditable(false);
        txtHospitalName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtHospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalNameActionPerformed(evt);
            }
        });

        txtHospitalID.setEditable(false);
        txtHospitalID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtHospitalID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalIDActionPerformed(evt);
            }
        });

        btnPersonView.setText("View");
        btnPersonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonViewActionPerformed(evt);
            }
        });

        btnPersonDelete.setText("Delete");
        btnPersonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonDeleteActionPerformed(evt);
            }
        });

        btnUpdateSignUp.setText("Update");
        btnUpdateSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSignUpActionPerformed(evt);
            }
        });
        btnUpdateSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnUpdateSignUpKeyPressed(evt);
            }
        });

        lblConfirmPassword.setText("Confirm Password:");

        txtConfirmPasswordDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPasswordDoctorActionPerformed(evt);
            }
        });
        txtConfirmPasswordDoctor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordDoctorKeyPressed(evt);
            }
        });

        txtCreatePasswordDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreatePasswordDoctorActionPerformed(evt);
            }
        });
        txtCreatePasswordDoctor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCreatePasswordDoctorKeyPressed(evt);
            }
        });

        txtPinCodeSignUp.setEditable(false);
        txtPinCodeSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPinCodeSignUpActionPerformed(evt);
            }
        });
        txtPinCodeSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPinCodeSignUpKeyPressed(evt);
            }
        });

        txtStateSignUp.setEditable(false);
        txtStateSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStateSignUpKeyPressed(evt);
            }
        });

        txtCitySignUp.setEditable(false);
        txtCitySignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCitySignUpKeyPressed(evt);
            }
        });

        txtAddressSignUp.setEditable(false);
        txtAddressSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddressSignUpKeyPressed(evt);
            }
        });

        txtAgeSignUp.setEditable(false);
        txtAgeSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeSignUpKeyPressed(evt);
            }
        });

        txtNameSignUp.setEditable(false);
        txtNameSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameSignUpActionPerformed(evt);
            }
        });
        txtNameSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameSignUpKeyPressed(evt);
            }
        });

        lblName1.setText("Person ID:");

        txtPersonID.setEditable(false);
        txtPersonID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonIDActionPerformed(evt);
            }
        });
        txtPersonID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPersonIDKeyPressed(evt);
            }
        });

        lblName2.setText("Doctor ID:");

        txtDoctorID.setEditable(false);
        txtDoctorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorIDActionPerformed(evt);
            }
        });
        txtDoctorID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDoctorIDKeyPressed(evt);
            }
        });

        lblName.setText("Doctor's Name:");

        lblAge.setText("Age:");

        lblAddress.setText("Address:");

        lblCity.setText("City:");

        lblState.setText("State:");

        lblPinCode.setText("Pin Code:");

        lblCreatePassword.setText("Update Password:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtHospitalID)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtSearchPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPersonView)
                                .addGap(18, 18, 18)
                                .addComponent(btnPersonDelete)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdateSignUp))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCreatePassword)
                                        .addComponent(lblConfirmPassword)
                                        .addComponent(lblAge)
                                        .addComponent(lblCity)
                                        .addComponent(lblAddress)
                                        .addComponent(lblState)
                                        .addComponent(lblPinCode))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAgeSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAddressSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCitySignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtStateSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPinCodeSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCreatePasswordDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtConfirmPasswordDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblName1)
                                            .addGap(57, 57, 57))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblName2)
                                            .addGap(59, 59, 59)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtPersonID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHospitalID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSearchPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPersonView)
                    .addComponent(btnPersonDelete)
                    .addComponent(btnUpdateSignUp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPersonID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtNameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAgeSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAddressSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCitySignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState)
                    .addComponent(txtStateSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPinCode)
                    .addComponent(txtPinCodeSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreatePassword)
                    .addComponent(txtCreatePasswordDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmPassword)
                    .addComponent(txtConfirmPasswordDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchPersonActionPerformed

    private void txtSearchPersonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchPersonKeyPressed
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel)tblDoctorDirectory.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tableModel);
        tblDoctorDirectory.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearchPerson.getText().trim()));
    }//GEN-LAST:event_txtSearchPersonKeyPressed

    private void txtHospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalNameActionPerformed

    private void txtHospitalIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalIDActionPerformed

    private void btnPersonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDoctorDirectory.getSelectedRow();

        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblDoctorDirectory.getModel();
        Doctor selectedSignUp = (Doctor) model.getValueAt(selectedRowIndex,0);
        System.out.print("Array Doctor ---- " + selectedSignUp.getDoctorID());

        txtDoctorID.setText(String.valueOf(selectedSignUp.getDoctorID()));
        txtHospitalID.setText(String.valueOf(selectedSignUp.getHospitalID()));
        txtHospitalName.setText(String.valueOf(selectedSignUp.getHospitalName()));
        txtPersonID.setText(String.valueOf(selectedSignUp.getPersonID()));
        txtNameSignUp.setText(String.valueOf(selectedSignUp.getDoctorName()));
        txtAgeSignUp.setText(String.valueOf(selectedSignUp.getAge()));
        txtAddressSignUp.setText(String.valueOf(selectedSignUp.getAddress()));
        txtCitySignUp.setText(String.valueOf(selectedSignUp.getCity()));
        txtStateSignUp.setText(String.valueOf(selectedSignUp.getState()));
        txtPinCodeSignUp.setText(String.valueOf(selectedSignUp.getPinCode()));
        txtCreatePasswordDoctor.setText(String.valueOf(selectedSignUp.getCreatePassword()));
        txtConfirmPasswordDoctor.setText(String.valueOf(selectedSignUp.getConfirmPassword()));
    }//GEN-LAST:event_btnPersonViewActionPerformed

    private void btnPersonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonDeleteActionPerformed
        // TODO add your handling code here:

        txtDoctorID.setText("");
        txtHospitalID.setText("");
        txtHospitalName.setText("");
        txtNameSignUp.setText("");
        txtPersonID.setText("");
        txtAgeSignUp.setText("");
        txtAddressSignUp.setText("");
        txtCitySignUp.setText("");
        txtStateSignUp.setText("");
        txtPinCodeSignUp.setText("");
        txtCreatePasswordDoctor.setText("");
        txtConfirmPasswordDoctor.setText("");

        int selectedRowIndex = tblDoctorDirectory.getSelectedRow();

        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblDoctorDirectory.getModel();
        Doctor selectedSignUp = (Doctor) model.getValueAt(selectedRowIndex,0);

        DoctorDirectory.deleteEmployee(selectedSignUp);

        JOptionPane.showMessageDialog(this, "Person Details deleted.");

        populateTable();
    }//GEN-LAST:event_btnPersonDeleteActionPerformed

    private void btnUpdateSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSignUpActionPerformed

        if(tblDoctorDirectory.getSelectedRow()<0) {
            JOptionPane.showMessageDialog(this , "Please select a row to update.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblDoctorDirectory.getModel();
        Doctor su = (Doctor) model.getValueAt(tblDoctorDirectory.getSelectedRow(), 0);
        
        if (!Pattern.matches("^(([a-z]|[0-9]|[A-Z]){5})$", txtCreatePasswordDoctor.getText())) 
         {
             JOptionPane.showMessageDialog(null, "The password should be a combination of characters and digits of length 5!", "Error", JOptionPane.ERROR_MESSAGE);
             
         }
        else if (!txtCreatePasswordDoctor.getText().equals(txtConfirmPasswordDoctor.getText()))
        {
                    
             JOptionPane.showMessageDialog(null, "Your Password should match!", "Error", JOptionPane.ERROR_MESSAGE);
             
        }
        else{
        if (tblDoctorDirectory.getSelectedRowCount()==1) {

            int DoctorID = Integer.parseInt(txtDoctorID.getText());
            int HospitalID = Integer.parseInt(txtHospitalID.getText());
            String HospitalName = txtHospitalName.getText();
            int PersonID = Integer.parseInt(txtPersonID.getText());
            String DoctorName = txtNameSignUp.getText();
            int Age = Integer.parseInt(txtAgeSignUp.getText());
            String Address = txtAddressSignUp.getText();
            String City = txtCitySignUp.getText();
            String State = txtStateSignUp.getText();
            int PinCode = Integer.parseInt(txtPinCodeSignUp.getText());
            String CreatePassword = txtCreatePasswordDoctor.getText();
            String ConfirmPassword = txtConfirmPasswordDoctor.getText();

            su.setHospitalID(HospitalID);
            su.setHospitalName(HospitalName);
            su.setPersonID(PersonID);
            su.setDoctorName(DoctorName);
            su.setAge(Age);
            su.setAddress(Address);
            su.setCity(City);
            su.setState(State);
            su.setPinCode(PinCode);
            su.setCreatePassword(CreatePassword);
            su.setConfirmPassword(ConfirmPassword);

            model.setValueAt(HospitalID, tblDoctorDirectory.getSelectedRow(), 1);
            model.setValueAt(HospitalName, tblDoctorDirectory.getSelectedRow(), 2);
            model.setValueAt(PersonID, tblDoctorDirectory.getSelectedRow(), 3);
            model.setValueAt(DoctorName, tblDoctorDirectory.getSelectedRow(), 4);
            model.setValueAt(Age, tblDoctorDirectory.getSelectedRow(), 5);
            model.setValueAt(Address, tblDoctorDirectory.getSelectedRow(), 6);
            model.setValueAt(City, tblDoctorDirectory.getSelectedRow(), 7);
            model.setValueAt(State, tblDoctorDirectory.getSelectedRow(), 8);
            model.setValueAt(PinCode, tblDoctorDirectory.getSelectedRow(), 9);
            model.setValueAt(CreatePassword, tblDoctorDirectory.getSelectedRow(), 10);
            //model.setValueAt(ConfirmPassword, tblPersonDirectory.getSelectedRow(), 9);

            JOptionPane.showMessageDialog(this, "Person Details Updated");

            txtDoctorID.setText("");
            txtHospitalID.setText("");
            txtHospitalName.setText("");
            txtNameSignUp.setText("");
            txtPersonID.setText("");
            txtAgeSignUp.setText("");
            txtAddressSignUp.setText("");
            txtCitySignUp.setText("");
            txtStateSignUp.setText("");
            txtPinCodeSignUp.setText("");
            txtCreatePasswordDoctor.setText("");
            txtConfirmPasswordDoctor.setText("");

            populateTable();
        }
        }
    }//GEN-LAST:event_btnUpdateSignUpActionPerformed

    private void btnUpdateSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnUpdateSignUpKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateSignUpKeyPressed

    private void txtConfirmPasswordDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPasswordDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPasswordDoctorActionPerformed

    private void txtConfirmPasswordDoctorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPasswordDoctorKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtConfirmPasswordDoctorKeyPressed

    private void txtCreatePasswordDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreatePasswordDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreatePasswordDoctorActionPerformed

    private void txtCreatePasswordDoctorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreatePasswordDoctorKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtCreatePasswordDoctorKeyPressed

    private void txtPinCodeSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPinCodeSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPinCodeSignUpActionPerformed

    private void txtPinCodeSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPinCodeSignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtPinCodeSignUpKeyPressed

    private void txtStateSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStateSignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtStateSignUpKeyPressed

    private void txtCitySignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCitySignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtCitySignUpKeyPressed

    private void txtAddressSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressSignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtAddressSignUpKeyPressed

    private void txtAgeSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeSignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtAgeSignUpKeyPressed

    private void txtNameSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameSignUpActionPerformed

    private void txtNameSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameSignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtNameSignUpKeyPressed

    private void txtPersonIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonIDActionPerformed

    private void txtPersonIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonIDKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonIDKeyPressed

    private void txtDoctorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorIDActionPerformed

    private void txtDoctorIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDoctorIDKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorIDKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPersonDelete;
    private javax.swing.JButton btnPersonView;
    private javax.swing.JButton btnUpdateSignUp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblCreatePassword;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblPinCode;
    private javax.swing.JLabel lblState;
    private javax.swing.JTable tblDoctorDirectory;
    private javax.swing.JTextField txtAddressSignUp;
    private javax.swing.JTextField txtAgeSignUp;
    private javax.swing.JTextField txtCitySignUp;
    private javax.swing.JTextField txtConfirmPasswordDoctor;
    private javax.swing.JTextField txtCreatePasswordDoctor;
    private javax.swing.JTextField txtDoctorID;
    private javax.swing.JTextField txtHospitalID;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtNameSignUp;
    private javax.swing.JTextField txtPersonID;
    private javax.swing.JTextField txtPinCodeSignUp;
    private javax.swing.JTextField txtSearchPerson;
    private javax.swing.JTextField txtStateSignUp;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblDoctorDirectory.getModel();
        model.setRowCount(0);
        
        for (Doctor su : DoctorDirectory.getDoctorDirectory()){
            
            Object[] row = new Object[12];
            row[0] = su;
            row[1] = su.getHospitalID();
            row[2] = su.getDoctorID();
            row[3] = su.getDoctorName();
            row[4] = su.getPersonID();
            row[5] = su.getAge();
            row[6] = su.getAddress();
            row[7] = su.getCity();
            row[8] = su.getState();
            row[9] = su.getPinCode();
            row[10] = su.getCreatePassword();
            //row[8] = su.getConfirmPassword();
            
            
            model.addRow(row);
            
        }
    }
}
