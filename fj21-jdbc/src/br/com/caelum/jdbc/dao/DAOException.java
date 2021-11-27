package br.com.caelum.jdbc.dao;

import java.sql.SQLException;

public class DAOException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
public DAOException() {
	super("Causa do erro desconhecida");
  }

public DAOException(SQLException e) {
	super(e);
}



}
