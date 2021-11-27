package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAlteraContato {

	public static void main(String[] args) {
ContatoDao dao = new ContatoDao();
		
		Contato contato = new Contato();
		contato.setNome("Beatriz");
		contato.setEmail("bililinda@gmail.com");
		contato.setEndereco("Filomena Fragoso");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setId((long) 6);
		
		//Método elegante
		dao.altera(contato);
		System.out.println("Alteração Gravada");

	}

}
