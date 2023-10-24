import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnector {
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            String url = "jdbc:postgresql://localhost:5432/work";
            String usuario = "postgres";
            String senha = "1234";

            try {
                connection = DriverManager.getConnection(url, usuario, senha);
                //System.out.println("Conexão com o PostgreSQL estabelecida com sucesso!");
            } catch (SQLException e) {
                System.err.println("Erro ao conectar ao PostgreSQL: " + e.getMessage());
            }
        }
        return connection;
    }
}
