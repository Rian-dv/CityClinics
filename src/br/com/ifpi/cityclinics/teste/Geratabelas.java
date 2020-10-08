package br.com.ifpi.cityclinics.teste;

import javax.persistence.Persistence;

public class Geratabelas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence.createEntityManagerFactory("cityclinics_pu");
	}

}