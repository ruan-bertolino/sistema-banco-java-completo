package banco.dao;

import banco.model.ContaPoupanca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContaPoupancaDAO {
    private Connection conn;

    public ContaPoupancaDAO() {
        this.conn = ConexaoDB.getConexao();
    }

    
    public void inserir(ContaPoupanca conta) throws SQLException {
        String sql = "INSERT INTO contas_poupanca (numero_conta, saldo, taxa_rendimento, cliente_id) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, conta.getNumeroConta());
        stmt.setDouble(2, conta.getSaldo());
        stmt.setDouble(3, conta.getTaxaRendimento());
        stmt.setInt(4, conta.getCliente().getId());
        stmt.executeUpdate();
        stmt.close();
    }

 
    public ContaPoupanca buscarPorNumero(int numeroConta) throws SQLException {
        String sql = "SELECT * FROM contas_poupanca WHERE numero_conta = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, numeroConta);
        ResultSet rs = stmt.executeQuery();

        ContaPoupanca conta = null;
        if (rs.next()) {
            conta = new ContaPoupanca(
                rs.getInt("numero_conta"),
                null, // Cliente será buscado separadamente pelo cliente_id
                rs.getDouble("saldo"),
                rs.getDouble("taxa_rendimento")
            );
        }

        rs.close();
        stmt.close();
        return conta;
    }


    public void atualizar(ContaPoupanca conta) throws SQLException {
        String sql = "UPDATE contas_poupanca SET saldo=?, taxa_rendimento=? WHERE numero_conta=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setDouble(1, conta.getSaldo());
        stmt.setDouble(2, conta.getTaxaRendimento());
        stmt.setInt(3, conta.getNumeroConta());
        stmt.executeUpdate();
        stmt.close();
    }

    
    public void deletar(int numeroConta) throws SQLException {
        String sql = "DELETE FROM contas_poupanca WHERE numero_conta=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, numeroConta);
        stmt.executeUpdate();
        stmt.close();
    }
}
