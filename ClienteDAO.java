package banco.dao;

import banco.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO {
    private Connection conn;

    public ClienteDAO() {
        this.conn = ConexaoDB.getConexao();
    }

    public void inserir(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO clientes (nome, cpf, telefone) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getCpf());
        stmt.setString(3, cliente.getTelefone());
        stmt.executeUpdate();
        stmt.close();
    }

    public Cliente buscarPorId(int id) throws SQLException {
        String sql = "SELECT * FROM clientes WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();

        Cliente cliente = null;
        if (rs.next()) {
            cliente = new Cliente(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("cpf"),
                rs.getString("telefone")
            );
        }

        rs.close();
        stmt.close();
        return cliente;
    }

    public void atualizar(Cliente cliente) throws SQLException {
        String sql = "UPDATE clientes SET nome=?, cpf=?, telefone=? WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getCpf());
        stmt.setString(3, cliente.getTelefone());
        stmt.setInt(4, cliente.getId());
        stmt.executeUpdate();
        stmt.close();
    }

    public void deletar(int id) throws SQLException {
        String sql = "DELETE FROM clientes WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.executeUpdate();
        stmt.close();
    }
}
