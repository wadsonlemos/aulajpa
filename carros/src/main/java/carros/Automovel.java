package carros;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import carros.Automovel;

@Entity
public class Automovel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "modelo_id")
	private Integer id;
	
	private Integer anoFabricacao;
	private Integer anoModelo;
	private String observacoes;
	private float preco;
	private Integer kilomeragem;
	
	public Automovel() {
		
		
		
	}
	public Automovel(Integer id, Integer anoFabricacao, Integer anoModelo, String observacoes, float preco, Integer kilomeragem, Modelo modelo) {
		this.id = id;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoFabricacao;
		this.observacoes = observacoes;

	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public Integer getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public Integer getKilomeragem() {
		return kilomeragem;
	}
	public void setKilomeragem(Integer kilomeragem) {
		this.kilomeragem = kilomeragem;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
