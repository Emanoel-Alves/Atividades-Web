package br.com.ufc.web.backendatividade05.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="carros")
public class Carro {
	
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String marca;
	private String anoFabricacao;
	private String anoModelo;
	private String dataVenda;
	
	
	public Carro() {
		super();
	}

	public Carro(int id, String nome, String marca, String anoFabricacao, String anoModelo, String dataVenda) {
		super();
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.dataVenda = dataVenda;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}

	@Override
	public String toString() {
		return "Carro [id=" + id + ", nome=" + nome + ", marca=" + marca + ", anoFabricacao=" + anoFabricacao
				+ ", anoModelo=" + anoModelo + ", dataVenda=" + dataVenda + "]";
	}
	
	
}
