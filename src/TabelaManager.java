import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
public class TabelaManager {
    public static void criarTabela() {
        try {
            Connection connection = DatabaseConnector.getConnection();
            Statement statement = connection.createStatement();
            String createTableSQL = "CREATE TABLE usuarios (id serial PRIMARY KEY, nome VARCHAR(255), email VARCHAR(100));";
            statement.executeUpdate(createTableSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
