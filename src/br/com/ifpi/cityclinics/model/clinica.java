package br.com.ifpi.cityclinics.model;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// import javax.persistence.Temporal;
// import javax.persistence.TemporalType;

@Entity
public class clinica {
	
	private String  HorarioFuncionamento;
	private Calendar DataDeCadastro;
	
	public Calendar getDataDeCadastro() {
		return DataDeCadastro;
	}

	public void setDataDeCadastro(Calendar dataDeCadastro) {
		DataDeCadastro = dataDeCadastro;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String nome;
	private String telefone;
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	private String imagemClinica;
	private String endereco;
	private boolean aberto;

	//Getters & Setters
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getImagem() {
		return imagemClinica;
	}

	public void setImagem(String imagem) {
		this.imagemClinica = imagem;
	}

	public String getHorarioFuncionamento() {
		return HorarioFuncionamento;
	}

	public void setHorarioFuncionamento(String horarioFuncionamento) {
		HorarioFuncionamento = horarioFuncionamento;
	}
	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}


}
