package banco.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDB {

    private static final String URL = "jdbc:postgresql://localhost:5432/projeto_banco";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "admin1234";

    private static Connection instancia = null;

    public static Connection getConexao() {
        try {
            if (instancia == null || instancia.isClosed()) {
                instancia = DriverManager.getConnection(URL, USUARIO, SENHA);
                System.out.println("✓ Conexão com PostgreSQL estabelecida!");
            }
        } catch (SQLException e) {
            System.err.println("✗ Erro ao conectar: " + e.getMessage());
            JOptionPane.showMessageDialog(null,
                "Erro de conexão com o banco!\n" + e.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE);
        }
        return instancia;
    }

   
    public static void fechar() {
        try {
            if (instancia != null) instancia.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
