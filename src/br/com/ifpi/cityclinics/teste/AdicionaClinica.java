package br.com.ifpi.cityclinics.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.ifpi.cityclinics.model.clinica;

public class AdicionaClinica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clinica clinica	= new clinica();
		clinica.setAberto(true);
		clinica.setEndereco("R. Dep. José Lourenço Mourão, 372, Pedro II - PI, 64255-000");
		clinica.setHorarioFuncionamento("Abre às 07:00");
		
		clinica.setImagem("c:/home/ifpi/Downloads/dfaef672-bcab-4409-87ca-d11b0d186fdf.jpeg");
		clinica.setNome("Ultra Imagem");
		clinica.setTelefone("(86) 99817-6120");
		clinica.setDataDeCadastro(Calendar.getInstance());
		
		clinica.setAberto(false);
		clinica.setEndereco(" Rua Paissandú, 1862, 64001-120 Teresina, PI, Brazil ");
		clinica.setHorarioFuncionamento("Abre às 06:00");
		
		clinica.setImagem("c:/home/ifpi/Downloads/med-imagem.jpeg");
		clinica.setNome("Med Imagem");
		clinica.setTelefone("(86) 3131-1234");
		clinica.setDataDeCadastro(Calendar.getInstance());
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cityclinics_pu");
		EntityManager Manager = factory.createEntityManager();
		
		Manager.getTransaction().begin();
		Manager.persist(clinica);
		Manager.getTransaction().commit();
		
		System.out.println("Clinica Cadastrada com Nome:" + clinica.getNome());
		
		Manager.close();
		factory.close();
	}

}