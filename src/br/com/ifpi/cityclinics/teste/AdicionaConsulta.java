package br.com.ifpi.cityclinics.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.ifpi.cityclinics.model.consulta;

public class AdicionaConsulta {

	public static void main(String[] args) {
		consulta consulta = new consulta();
		consulta.setDadosClinicos("Dados Clinicos");
		consulta.setFinalizada(false);
		consulta.setDataConsulta(Calendar.getInstance());
		consulta.setImagem("c:/imagens/foto1.png");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cityclinics_pu");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(consulta);
		manager.getTransaction().commit();
		
		//Id de consulta:
		System.out.println("Consulta Realizada com id: " + consulta.getId());
		
		manager.close();
		factory.close();

	}

}