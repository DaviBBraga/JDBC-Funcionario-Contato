package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaInsereFuncionario {
	
	public static void main(String[] args) {
        //pronto para gravar
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Davi");
		funcionario.setUsuario("Dollytos");
		funcionario.setSenha("Dollynho186@");
		
		//Grave nossa conexão
		FuncionarioDao dao = new FuncionarioDao();
		
		//Método elegante
		dao.adiciona(funcionario);
		
		System.out.println("Gravado!");
		
		
	}

}
