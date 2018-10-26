package com.utd.daviELucas.testeProj.impl;

import java.util.List;

import javax.persistence.EntityManager;

import com.utd.daviELucas.testeProj.controller.ResourcePersistence;
import com.utd.daviELucas.testeProj.dao.LivroDao;
import com.utd.daviELucas.testeProj.model.Livro;

public class LivroFacadeImpl implements LivroDao {
	@Override
	public void inserir(Livro obj) {
		// TODO Auto-generated method stub
		EntityManager em = ResourcePersistence.geEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(obj);
			em.getTransaction().commit();
			System.out.println("Inserido "+obj.getTitulo());
		} catch (Exception e) {
			System.err.println("erro " + e.getMessage());
		}finally {
			em.close();
		}
	}
	@Override
	public void remover(Livro obj) {
		// TODO Auto-generated method stub
		EntityManager em = ResourcePersistence.geEntityManager();
		em.getTransaction().begin();
		em.remove(obj);
		em.getTransaction().commit();
		System.out.println("Removido "+ obj.getTitulo());
	}
	@Override
	public void alterar(Livro obj) {
		// TODO Auto-generated method stub
		EntityManager em = ResourcePersistence.geEntityManager();
		em.getTransaction().begin();
		em.merge(obj);
		em.getTransaction().commit();
		System.out.println("Alterado "+ obj.getTitulo());
	}
	@Override
	public List<Livro> listar(Livro obj) {
		// TODO Auto-generated method stub
		return null;
	}
}
