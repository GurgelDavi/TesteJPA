package com.utd.daviELucas.testeProj.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ResourcePersistence {
	private static EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("TesteProj");
	public static EntityManager geEntityManager(){
		return emf.createEntityManager();
	}
}

