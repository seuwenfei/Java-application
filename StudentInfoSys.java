
package project;

import javax.swing.JOptionPane;


public class StudentInfoSys extends javax.swing.JFrame {
    
    private Student [] studentArray = new Student [1000];
    private int studentIndex = 0;

    public StudentInfoSys() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jOptionPane1 = new javax.swing.JOptionPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jOptionPane2 = new javax.swing.JOptionPane();
        jOptionPane3 = new javax.swing.JOptionPane();
        jOptionPane4 = new javax.swing.JOptionPane();
        jOptionPane5 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mathRB = new javax.swing.JRadioButton();
        multiRB = new javax.swing.JRadioButton();
        indRB = new javax.swing.JRadioButton();
        nameTF = new javax.swing.JTextField();
        matricTF = new javax.swing.JTextField();
        courseworkTF = new javax.swing.JTextField();
        examTF = new javax.swing.JTextField();
        displayBTN = new javax.swing.JButton();
        resetBTN = new javax.swing.JButton();
        addBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputTA = new javax.swing.JTextArea();
        searchBTN = new javax.swing.JButton();
        showBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jOptionPane2.setName(""); // NOI18N
        jOptionPane2.getAccessibleContext().setAccessibleName("");
        jOptionPane2.getAccessibleContext().setAccessibleDescription("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Infomation System");

        jLabel1.setText("Name :");

        jLabel2.setText("Matric. No :");

        jLabel3.setText("Program :");

        jLabel4.setText("Total Course Work Mark : ");

        jLabel5.setText("Final Exam Mark : ");

        buttonGroup1.add(mathRB);
        mathRB.setText("B.Sc.Math");
        mathRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mathRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(multiRB);
        multiRB.setText("B.Sc.Multimedia");

        buttonGroup1.add(indRB);
        indRB.setText("B.Sc.Ind");

        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });

        displayBTN.setText("Display");
        displayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBTNActionPerformed(evt);
            }
        });

        resetBTN.setText("Reset");
        resetBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBTNActionPerformed(evt);
            }
        });

        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        outputTA.setColumns(20);
        outputTA.setRows(5);
        jScrollPane1.setViewportView(outputTA);

        searchBTN.setText("Search");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        showBTN.setText("Show");
        showBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBTNActionPerformed(evt);
            }
        });

        exitBTN.setText("Exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTF)
                            .addComponent(matricTF)
                            .addComponent(courseworkTF)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(indRB)
                                    .addComponent(multiRB)
                                    .addComponent(mathRB))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(examTF))
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resetBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(exitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(matricTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mathRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(multiRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indRB)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseworkTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(examTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayBTN)
                    .addComponent(resetBTN)
                    .addComponent(addBTN)
                    .addComponent(searchBTN)
                    .addComponent(showBTN))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitBTN)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mathRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mathRBActionPerformed
        
    }//GEN-LAST:event_mathRBActionPerformed

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        
    }//GEN-LAST:event_nameTFActionPerformed

    private void resetBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBTNActionPerformed
        
        studentIndex = 0;
        JOptionPane.showMessageDialog(null, "The data is reset.");
        
        outputTA.setText("");
    
    }//GEN-LAST:event_resetBTNActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        String name = nameTF.getText();
        int matric = Integer.parseInt(matricTF.getText());
        double coursework = Double.parseDouble(courseworkTF.getText());
        double exam = Double.parseDouble(examTF.getText());
        boolean result = true;
        String program = "";
        

        if((coursework < 0) || (coursework > 100)){
            JOptionPane.showMessageDialog(null,"Please enter a valid coursework marks. ");
            result = false;
        }
        
        if((exam < 0) || (exam > 100)){
            JOptionPane.showMessageDialog(null,"Please enter a valid exam marks. ");
            result = false;
        }
        
        if(mathRB.isSelected() == true){
            program = "B.Sc.Math";
        }
        else if(multiRB.isSelected() == true){
            program = "B.Sc.Multimedia";
        }
        else if(indRB.isSelected() == true){
            program = "B.Sc. Ind";
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select the course");
            result = false;  
        }
        
        if(result == true){
            outputTA.setText("One student infomation is successfully added.\n");
            studentArray[studentIndex] = new Student(name, matric, program, coursework, exam);
            studentIndex++;
        }else{
            outputTA.setText("The student data is not created. \n");
        }

        nameTF.setText("");
        matricTF.setText("");
        courseworkTF.setText("");
        examTF.setText("");
        buttonGroup1.clearSelection();
        outputTA.append("Number of student data added = " + studentIndex );
        
    }//GEN-LAST:event_addBTNActionPerformed

    
    private void displayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTNActionPerformed
        
        outputTA.setText("Displaying student data: \n \n");
         
        for (int i = 0; i< studentIndex; i++ ){
            outputTA.append("Name : " + studentArray[i].getStudent() + "\n");
            outputTA.append("Matric No. : " + studentArray[i].getMatric() + "\n");
            outputTA.append("Program : " + studentArray[i].getProgram() + "\n");
            outputTA.append("Total Course work mark : " + studentArray[i].getCoursework() + "\n");
            outputTA.append("Final exam mark : " + studentArray[i].getExam() + "\n");
            outputTA.append("Grade : " + studentArray[i].computeGrade() + "\n");
            outputTA.append("================================================= \n");    
        }
    }//GEN-LAST:event_displayBTNActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        int matric = Integer.parseInt(JOptionPane.showInputDialog("Please enter the Matric No."));
        int i;
        for ( i = 0; i < studentIndex; i++) {
            if (matric == studentArray[i].getMatric()) {
                
                outputTA.setText("Name : " + studentArray[i].getStudent() + "\n");
                outputTA.append("Matric No. : " + studentArray[i].getMatric() + "\n");
                outputTA.append("Program : " + studentArray[i].getProgram() + "\n");
                outputTA.append("Total Course work mark : " + studentArray[i].getCoursework() + "\n");
                outputTA.append("Final exam mark : " + studentArray[i].getExam() + "\n");
                outputTA.append("Grade : " + studentArray[i].computeGrade() + "\n");
                break;
            } 
            
           
        }
        
        if(i==studentIndex){
         JOptionPane.showMessageDialog(null,"The matric number cannot search");
        }
        
        
    }//GEN-LAST:event_searchBTNActionPerformed

    private void showBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBTNActionPerformed
        outputTA.setText("The distribution is as follow: \n \n");
        
        int aPlus = 0;
        int a = 0;
        int aMinus = 0;
        int bPlus = 0;
        int b = 0;
        int bMinus = 0;
        int cPlus = 0;
        int c = 0;
        int cMinus = 0;
        int dPlus = 0;
        int d = 0;
        int f = 0;
        
        for (int i = 0; i< studentIndex; i++ ){
            switch(studentArray[i].computeGrade()){
                case "A+" : aPlus++; break;
                case "A" : a++; break;
                case "A-" : aMinus++; break;
                case "B+" : bPlus++; break;
                case "B" : b++; break;
                case "B-" : bMinus++; break;
                case "C+" : cPlus++; break;
                case "C" : c++; break;
                case "C-" : cMinus++; break;
                case "D+" : dPlus++; break;
                case "D" : d++; break;
                default : f++; break;
            }
        }
        
            outputTA.append("The total number of Grade A+ is " + aPlus + "\n");
            outputTA.append("The total number of Grade A is " + a + "\n");
            outputTA.append("The total number of Grade A- is " + aMinus + "\n");
            outputTA.append("The total number of Grade B+ is " + bPlus + "\n");
            outputTA.append("The total number of Grade B is " + b + "\n");
            outputTA.append("The total number of Grade B- is " + bMinus + "\n");
            outputTA.append("The total number of Grade C+ is " + cPlus + "\n");
            outputTA.append("The total number of Grade C is " + c + "\n");
            outputTA.append("The total number of Grade C- is " + cMinus + "\n");
            outputTA.append("The total number of Grade D+ is " + dPlus + "\n");
            outputTA.append("The total number of Grade D is " + d + "\n");
            outputTA.append("The total number of Grade F is " + f + "\n");
    }//GEN-LAST:event_showBTNActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        System.exit(1);

    }//GEN-LAST:event_exitBTNActionPerformed


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
            java.util.logging.Logger.getLogger(StudentInfoSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInfoSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInfoSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInfoSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StudentInfoSys().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField courseworkTF;
    private javax.swing.JButton displayBTN;
    private javax.swing.JTextField examTF;
    private javax.swing.JButton exitBTN;
    private javax.swing.JRadioButton indRB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JOptionPane jOptionPane3;
    private javax.swing.JOptionPane jOptionPane4;
    private javax.swing.JOptionPane jOptionPane5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton mathRB;
    private javax.swing.JTextField matricTF;
    private javax.swing.JRadioButton multiRB;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextArea outputTA;
    private javax.swing.JButton resetBTN;
    private javax.swing.JButton searchBTN;
    private javax.swing.JButton showBTN;
    // End of variables declaration//GEN-END:variables
}
