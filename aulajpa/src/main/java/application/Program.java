package application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import aulajpa.Aluno;
import aulajpa.Curso;

public class Program {

	public static void main(String[] args) throws ParseException {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulajpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		DateFormat df = new SimpleDateFormat("dd-mm-yyyy");
		Aluno a1 = new Aluno(null, "Dory", "Masculino", df.parse("31-03-1976"));
		Aluno a2 = new Aluno(null, "Caroline", "Feminino", df.parse("24-04-1978"));
		Aluno a3 = new Aluno(null, "Isabelle", "Feminino", df.parse("21-10-2010"));
		Aluno a4 = new Aluno(null, "Ana Laura", "Feminino", df.parse("15-12-2000"));

		Curso c1 = new Curso(null, "Programação Orientada a Objeto I");
		Curso c2 = new Curso(null, "Banco de dados I");
		Curso c3 = new Curso(null, "Esrutura de dados I");
		
		c1.addAluno(a1);
		c1.addAluno(a2);
		
		c2.addAluno(a3);
		c2.addAluno(a4);
		
		c3.addAluno(a1);
		c3.addAluno(a4);

		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.persist(a4);
		
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		
		em.getTransaction().commit();
		
		Query query1 = em.createQuery("SELECT c FROM Curso c");
		List<Curso> cursos = query1.getResultList();
		for (Curso c : cursos) {
			System.out.println("\n*** " + c.getNomecurso() + " ***");
			for (Aluno a : c.getAlunos())
				System.out.println("Aluno: " + a.getNome());
		}
		
		Query query2 = em.createQuery("SELECT a FROM Aluno a");
		List<Aluno> alunos = query2.getResultList();
		for (Aluno a : alunos) {
			System.out.println("\n*** " + a.getNome() + " ***");
			for (Curso c : a.getCursos())
				System.out.println("Curso: " + c.getNomecurso());
		}
		
		Curso c = em.find(Curso.class, 2);
		System.out.println("\n*** Curso: " + c.getIdcurso() 
						   + " | " + c.getNomecurso() + " ***");
		for (Aluno a : c.getAlunos())
			System.out.println("Aluno: " + a.getNome());
		
		em.close();
		emf.close();
	}
}
