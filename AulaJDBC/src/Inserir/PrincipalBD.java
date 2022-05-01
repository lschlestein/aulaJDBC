package Inserir;

import java.sql.SQLException;

public class PrincipalBD {

	public static void main(String[] args) throws SQLException {
		// Cria��o da Classe BancoDados
		BancoDados bd = new BancoDados();
		
		// Endere�o para conex�o ao BD
		String urlBD = "jdbc:mysql://localhost:3306/reuniao?user=root&password=";
		
		// Driver utilizado para acesso ao BD
		String driver = "com.mysql.cj.jdbc.Driver";
		
		// Conex�o ao BD
		System.out.println(bd.conectar(urlBD, driver));
	    	
		String nome = "Lucas Alberto";
		String email = "lschlestein@ufn.edu.br";
		String cargo = "Aluno";
		System.out.println(bd.inserirAlterarExcluir("INSERT INTO pessoa (nome, email, cargo) values ('"+nome+"', '"+email+"', '"+cargo+"')"));

	}

}
