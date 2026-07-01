package banco.service;

import banco.dao.UsuarioDAO;
import banco.model.Usuario;
import java.sql.SQLException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class UsuarioService {
    private UsuarioDAO usuarioDAO;

    public UsuarioService() {
        this.usuarioDAO = new UsuarioDAO();
    }

    public void cadastrarUsuario(Usuario usuario) throws SQLException {
        usuarioDAO.inserir(usuario);
    }

    public Usuario buscarUsuarioPorLogin(String login) throws SQLException {
        return usuarioDAO.buscarPorLogin(login);
    }

    public void atualizarUsuario(Usuario usuario) throws SQLException {
        usuarioDAO.atualizar(usuario);
    }

    public void deletarUsuario(String login) throws SQLException {
          if ("ruan".equalsIgnoreCase(login)) {
        throw new IllegalArgumentException("Usuário administrador padrão não pode ser excluído!");
    }
        usuarioDAO.deletar(login);
    }

   public boolean autenticar(String login, String senha) throws SQLException {
    Usuario usuario = usuarioDAO.buscarPorLogin(login);
    if (usuario != null) {
        String senhaHash = gerarHashSHA256(senha);
        return usuario.getSenha().equals(senhaHash);
    }
    return false;
}

private String gerarHashSHA256(String senha) {
    try {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(senha.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    } catch (NoSuchAlgorithmException e) {
        throw new RuntimeException("Erro ao gerar hash SHA-256", e);
    }
}
}