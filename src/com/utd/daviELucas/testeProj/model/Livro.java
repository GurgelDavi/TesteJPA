package com.utd.daviELucas.testeProj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name= "livro")
@Table (name ="livros")
public class Livro {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pk_id_livro",nullable=false,unique=true)
	private int pkIdLivro;
	@Column(name="titulo", nullable=false,unique=false)
	private String titulo;
	@Column(name="edicao", nullable=false,unique=false)
	private String edicao;
	@Column(name="editora", nullable=false,unique=false)
	private String editora;
	@Column(name="disponivel", nullable=false,unique=false)
	private boolean disponivel;
	public int getPkIdLivro() {
		return pkIdLivro;
	}
	public void setPkIdLivro(int pkIdLivro) {
		this.pkIdLivro = pkIdLivro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
}
