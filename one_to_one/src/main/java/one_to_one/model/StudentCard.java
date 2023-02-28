package one_to_one.model;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

@Entity
public class StudentCard implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(length = 10, nullable = false, unique = true)
	private String serialNum;
	@Temporal(TemporalType.DATE)
	private Date issueDate;
	
	@OneToOne(mappedBy="studentCard")
	private Student student;
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public StudentCard() {}

	public StudentCard(String serialNum, Date issueDate) {
		this.serialNum = serialNum;
		this.issueDate = issueDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	@Override
	public String toString() {
		return "StudentCard [id=" + id + ", serialNum=" + serialNum + ", issueDate=" + issueDate + "]";
	}
	
	
}
