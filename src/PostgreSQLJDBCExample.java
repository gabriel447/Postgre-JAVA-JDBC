import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLJDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/work";
        String user = "postgres";
        String password = "1234";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão com o PostgreSQL estabelecida com sucesso!");
            // Agora você pode executar consultas SQL e interagir com o banco de dados.
            connection.close();
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao PostgreSQL: " + e.getMessage());
        }
    }
}




