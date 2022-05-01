
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrincipalBD {

	public static void main(String[] args) throws SQLException {
		// Cria��o da Classe BancoDados
		BancoDados bd = new BancoDados();
		
		// Endere�o para conex�o ao BD
		String urlBD = "jdbc:mysql://localhost:3306/reuniao?user=root&password=";
		
		// Driver utilizado para acesso ao BD
		String driver = "com.mysql.cj.jdbc.Driver";
		
		//ResultSet "Tabela" com os valores retornados da Busca
		ResultSet resultado = null;
		
		// Conex�o ao BD
		System.out.println(bd.conectar(urlBD, driver));
		resultado = bd.consultar("select * from pessoa");

		//Verifica se o resultado retornada da pesquisa junto ao BD n�o � vazio, sen�o for exibe no console
		if (resultado != null)
			while (resultado.next()) {
				System.out.println("id: " + resultado.getString("ID") + "\t nome: " + resultado.getString("nome")
						+ "\t email: " + resultado.getString("email") + "\t Cargo: " + resultado.getString("Cargo"));
			}

		
	    System.out.println(bd.inserirAlterarExcluir("UPDATE pessoa SET nome='Paulo Henrique', email='paulo.henri@globo.com', cargo='Aluno' WHERE id=17"));
		
		System.out.println(bd.inserirAlterarExcluir("INSERT INTO pessoa (nome, email, cargo) values ('Jo�o Batista', 'joaoBatista@yahoo.com', 'Professor')"));
		
		System.out.println(bd.inserirAlterarExcluir("DELETE FROM pessoa WHERE id=18"));

	}

}
