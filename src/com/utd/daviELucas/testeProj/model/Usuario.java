package com.utd.daviELucas.testeProj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name= "usuario")
@Table (name ="usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pk_id_usuario",nullable=false,unique=true)
	private int pkIdUsuario;
	@Column(name="nome",nullable=false,unique=false)
	private String nome;
	@Column(name="senha",nullable=false,unique=false)
	private String senha;
	public int getPKIdUsuario() {
		return pkIdUsuario;
	}
	public void setPKIdUsuario(int phIdUsuario) {
		this.pkIdUsuario = phIdUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
	