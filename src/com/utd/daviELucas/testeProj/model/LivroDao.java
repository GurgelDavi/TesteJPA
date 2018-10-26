package com.utd.daviELucas.testeProj.model;

import java.util.List;


public interface LivroDao {
	public void inserir(Livro obj);
	public void remover(Livro obj);
	public void alterar(Livro obj);
	public List<Livro> listar(Livro obj);
}
