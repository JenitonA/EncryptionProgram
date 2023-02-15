/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// By Jeniton Augustinpillai, 2020/11/10

public class frmBinaryandHexadecimalConverter extends javax.swing.JFrame {

    
    public frmBinaryandHexadecimalConverter() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblAns1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDecToBin = new javax.swing.JTextField();
        btnDecToBin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblAns2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBinToDec = new javax.swing.JTextField();
        btnBinToDec = new javax.swing.JButton();
        lblAns3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDecToHex = new javax.swing.JTextField();
        btnDecToHex = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblAns4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtHexToDec = new javax.swing.JTextField();
        btnHexToDec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setForeground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("--Number Systems--");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 22, -1, -1));

        lblAns1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        lblAns1.setForeground(new java.awt.Color(255, 255, 255));
        lblAns1.setText("...");
        jPanel1.add(lblAns1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 120, -1));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter a decimal number:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 131, -1, -1));
        jPanel1.add(txtDecToBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 132, 120, -1));

        btnDecToBin.setText("Dec To Bin");
        btnDecToBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecToBinActionPerformed(evt);
            }
        });
        jPanel1.add(btnDecToBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Decimal and Binary");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 81, 150, -1));

        lblAns2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        lblAns2.setForeground(new java.awt.Color(255, 255, 255));
        lblAns2.setText("...");
        jPanel1.add(lblAns2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 120, -1));

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter a binary number:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        jPanel1.add(txtBinToDec, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 120, -1));

        btnBinToDec.setText("Bin to Dec");
        btnBinToDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinToDecActionPerformed(evt);
            }
        });
        jPanel1.add(btnBinToDec, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        lblAns3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        lblAns3.setForeground(new java.awt.Color(255, 255, 255));
        lblAns3.setText("...");
        jPanel1.add(lblAns3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 120, -1));

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enter a decimal number:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        jPanel1.add(txtDecToHex, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 120, -1));

        btnDecToHex.setText("Dec To Hex");
        btnDecToHex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecToHexActionPerformed(evt);
            }
        });
        jPanel1.add(btnDecToHex, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Decimal and Hexadecimal");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 190, -1));

        lblAns4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        lblAns4.setForeground(new java.awt.Color(255, 255, 255));
        lblAns4.setText("...");
        jPanel1.add(lblAns4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 100, -1));

        jLabel11.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Enter a hexadecimal number:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));
        jPanel1.add(txtHexToDec, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 120, -1));

        btnHexToDec.setText("Hex to Dec");
        btnHexToDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHexToDecActionPerformed(evt);
            }
        });
        jPanel1.add(btnHexToDec, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    DecToBin
    
    This method will find out the binary number of a decimal number by using a loop and modulos operations
    
    Parameter: Int
    
    Return: String
    */
    public static String DecToBin (int userNum) {
       
       String binaryOutput = ""; 
       int binary[] = new int [100];
       int i = 0;
       
       // This Loops around until the user num is 0
       while (userNum != 0) {
           
           binary[i] = userNum % 2; // This will get the remainder of the userNum, which will either be 0 or 1. It will store it into the array
           userNum /= 2; // Then it divides the num by 2 and loops back to the top with the i++
           i++;
       }
       
       // This reverses the array and add the binary number to the string that had nothing in it before
       for (int j = i-1; j >= 0; j--) {
            binaryOutput += String.valueOf(binary[j]);
            
       }
       
       return binaryOutput; // returns the String

    }
    
    /*
    BinToDec
    
    This method will convert the binary number to a decimal number by using a while loop and if statements
    
    Parameters; int
    
    return: int
    */
    public static int BinToDec (int userNum) {
        
        int decimal = 0;
        int iteration = 0;
        
        // Loop will end when userNum == 0
        while (userNum != 0) {
            
            decimal += (userNum%10)*Math.pow(2, iteration); // This is the equation that will find the decimal value
            userNum /= 10; // Then it will divide it by 10 and store it back. It then loops back
            iteration++; // Adds 1
        }
        
        return decimal; 
    }
    
    
    /*
    DecToHex
    
    This method will convert the decimal number to a hexadecimal number by suing a while loop
    
    Parameter: int
    
    return: Stirng
    */
    public static String DecToHex (int userNum) {
        
        String hexadecimal = ""; // This will store the final hexadecimal number
        char[] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; // These are the hexadecimal digits
        
        while (userNum >0) {
            hexadecimal = hex[userNum % 16] + hexadecimal; // This will get the hex digit and find the remainder of 16 divided by the userNum
            userNum /= 16; // This will divide it by 16
        }
        
        return hexadecimal;
    }
    
    /*
    HexToDec
    
    This method will find the hexadecimal value by converting the decimal value inputed by the user.
    
    Parameter: String
    
    return; int
    */
    public static int HexToDec (String userNum) {
        
        userNum = userNum.toUpperCase(); // I make the user input all to capital just in case the user inputs without any uppercase
        int decimalNum = 0; 
        
        
        String hexDigits = "0123456789ABCDEF";
        
        for (int i = 0; i < userNum.length(); i++) {
            
            char digit = userNum.charAt(i); // This will get the first digit in the userNum
            int hexDigitIndex = hexDigits.indexOf(digit); // This will get the index of where the user index corresponds to in the hexDigits String
            decimalNum = 16 * decimalNum + hexDigitIndex; // This is the equation
        }
        
       return decimalNum; 
        
    }
    
    
    private void btnDecToBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecToBinActionPerformed
        
        int userNum;
        
        try {
            userNum = Integer.parseInt(txtDecToBin.getText()); // Parseing the input

            // If the number is negative
            if (userNum < 0) {
                lblAns1.setText("INVALID");
            }


            // Exception. IF its a 0, then it will be equal to 0
            else if (userNum == 0) {
                lblAns1.setText("0");
            }

            else {
            lblAns1.setText(DecToBin(userNum)); // calling the method
            }
        }
        
        catch (NumberFormatException e) {
            lblAns1.setText("INVALID");
        }
        
        
        
    }//GEN-LAST:event_btnDecToBinActionPerformed

    private void btnBinToDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinToDecActionPerformed
        
        int userNum;
        
        
        
        userNum = Integer.parseInt(txtBinToDec.getText());
        
        lblAns2.setText(String.valueOf(BinToDec(userNum)));
        
        
        
    }//GEN-LAST:event_btnBinToDecActionPerformed

    private void btnDecToHexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecToHexActionPerformed
        
        int userNum;
        
        try {
            userNum = Integer.parseInt(txtDecToHex.getText());

            // If the number is negative
            if (userNum < 0) {
                lblAns3.setText("INVALID");
            }


            // Exception. IF its a 0, then it will be equal to 0
            else if (userNum == 0) {
                lblAns3.setText("0");
            }

            else {
            lblAns3.setText(DecToHex(userNum));
            }
        }
        
        catch (NumberFormatException e) {
            lblAns3.setText("INVALID");
        }
        
        
    }//GEN-LAST:event_btnDecToHexActionPerformed

    private void btnHexToDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHexToDecActionPerformed
        
        String userNum;
        
        userNum = txtHexToDec.getText();
        
        lblAns4.setText(String.valueOf(HexToDec(userNum)));
 
    }//GEN-LAST:event_btnHexToDecActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmBinaryandHexadecimalConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBinaryandHexadecimalConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBinaryandHexadecimalConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBinaryandHexadecimalConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBinaryandHexadecimalConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBinToDec;
    private javax.swing.JButton btnDecToBin;
    private javax.swing.JButton btnDecToHex;
    private javax.swing.JButton btnHexToDec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAns1;
    private javax.swing.JLabel lblAns2;
    private javax.swing.JLabel lblAns3;
    private javax.swing.JLabel lblAns4;
    private javax.swing.JTextField txtBinToDec;
    private javax.swing.JTextField txtDecToBin;
    private javax.swing.JTextField txtDecToHex;
    private javax.swing.JTextField txtHexToDec;
    // End of variables declaration//GEN-END:variables
}
