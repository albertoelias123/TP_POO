/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.alberto.tp2.view;

import local.alberto.tp2.controller.ProdutoController;

/**
 *
 * @author alber
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        jdpArea.removeAll();
        jdpArea.revalidate();
        
        // Inicializa Controller's
        ProdutoController.inicializa();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpArea = new javax.swing.JDesktopPane();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiAddProduct = new javax.swing.JMenuItem();
        jmiAddClient = new javax.swing.JMenuItem();
        jmiAddVenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestão Comercial v1.0alpha");
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jdpArea);
        jdpArea.setBounds(0, 0, 1090, 750);

        jMenuBarPrincipal.setPreferredSize(new java.awt.Dimension(900, 50));

        jMenu1.setText("Cadastro");

        jmiAddProduct.setText("Produto");
        jmiAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAddProductActionPerformed(evt);
            }
        });
        jMenu1.add(jmiAddProduct);

        jmiAddClient.setText("Cliente");
        jmiAddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAddClientActionPerformed(evt);
            }
        });
        jMenu1.add(jmiAddClient);

        jmiAddVenda.setText("Venda");
        jmiAddVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAddVendaActionPerformed(evt);
            }
        });
        jMenu1.add(jmiAddVenda);

        jMenuBarPrincipal.add(jMenu1);

        setJMenuBar(jMenuBarPrincipal);

        setSize(new java.awt.Dimension(1108, 831));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAddProductActionPerformed
        ProdutoView produtoView = new ProdutoView();
        jdpArea.add(produtoView);
        produtoView.setVisible(true);
    }//GEN-LAST:event_jmiAddProductActionPerformed

    private void jmiAddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAddClientActionPerformed
        ClienteView clienteView = new ClienteView();
        jdpArea.add(clienteView);
        clienteView.setVisible(true);
    }//GEN-LAST:event_jmiAddClientActionPerformed

    private void jmiAddVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAddVendaActionPerformed
        VendaView vendaView = new VendaView();
        jdpArea.add(vendaView);
        vendaView.setVisible(true);
    }//GEN-LAST:event_jmiAddVendaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JDesktopPane jdpArea;
    private javax.swing.JMenuItem jmiAddClient;
    private javax.swing.JMenuItem jmiAddProduct;
    private javax.swing.JMenuItem jmiAddVenda;
    // End of variables declaration//GEN-END:variables
}
