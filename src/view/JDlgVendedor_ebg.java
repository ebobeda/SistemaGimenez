/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VendedorEbg;
import dao.Vendedor_DAO;
import java.util.List;
import tools.Util_ebg;
/**
 *
 * @author user
 */
public class JDlgVendedor_ebg extends javax.swing.JDialog {

    /**
     * Creates new form JDlgCaixa
     */

    VendedorEbg vendedorEbg;
    Vendedor_DAO vendedor_DAO;
    VendedorController_ebg vendedorControle_ebg;
    JDlgVendedorNovoIA jDlgVendedorNovoIA;
    boolean incluindo;
     
    public JDlgVendedor_ebg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Cadastro de Vendedores");
        setLocationRelativeTo(null);
        jDlgVendedorNovoIA = new JDlgVendedorNovoIA(null, true);
        vendedorControle_ebg = new VendedorController_ebg();
        vendedor_DAO = new Vendedor_DAO();
        List lista = vendedor_DAO.listAll();
        vendedorControle_ebg.setList(lista);
        jTable1.setModel(vendedorControle_ebg);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1_ebg = new javax.swing.JPanel();
        jBtnIncluir_ebg = new javax.swing.JButton();
        jBtnAlterar_ebg = new javax.swing.JButton();
        jBtnExcluir_ebg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
        jScrollPane1.setViewportView(jTable1);

        jPanel1_ebg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBtnIncluir_ebg.setBackground(new java.awt.Color(255, 153, 153));
        jBtnIncluir_ebg.setText("Incluir");
        jBtnIncluir_ebg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluir_ebgActionPerformed(evt);
            }
        });
        jPanel1_ebg.add(jBtnIncluir_ebg);

        jBtnAlterar_ebg.setBackground(new java.awt.Color(255, 153, 153));
        jBtnAlterar_ebg.setText("Alterar");
        jBtnAlterar_ebg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterar_ebgActionPerformed(evt);
            }
        });
        jPanel1_ebg.add(jBtnAlterar_ebg);

        jBtnExcluir_ebg.setBackground(new java.awt.Color(255, 153, 153));
        jBtnExcluir_ebg.setText("Excluir");
        jBtnExcluir_ebg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluir_ebgActionPerformed(evt);
            }
        });
        jPanel1_ebg.add(jBtnExcluir_ebg);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jPanel1_ebg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1_ebg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIncluir_ebgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluir_ebgActionPerformed
        // TODO add your handling code here:
        incluindo = true;
        jDlgVendedorNovoIA.setTitle("Incluir");
        jDlgVendedorNovoIA.setVisible(true);
    }//GEN-LAST:event_jBtnIncluir_ebgActionPerformed

    private void jBtnAlterar_ebgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterar_ebgActionPerformed
        // TODO add your handling code here:
        jDlgVendedorNovoIA.setTitle("Alterar");
        jDlgVendedorNovoIA.setVisible(true);
    }//GEN-LAST:event_jBtnAlterar_ebgActionPerformed

    private void jBtnExcluir_ebgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluir_ebgActionPerformed
        // TODO add your handling code here:
        if(Util_ebg.perguntar("Deseja excuir este vendedor?") == true) {
        int sel = jTable1.getSelectedRow();
        VendedorEbg vendedorEbg = vendedorControle_ebg.getBean(sel);
        vendedor_DAO.delete(vendedorEbg);
        
        List lista = vendedor_DAO.listAll();
        vendedorControle_ebg.setList(lista);
        Util_ebg.mensagem("Excluido com sucesso!");
        }else{
        Util_ebg.mensagem("Exclusão cancelada!");}
    }//GEN-LAST:event_jBtnExcluir_ebgActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgVendedor_ebg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedor_ebg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedor_ebg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedor_ebg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVendedor_ebg dialog = new JDlgVendedor_ebg(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnAlterar_ebg;
    private javax.swing.JButton jBtnExcluir_ebg;
    private javax.swing.JButton jBtnIncluir_ebg;
    private javax.swing.JPanel jPanel1_ebg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
