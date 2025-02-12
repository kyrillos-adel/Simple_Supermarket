
package KMarketFrames;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import KMarketFrames.SignIn;


public class EmployeeView extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public EmployeeView() {
        initComponents();
        setLocation(500, 200);
        model = (DefaultTableModel) table.getModel();
        user = SignIn.LastLogin();
      
        
    }
    DefaultTableModel model;
    private static DTO.DTOUser user;
    private DTO.DTOItem newItem;
    private BAO.BAOStoreInterface storeItem = new BAO.BAOFactory().getStoreBAO();
    private BAO.BAOStoreInterface catagories = new BAO.BAOFactory().getStoreBAO();
    float total_price = 0;
   

    public static int getABORT() {
        return ABORT;
    }
    
    
    private static DTO.DTOItem item = new DTO.DTOItem();
    
    public static DTO.DTOItem getPrintedItem(){
    return item;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        printBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        barcodeTF = new javax.swing.JTextField();
        quantityTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        remodeBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        totalPriceTF = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(121, 121, 121, 121));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        addBtn.setBackground(new java.awt.Color(0, 102, 204));
        addBtn.setFont(new java.awt.Font("AG Book Rounded", 1, 20)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_add_64px.png"))); // NOI18N
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        printBtn.setBackground(new java.awt.Color(0, 102, 204));
        printBtn.setFont(new java.awt.Font("AG Book Rounded", 1, 20)); // NOI18N
        printBtn.setForeground(new java.awt.Color(255, 255, 255));
        printBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_bill_52px.png"))); // NOI18N
        printBtn.setText("Print bill");
        printBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 102, 204));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        barcodeTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        quantityTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("AG Book Rounded", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Barcode");

        jLabel6.setFont(new java.awt.Font("AG Book Rounded", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Quantity");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product name", "price of 1", "Quantity", "Quantity price"
            }
        ));
        table.setName(""); // NOI18N
        table.setRowHeight(25);
        table.setSelectionForeground(new java.awt.Color(0, 153, 204));
        jScrollPane1.setViewportView(table);

        remodeBtn.setBackground(new java.awt.Color(0, 102, 204));
        remodeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_trash_52px.png"))); // NOI18N
        remodeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remodeBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("total price :");

        totalPriceTF.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        totalPriceTF.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(barcodeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(quantityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(179, 179, 179)
                                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(remodeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalPriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(barcodeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(remodeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/supermarket-1692209-1436717.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Casual", 0, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("K-MARKET");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel3.setFont(new java.awt.Font("AG Book Rounded", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome");

        jLabel7.setFont(new java.awt.Font("AG Book Rounded", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Employee View");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_male_user_64px.png"))); // NOI18N
        jLabel4.setToolTipText("Edit your profile");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(46, 99, 145));
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Logout");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 11, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jButton12)))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton12)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
      try{
         table.print();
      }
      catch(Exception E){
       JOptionPane.showMessageDialog(rootPane, "Error");
      }
    }//GEN-LAST:event_printBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
try{
        if (storeItem.isExist(barcodeTF.getText())) {
            newItem = storeItem.getItem(barcodeTF.getText());
            if (Integer.parseInt(quantityTF.getText()) > 0 && newItem.getQuantity() >= Integer.parseInt(quantityTF.getText())) {
                model.insertRow(model.getRowCount(), new Object[]{newItem.getName(), newItem.getSellPrice(), quantityTF.getText(), ((Integer.parseInt(quantityTF.getText(), 10)) * (newItem.getSellPrice()))});
                total_price = total_price + ((Integer.parseInt(quantityTF.getText())) * (newItem.getSellPrice()));
                totalPriceTF.setText(String.valueOf(total_price));
                newItem.setQuantity(newItem.getQuantity() - (Integer.parseInt(quantityTF.getText())));
            } else {
                JOptionPane.showMessageDialog(rootPane, "Try another quantity");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Not Exist");
        }
}catch(Exception e){System.out.println("");}
    }//GEN-LAST:event_addBtnActionPerformed

    private void remodeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remodeBtnActionPerformed
        try {
            int i = table.getSelectedRow();
            if (i >= 0) {
                total_price = total_price - Float.valueOf(model.getValueAt(i, 3).toString());
                newItem.setQuantity(newItem.getQuantity() + Integer.valueOf(model.getValueAt(i, 2).toString()));
                model.removeRow(i);
                totalPriceTF.setText(String.valueOf(total_price));
            } else {
                JOptionPane.showMessageDialog(rootPane, "Delete Error");
            }
        } catch (Exception e) {
            System.out.println("");
        }

    }//GEN-LAST:event_remodeBtnActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        EmployeeProfile p = new EmployeeProfile();
        p.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
SignIn.main(new String[0]);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField barcodeTF;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton printBtn;
    private javax.swing.JTextField quantityTF;
    private javax.swing.JButton remodeBtn;
    private javax.swing.JTable table;
    private javax.swing.JLabel totalPriceTF;
    // End of variables declaration//GEN-END:variables
}
