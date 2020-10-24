package carros;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import carros.Modelo;
import carros.Automovel;
import carros.Marca;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("carros");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		DateFormat df = new SimpleDateFormat("dd-mm-yyyy");
		Marca ma1 = new Marca((Integer) null, "Uno");
		Marca ma2 = new Marca((Integer) null, "Marea");
		Marca ma3 = new Marca((Integer) null, "Argo");
		
		Modelo m1 = new Modelo((Integer) null, "Fire", 220 ,ma1);
		Modelo m2 = new Modelo((Integer) null, "Fire", 100, ma2);
		Modelo m3 = new Modelo((Integer) null, "HGT ", 220, ma3);
		
		Automovel a1 = new Automovel(null, 2018,2020, "Bom Carro1", 14000,1000, m1 );
		Automovel a2 = new Automovel(null, 2017,2020, "Bonito", 14000,2000, m2 );
		Automovel a3 = new Automovel(null, 2021,2020, "Economico", 14000,3000, m3 );
		
		
		
				
		em.persist(ma1);
		em.persist(ma2);
		em.persist(ma3);
		em.persist(m1);
		em.persist(m2);
		em.persist(m3);
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		
		em.getTransaction().commit();
	

	}

}
