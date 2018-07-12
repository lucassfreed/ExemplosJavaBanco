
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
    
    private static String CLASS_NAME = "com.mysql.jdbc.Driver";
    private static String HOST = "jdbc:mysql://localhost:3306/exemplo_banco_dados_01";
    private static String LOGIN = "root";
    private static String SENHA = "";
    private static Connection conexao;
    
    public static void main(String[] args) {
        ConexaoFactory.obterConexao();
    }
    
    public static Connection obterConexao() {
        try {
            conexao = DriverManager.getConnection(HOST, LOGIN, SENHA);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexao;
    }
    
    public static void fecharConexao() {
        try {
            if (conexao != null) {
                conexao.close();
            }          
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
