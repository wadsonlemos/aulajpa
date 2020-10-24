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

import carros.Modelo;


public class Modelo implements Serializable{
	private static final long serialVersionUID = 1L;
	

		@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "marca_id")
	private Integer id;
	
		private String descricao;
		private Integer potencia;
		 
		public Modelo() {
			
			
		}
		
		public Modelo(int id, String descricao, Integer potencia, Marca marca) {
			this.id = id;
			this.descricao = descricao;
			this.potencia = potencia;
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

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public Integer getPotencia() {
			return potencia;
		}

		public void setPotencia(Integer potencia) {
			this.potencia = potencia;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}


	 
	
	
	

	
	
}


