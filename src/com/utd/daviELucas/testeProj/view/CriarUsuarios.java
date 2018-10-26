package com.utd.daviELucas.testeProj.view;

import com.utd.daviELucas.testeProj.impl.UsuarioFacadeImpl;
import com.utd.daviELucas.testeProj.model.Usuario;

public class CriarUsuarios {
	public void createUsers(){
		UsuarioFacadeImpl uf = new UsuarioFacadeImpl();
		Usuario adm = new Usuario();
		//adm.setPKIdUsuario(1);
		adm.setNome("Adm");
		adm.setSenha("123");
		uf.inserir(adm);
		
		Usuario usu1 = new Usuario();
		//usu1.setPKIdUsuario(2);
		usu1.setNome("Falcão");
		usu1.setSenha("qwe");
		uf.inserir(usu1);
		
		Usuario usu2 = new Usuario();
		//usu2.setPKIdUsuario(2);
		usu2.setNome("Davi");
		usu2.setSenha("rty");
		uf.inserir(usu2);
	}
	
}
