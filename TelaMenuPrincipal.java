
package banco.ui;
import banco.model.Usuario;

public class TelaMenuPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName());

      public TelaMenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Menu Principal - Sistema Banco");
        lblBemVindo.setText("Bem-vindo, Usuário Teste");
    }
   
    public TelaMenuPrincipal(Usuario usuarioLogado) {
        initComponents();
        setLocationRelativeTo(null);
         setResizable(false);         // não deixa redimensionar
    setTitle("Menu Principal - Sistema Banco");

    lblBemVindo.setText("Bem-vindo, " + usuarioLogado.getNome());

    if (!"ADMIN".equalsIgnoreCase(usuarioLogado.getPerfil())) {
        btnUsuarios.setVisible(false);
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBemVindo = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnContaCorrente = new javax.swing.JButton();
        btnContaPoupanca = new javax.swing.JButton();
        btnOperacoes = new javax.swing.JButton();
        btnExtrato = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal - Sistema Banco");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lblBemVindo.setBackground(new java.awt.Color(0, 204, 51));
        lblBemVindo.setForeground(new java.awt.Color(0, 204, 51));
        lblBemVindo.setText("Bem-vindo xx");

        btnUsuarios.setText("Gerenciar Usuários");
        btnUsuarios.addActionListener(this::btnUsuariosActionPerformed);

        btnClientes.setText("Cadastrar Cliente");
        btnClientes.addActionListener(this::btnClientesActionPerformed);

        btnContaCorrente.setText("Cadastrar Conta Corrente ");
        btnContaCorrente.addActionListener(this::btnContaCorrenteActionPerformed);

        btnContaPoupanca.setText("Cadastrar Conta Poupança");
        btnContaPoupanca.addActionListener(this::btnContaPoupancaActionPerformed);

        btnOperacoes.setText("Operações");
        btnOperacoes.addActionListener(this::btnOperacoesActionPerformed);

        btnExtrato.setText("Extrato");
        btnExtrato.addActionListener(this::btnExtratoActionPerformed);

        jButton1.setText("Relatório");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        btnSair.setText("Sair");
        btnSair.addActionListener(this::btnSairActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExtrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOperacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnContaCorrente)
                            .addComponent(btnContaPoupanca))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUsuarios)
                            .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBemVindo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnContaCorrente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnContaPoupanca, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOperacoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExtrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
       
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
       new TelaCadastroCliente().setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnContaCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContaCorrenteActionPerformed
       new TelaCadastroContaCorrente().setVisible(true);
    }//GEN-LAST:event_btnContaCorrenteActionPerformed

    private void btnContaPoupancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContaPoupancaActionPerformed
       new TelaCadastroContaPoupanca() .setVisible(true);
    }//GEN-LAST:event_btnContaPoupancaActionPerformed

    private void btnOperacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOperacoesActionPerformed
       new TelaOperacoes() .setVisible(true);
    }//GEN-LAST:event_btnOperacoesActionPerformed

    private void btnExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtratoActionPerformed
        new TelaExtrato() .setVisible(true);
    }//GEN-LAST:event_btnExtratoActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
          this.dispose(); 
    new TelaLogin().setVisible(true); 
    }//GEN-LAST:event_btnSairActionPerformed

    
    public static void main(String args[]) {
      
       


        java.awt.EventQueue.invokeLater(() -> new TelaMenuPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnContaCorrente;
    private javax.swing.JButton btnContaPoupanca;
    private javax.swing.JButton btnExtrato;
    private javax.swing.JButton btnOperacoes;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBemVindo;
    // End of variables declaration//GEN-END:variables
}
