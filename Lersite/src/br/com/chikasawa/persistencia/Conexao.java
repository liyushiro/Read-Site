package br.com.chikasawa.persistencia;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class Conexao {
	
    public static Connection connect;
    public static Statement stmt;
    String host="127.0.0.1";
    String bancoDados="odonto";
    String login="root";
    String password = "rootroot";
    String porta="3306";
    
    

    public Conexao()
    {
    }

    public Conexao(String host, String bancoDados, String login, String password)
    {
    	Properties p =new Properties();
    	try {
			p.load(Conexao.class.getClassLoader().getResourceAsStream("jdbc.properties"));
			this.host       = p.getProperty("host");
	        this.bancoDados = p.getProperty("base");
	        this.login      = p.getProperty("userBanco");
	        this.password   = p.getProperty("senhaBanco");
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
    


    /* Faz uma conex�o com o banco de dados */
    public void conecta()
    {
        try
        {
            String url = "jdbc:mysql://" + host + "/" + bancoDados + "?user=" + login + "&password=" + password;
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection(url);
            stmt = connect.createStatement();
        }

        catch (ClassNotFoundException ex1)
        {
            System.out.println ("Erro de classe n�o existente: "+ex1.getMessage().toString()+"\n");
        }

        catch (SQLException ex)
        {
              System.out.println ("Erro de SQL: "+ex.getMessage().toString()+"\n");
        }
        catch (Exception e)
        {
            System.out.println ("Outros Erros: "+e.getMessage().toString()+"\n");
        }
        System.out.println ("Conectado");

    }

    /* Faz uma desconexao com o banco de dados */
    public void desconecta ()
    {
        try
        {
            stmt.close ();
            connect.close ();
        }
        catch (Exception e)
        {
            System.out.println ("Error:"+e.getMessage().toString()+"\n");
        }
    }

    /* Retorna a conexao via JDBC do banco de dados para efetuar consultas */
    public Connection getConection() {
        return connect;
    }

}
       