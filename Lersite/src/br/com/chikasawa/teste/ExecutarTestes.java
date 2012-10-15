package br.com.chikasawa.teste;

import br.com.chikasawa.persistencia.Conexao;
import br.com.chikasawa.persistencia.ControladorDePersistencia;

public class ExecutarTestes {
	
	public static void main(String[] args)
	{
		
		ControladorDePersistencia c = new ControladorDePersistencia();
		try {
			c.salvarRegistro();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
