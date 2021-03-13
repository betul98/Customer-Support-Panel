
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Betül Kul
 */
public class view_cases extends javax.swing.JDialog {
    DefaultTableModel model;
    Operation op = new Operation();

    /**
     * Creates new form view_cases
     */
    public view_cases(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel)case_table.getModel();
        caseView();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        case_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        back_button = new javax.swing.JButton();
        accept_button = new javax.swing.JButton();
        accept_message = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        del_btn = new javax.swing.JButton();
        delete_message = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        case_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Case No", "Customer ID", "Invoice No", "Damaged Goods", "Damage Info", "Warranty Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(case_table);
        if (case_table.getColumnModel().getColumnCount() > 0) {
            case_table.getColumnModel().getColumn(0).setResizable(false);
            case_table.getColumnModel().getColumn(0).setPreferredWidth(3);
            case_table.getColumnModel().getColumn(1).setResizable(false);
            case_table.getColumnModel().getColumn(1).setPreferredWidth(30);
            case_table.getColumnModel().getColumn(2).setResizable(false);
            case_table.getColumnModel().getColumn(2).setPreferredWidth(20);
            case_table.getColumnModel().getColumn(3).setResizable(false);
            case_table.getColumnModel().getColumn(3).setPreferredWidth(30);
            case_table.getColumnModel().getColumn(4).setResizable(false);
            case_table.getColumnModel().getColumn(4).setPreferredWidth(400);
            case_table.getColumnModel().getColumn(5).setResizable(false);
            case_table.getColumnModel().getColumn(5).setPreferredWidth(30);
        }

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Betül Kul\\Desktop\\PROJE\\admin-icon2.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin Panel");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("View Cases");

        back_button.setBackground(new java.awt.Color(255, 255, 255));
        back_button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        back_button.setForeground(new java.awt.Color(102, 0, 102));
        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        accept_button.setBackground(new java.awt.Color(255, 255, 255));
        accept_button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        accept_button.setForeground(new java.awt.Color(102, 0, 102));
        accept_button.setText("Accept");
        accept_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accept_buttonMouseClicked(evt);
            }
        });

        accept_message.setBackground(new java.awt.Color(255, 255, 255));
        accept_message.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        accept_message.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 102));
        jButton1.setText("Denied");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        del_btn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        del_btn.setForeground(new java.awt.Color(102, 0, 102));
        del_btn.setText("Delete");
        del_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_btnActionPerformed(evt);
            }
        });

        delete_message.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        delete_message.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(del_btn)
                    .addComponent(delete_message, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(accept_button)
                        .addGap(57, 57, 57)
                        .addComponent(jButton1))
                    .addComponent(accept_message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(back_button)
                                .addGap(27, 27, 27))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(back_button))
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accept_button)
                    .addComponent(jButton1)
                    .addComponent(del_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accept_message, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(delete_message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
    }// </editor-fold>//GEN-END:initComponents

    public void caseView(){
    model.setRowCount(0);
    ArrayList<Case> cases = new ArrayList<Case>();
    cases= op.caseCome();
    
    if(cases != null){
        for(Case case_list : cases){
            Object[] add = {
            case_list.getCase_no(),case_list.getCustomer_id(),case_list.getInvoice_no(),case_list.getDamaged(),case_list.getDamage_info(),case_list.getWarranty_stat()
            };
        model.addRow(add);
        }
    
    }
    
    
    
    }
    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
       
        
        this.toBack();
        admin_entry ae=new admin_entry();
        ae.setVisible(true);
        ae.toFront();
        setVisible(false);
        
        
    }//GEN-LAST:event_back_buttonActionPerformed

    private void accept_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accept_buttonMouseClicked
      
        int selectedRow = case_table.getSelectedRow();
        if(selectedRow == -1){
            if(model.getRowCount()==0){
                accept_message.setText("Case table is empty!");
            }
            else{
                accept_message.setText("Choose a case to review!");
            }
        }
        else{
        
        int case_no =(int) model.getValueAt(selectedRow, 0);
        String status =(String) model.getValueAt(selectedRow, 5);
        op.WarrantyUpdate(case_no,status,1);
        caseView();
        accept_message.setText("Case is reviewed!");
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_accept_buttonMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int selectedRow = case_table.getSelectedRow();
        if(selectedRow == -1){
            if(model.getRowCount()==0){
                accept_message.setText("Case table is empty!");
            }
            else{
                accept_message.setText("Choose a case to review!");
            }
        }
        else{
       
        int case_no =(int) model.getValueAt(selectedRow, 0);
        String status =(String) model.getValueAt(selectedRow, 5);
        op.WarrantyUpdate(case_no,status,0);
        caseView();
        accept_message.setText("Case is reviewed!");
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void del_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_btnActionPerformed
        int selectedRow = case_table.getSelectedRow();
        if(selectedRow == -1){
            if(model.getRowCount()==0){
                delete_message.setText("Case table is empty!");
            }
            else{
                delete_message.setText("Choose a case to delete!");
            }
        }
        else{
       
        int case_no =(int) model.getValueAt(selectedRow, 0);
        op.deleteCase(case_no);
        caseView();
        delete_message.setText("Case is deleted!");
        }// 
    }//GEN-LAST:event_del_btnActionPerformed

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
            java.util.logging.Logger.getLogger(view_cases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_cases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_cases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_cases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                view_cases dialog = new view_cases(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accept_button;
    private javax.swing.JLabel accept_message;
    private javax.swing.JButton back_button;
    private javax.swing.JTable case_table;
    private javax.swing.JButton del_btn;
    private javax.swing.JLabel delete_message;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
