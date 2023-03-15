package br.com.fiap.checkpoint1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Empregado {
	
	@Id
	long codigoEmpregado;
	String nome;
	String endereco;
	
	public long getCodigoEmpregado() {
		return codigoEmpregado;
	}
	public void setCodigoEmpregado(long codigoEmpregado) {
		this.codigoEmpregado = codigoEmpregado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

}
