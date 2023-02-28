package one_to_one.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

@Entity
public class Student implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 30, nullable = false)
	private String name;
	@Column(length = 30, nullable = false)
	private String surname;
	private Gender gender;
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	@OneToOne
	private StudentCard studentCard;
	
	
	public Student() {}

	public Student(String name, String surname, Gender gender, Date birthDate) {
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.birthDate = birthDate;
	}

	public StudentCard getStudentCard() {
		return studentCard;
	}

	public void setStudentCard(StudentCard studentCard) {
		this.studentCard = studentCard;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + ", gender=" + gender + ", birthDate="
				+ birthDate + ", studentCard=" + studentCard + "]";
	}
	
}
