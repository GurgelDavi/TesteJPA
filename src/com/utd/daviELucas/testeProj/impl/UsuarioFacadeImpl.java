package com.utd.daviELucas.testeProj.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.utd.daviELucas.testeProj.controller.ResourcePersistence;
import com.utd.daviELucas.testeProj.dao.UsuarioDao;
import com.utd.daviELucas.testeProj.model.Usuario;

public class UsuarioFacadeImpl implements UsuarioDao{
	@Override
	public void inserir(Usuario obj) {
		// TODO Auto-generated method stub
		EntityManager em = ResourcePersistence.geEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(obj);
			em.getTransaction().commit();
			System.out.println("Inserido "+obj.getNome());
		} catch (Exception e) {
			System.err.println("erro " + e.getMessage());
		}finally {
			em.close();
		}
	}
	@Override
	public void remover(Usuario obj) {
		// TODO Auto-generated method stub
		EntityManager em = ResourcePersistence.geEntityManager();
		try {
			
			em.getTransaction().begin();
			em.remove(obj);
			em.getTransaction().commit();
			System.out.println("Removido "+ obj.getNome());
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			em.close();
		}
		
	}
	@Override
	public void alterar(Usuario obj) {
		// TODO Auto-generated method stub
		EntityManager em = ResourcePersistence.geEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(obj);
			em.getTransaction().commit();
			System.out.println("Alterado "+ obj.getNome());
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			em.close();
		}
	}
	@Override
	public List<Usuario> listar(Usuario obj) {
		// TODO Auto-generated method stub
		EntityManager em = ResourcePersistence.geEntityManager();
		List<Usuario> lista = new ArrayList<Usuario>();
		try {
			em.getTransaction().begin();
			if (obj.getNome() != null && !obj.getSenha().equals("")) {
				lista = em.createQuery("SELECT c FROM Usuario c WHERE c.dscName = :name AND c.senha = :senha ")
				.setParameter("name", obj.getNome())
				.setParameter("senha", obj.getSenha())
				.getResultList();
			}else if (obj.getNome() != null) {
				lista = em.createQuery("SELECT c FROM Usuario c WHERE c.dscName = :name ")
				.setParameter("name", obj.getNome())
				.getResultList();
			}else {
				lista = em.createQuery("SELECT c FROM Usuario c ").getResultList();
			}
			em.getTransaction().commit();
			return lista;
		} catch (Exception e) 
		{
			System.err.println("erro" + e.getMessage());
		} finally 
		{
			em.close();
		}
		return null;
	}
}
