package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaRemoveContato {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setId((long) 5);
		
		ContatoDao dao = new ContatoDao();
		
		//M�todo elegante
		dao.remova(contato);
		System.out.println("Remo��o efetuada!");
		
		
	}

}
