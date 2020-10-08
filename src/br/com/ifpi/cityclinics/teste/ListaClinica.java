package br.com.ifpi.cityclinics.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.ifpi.cityclinics.model.clinica;

public class ListaClinica {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cityclinics_pu");
		EntityManager manager = factory.createEntityManager();
		// usando JPQL
		List <clinica> Lista = manager.createQuery("from clinica").getResultList();
		System.out.println("Clínicas Cadastradas:");
		for (clinica clinica : Lista) {
			System.out.println("Nome da Clinica:"+ clinica.getNome());
			System.out.println("Aberto:"+ clinica.isAberto());
		}
		manager.close();
		factory.close(); 
	}

}