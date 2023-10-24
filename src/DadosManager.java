import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
public class DadosManager {
    public static void inserirDados() {
        try {
            Connection connection = DatabaseConnector.getConnection();
            Statement statement = connection.createStatement();
            String insertDataSQL = "INSERT INTO usuarios (nome, email) VALUES ('Gabriel', 'gabe10@exemplo.com');";
            statement.executeUpdate(insertDataSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
