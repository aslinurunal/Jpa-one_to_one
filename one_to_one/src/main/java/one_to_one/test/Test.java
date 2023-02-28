package one_to_one.test;

import java.util.Date;

import javax.persistence.*;

import one_to_one.model.Gender;
import one_to_one.model.Student;
import one_to_one.model.StudentCard;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager manager = factory.createEntityManager();
		
		@SuppressWarnings("deprecation")
		Student student = new Student("Chandler", "Bing", Gender.MALE, new Date(100,02,01));
		
		StudentCard studentCard = new StudentCard("A123456789", new Date(122,01,01));
		
		student.setStudentCard(studentCard);
		
		
		manager.getTransaction().begin();
		
		//manager.persist(studentCard);
		manager.persist(student);
		
		manager.getTransaction().commit();
		
		System.out.println(student);

	}

}
