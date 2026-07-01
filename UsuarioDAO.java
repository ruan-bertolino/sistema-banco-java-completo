package banco.dao;

import banco.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    private Connection conn;

    public UsuarioDAO() {
        this.conn = ConexaoDB.getConexao();
    }

    public void inserir(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuarios (login, senha, nome, perfil) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, usuario.getLogin());
        stmt.setString(2, usuario.getSenha()); 
        stmt.setString(3, usuario.getNome());
        stmt.setString(4, usuario.getPerfil());
        stmt.executeUpdate();
        stmt.close();
    }

    public Usuario buscarPorLogin(String login) throws SQLException {
        String sql = "SELECT * FROM usuarios WHERE login = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, login);
        ResultSet rs = stmt.executeQuery();

        Usuario usuario = null;
        if (rs.next()) {
            usuario = new Usuario(
                rs.getInt("id"),
                rs.getString("nome"),   // ordem corrigida
                rs.getString("login"),
                rs.getString("senha"),
                rs.getString("perfil")
            );
        }

        rs.close();
        stmt.close();
        return usuario;
    }

    public void atualizar(Usuario usuario) throws SQLException {
        String sql = "UPDATE usuarios SET senha=?, nome=?, perfil=? WHERE login=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, usuario.getSenha());
        stmt.setString(2, usuario.getNome());
        stmt.setString(3, usuario.getPerfil());
        stmt.setString(4, usuario.getLogin());
        stmt.executeUpdate();
        stmt.close();
    }

    public void deletar(String login) throws SQLException {
        String sql = "DELETE FROM usuarios WHERE login=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, login);
        stmt.executeUpdate();
        stmt.close();
    }
}
