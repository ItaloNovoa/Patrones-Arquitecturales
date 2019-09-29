package arem.lab5.demo;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class UsuarioService implements UserServices{
	
	@Autowired
	private UserR userR;
	
	@Override
	public List<Usuario> list() throws SQLException {
		return userR.findAll();
	}
}


