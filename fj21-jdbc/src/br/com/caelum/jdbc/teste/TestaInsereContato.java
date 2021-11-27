package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsereContato {

	public static void main(String[] args) {
        //pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Davi");
		contato.setEmail("davibbraga864@gmail.com");
		contato.setEndereco("Estrada Meringua 1805");
		contato.setDataNascimento(Calendar.getInstance());
		
		//Grave nossa conexão
		ContatoDao dao = new ContatoDao();
		
		//Método elegante
		dao.adiciona(contato);
		
		System.out.println("Gravado!");
		
		
	}

}
