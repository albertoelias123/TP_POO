/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.alberto.tp2.view;

/**
 *
 * @author Lucas Soares Gomes
 */
public class ClienteView extends javax.swing.JInternalFrame {

    /**
     * Creates new form ClienteView
     */
    
    final public void initialState(){
        btnConsultarCliente.setEnabled(true);
        btnNovoCliente.setEnabled(true);
        btnSalvarCliente.setEnabled(false);
        btnEditarCliente.setEnabled(false);
        btnExcluirCliente.setEnabled(false);
        btnLimparCliente.setEnabled(false);
        txtCodCliente.setEnabled(true);
        txtCPFCliente.setEnabled(false);
        txtNomeCliente.setEnabled(false);
        txtEmailCliente.setEnabled(false);
        txtSenhaCliente.setEnabled(false);
    }
    
    final public void newState(){
        btnConsultarCliente.setEnabled(true);
        btnNovoCliente.setEnabled(true);
        btnSalvarCliente.setEnabled(true);
        btnEditarCliente.setEnabled(false);
        btnExcluirCliente.setEnabled(false);
        btnLimparCliente.setEnabled(true);
        txtCodCliente.setEnabled(true);
        txtCPFCliente.setEnabled(true);
        txtNomeCliente.setEnabled(true);
        txtEmailCliente.setEnabled(true);
        txtSenhaCliente.setEnabled(true);
    }
    
    final public void readState(){
        btnConsultarCliente.setEnabled(true);
        btnNovoCliente.setEnabled(true);
        btnSalvarCliente.setEnabled(false);
        btnEditarCliente.setEnabled(true);
        btnExcluirCliente.setEnabled(true);
        btnLimparCliente.setEnabled(false);
        txtCodCliente.setEnabled(false);
        txtCPFCliente.setEnabled(true);
        txtNomeCliente.setEnabled(true);
        txtEmailCliente.setEnabled(true);
        txtSenhaCliente.setEnabled(true);
    }
    
    final public void clean(){
        initialState();
        txtCodCliente.setText(null);
        txtCPFCliente.setText(null);
        txtNomeCliente.setText(null);
        txtEmailCliente.setText(null);
        txtSenhaCliente.setText(null);
    }
    
    public ClienteView() {
        initComponents();
        initialState();
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
        jLabel3 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmailCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSenhaCliente = new javax.swing.JPasswordField();
        txtCPFCliente = new javax.swing.JFormattedTextField();
        btnConsultarCliente = new javax.swing.JButton();
        btnLimparCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnSalvarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnNovoCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Clientes");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cliente"));
        jPanel1.setLayout(null);

        jLabel3.setText("CPF");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 30, 50, 30);
        jPanel1.add(txtNomeCliente);
        txtNomeCliente.setBounds(380, 30, 190, 30);

        jLabel4.setText("Nome");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(320, 30, 50, 30);
        jPanel1.add(txtEmailCliente);
        txtEmailCliente.setBounds(80, 80, 190, 30);

        jLabel5.setText("Email");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 80, 50, 30);

        jLabel6.setText("Senha");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(320, 80, 50, 30);
        jPanel1.add(txtSenhaCliente);
        txtSenhaCliente.setBounds(380, 80, 190, 30);
        jPanel1.add(txtCPFCliente);
        txtCPFCliente.setBounds(80, 30, 190, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 70, 600, 140);

        btnConsultarCliente.setText("Consultar");
        btnConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultarCliente);
        btnConsultarCliente.setBounds(310, 30, 100, 32);

        btnLimparCliente.setText("Cancelar");
        btnLimparCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimparCliente);
        btnLimparCliente.setBounds(530, 230, 90, 32);

        btnEditarCliente.setText("Editar");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarCliente);
        btnEditarCliente.setBounds(280, 230, 77, 32);

        btnSalvarCliente.setText("Salvar");
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarCliente);
        btnSalvarCliente.setBounds(160, 230, 66, 32);

        jLabel1.setText("Código");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 30, 50, 30);
        getContentPane().add(txtCodCliente);
        txtCodCliente.setBounds(100, 30, 190, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(100, 30, 190, 30);

        jLabel2.setText("Código");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 30, 50, 30);

        btnNovoCliente.setText("Novo");
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovoCliente);
        btnNovoCliente.setBounds(40, 230, 58, 32);

        btnExcluirCliente.setText("Excluir");
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluirCliente);
        btnExcluirCliente.setBounds(410, 230, 77, 32);

        setBounds(0, 0, 661, 318);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarClienteActionPerformed
        readState();
    }//GEN-LAST:event_btnConsultarClienteActionPerformed

    private void btnLimparClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparClienteActionPerformed
        clean();
    }//GEN-LAST:event_btnLimparClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        clean();
        initialState();
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed
        clean();
        initialState();
    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        newState();
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
        clean();
        initialState();
    }//GEN-LAST:event_btnExcluirClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarCliente;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnLimparCliente;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JFormattedTextField txtCPFCliente;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JPasswordField txtSenhaCliente;
    // End of variables declaration//GEN-END:variables
}
