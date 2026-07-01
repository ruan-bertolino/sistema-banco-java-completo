
package banco.ui;

import banco.model.Usuario;

  

    public class TelaCadastroUsuario extends javax.swing.JFrame {

        private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName());
        private TelaGerenciarUsuarios telaPai;
        private Long idUsuarioEdicao;

        public TelaCadastroUsuario(TelaGerenciarUsuarios telaPai, Long idUsuarioEdicao) {
            this.telaPai = telaPai;
            this.idUsuarioEdicao = idUsuarioEdicao;
            initComponents();

            // Se veio um ID, significa que estamos EDITANDO alguém
            if (this.idUsuarioEdicao != null) {
                banco.service.UsuarioService usuarioService = new banco.service.UsuarioService();
                banco.model.Usuario u = usuarioService.buscarPorId(idUsuarioEdicao);
                if (u != null) {
                    txtNome.setText(u.getNome());
                    TxtLogin.setText(u.getLogin()); // Lembra do seu 'T' maiúsculo!
                    cbPerfil.setSelectedItem(u.getPerfil());
                    TxtLogin.setEditable(false); // Não deixa mudar o login ao editar
                }
            }
        }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        TxtLogin = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbPerfil = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lblErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setText("Cadastro de Usuário");

        jLabel2.setText("Nome:");

        jLabel3.setText("Login:\n");

        jLabel4.setText("Confirmar Senha ;");

        jLabel5.setText("Senha;");

        TxtLogin.addActionListener(this::TxtLoginActionPerformed);

        jLabel6.setText("Perfil:");

        cbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Operador" }));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(this::btnSalvarActionPerformed);

        lblErro.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblErro)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(31, 31, 31)
                                .addComponent(cbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TxtLogin, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblErro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        lblErro.setText(""); // Limpa mensagens de erro antigas

        String nome = txtNome.getText().trim();
        String login = TxtLogin.getText().trim(); // Atenção ao seu T maiúsculo
        String senha = new String(txtSenha.getPassword()).trim();
        String confirmar = new String(txtConfirmarSenha.getPassword()).trim();
        String perfil = cbPerfil.getSelectedItem().toString();

        if (nome.isEmpty() || login.isEmpty()) {
            lblErro.setText("Erro: Nome e Login são obrigatórios!");
            return;
        }

        if (idUsuarioEdicao == null && senha.isEmpty()) {
            lblErro.setText("Erro: A senha é obrigatória para novos usuários!");
            return;
        }

        if (!senha.isEmpty() && !senha.equals(confirmar)) {
            lblErro.setText("Erro: As senhas digitadas não coincidem!");
            return;
        }

        banco.service.UsuarioService usuarioService = new banco.service.UsuarioService();

        if (idUsuarioEdicao == null) {
            // === MODO CADASTRO NOVO ===
            banco.model.Usuario novo = new banco.model.Usuario(nome, login, senha, perfil);
            usuarioService.cadastrar(novo);

            telaPai.notificarMudanca("Usuário cadastrado com sucesso!");
            this.dispose();
        } else {
            banco.model.Usuario usuarioEditado = usuarioService.buscarPorId(idUsuarioEdicao);
            if (usuarioEditado != null) {
                usuarioEditado.setNome(nome);
                usuarioEditado.setPerfil(perfil);

                if (!senha.isEmpty()) {
                    usuarioEditado.setSenha(senha);
                }

                usuarioService.atualizar(usuarioEditado);
                telaPai.notificarMudanca("Usuário atualizado com sucesso!");
                this.dispose();
            }
        }
    
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void TxtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLoginActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new TelaCadastroUsuario(null, null).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtLogin;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblErro;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
    }
