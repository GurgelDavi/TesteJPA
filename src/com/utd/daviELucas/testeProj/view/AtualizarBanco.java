package com.utd.daviELucas.testeProj.view;

import javax.persistence.EntityManager;

import com.utd.daviELucas.testeProj.controller.ResourcePersistence;


public class AtualizarBanco {
	public static void main(String[] args) {
		//EntityManager em = ResourcePersistence.geEntityManager();
		CriarUsuarios c = new CriarUsuarios();
		c.createUsers();
		
	}
}
