package com.utd.daviELucas.testeProj.dao;

import java.util.List;

import com.utd.daviELucas.testeProj.model.Livro;


public interface LivroDao {
	public void inserir(Livro obj);
	public void remover(Livro obj);
	public void alterar(Livro obj);
	public List<Livro> listar(Livro obj);
}
