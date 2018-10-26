package com.utd.daviELucas.testeProj.dao;

import java.util.List;

import com.utd.daviELucas.testeProj.model.Usuario;

public interface UsuarioDao {
	public void inserir(Usuario obj);
	public void remover(Usuario obj);
	public void alterar(Usuario obj);
	public List<Usuario> listar(Usuario obj);
}
