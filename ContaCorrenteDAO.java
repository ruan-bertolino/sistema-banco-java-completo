package banco.dao;

import banco.model.ContaCorrente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContaCorrenteDAO {
    private Connection conn;

    public ContaCorrenteDAO() {
        this.conn = ConexaoDB.getConexao();
    }


    public void inserir(ContaCorrente conta) throws SQLException {
        String sql = "INSERT INTO contas_correntes (numero_conta, saldo, limite_cheque, cliente_id) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, conta.getNumeroConta());
        stmt.setDouble(2, conta.getSaldo());
        stmt.setDouble(3, conta.getLimiteChequeEspecial());
        stmt.setInt(4, conta.getCliente().getId());
        stmt.executeUpdate();
        stmt.close();
    }


    public ContaCorrente buscarPorNumero(int numeroConta) throws SQLException {
        String sql = "SELECT * FROM contas_correntes WHERE numero_conta = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, numeroConta);
        ResultSet rs = stmt.executeQuery();

        ContaCorrente conta = null;
        if (rs.next()) {
            conta = new ContaCorrente(
                rs.getInt("numero_conta"),
                null, // Cliente será buscado separadamente pelo cliente_id
                rs.getDouble("saldo"),
                rs.getDouble("limite_cheque")
            );
     
        }

        rs.close();
        stmt.close();
        return conta;
    }


    public void atualizar(ContaCorrente conta) throws SQLException {
        String sql = "UPDATE contas_correntes SET saldo=?, limite_cheque=? WHERE numero_conta=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setDouble(1, conta.getSaldo());
        stmt.setDouble(2, conta.getLimiteChequeEspecial());
        stmt.setInt(3, conta.getNumeroConta());
        stmt.executeUpdate();
        stmt.close();
    }

    
    public void deletar(int numeroConta) throws SQLException {
        String sql = "DELETE FROM contas_correntes WHERE numero_conta=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, numeroConta);
        stmt.executeUpdate();
        stmt.close();
    }
}
