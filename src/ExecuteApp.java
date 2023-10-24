import java.sql.SQLException;

public class ExecuteApp {
    public static void main(String[] args) throws SQLException {
        TabelaManager.criarTabela();
        System.out.println("Tabela Criada com Sucesso!");

        DadosManager.inserirDados();
        System.out.println("Dados Inseridos com Sucesso!");
    }
}




