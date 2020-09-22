package co.sz.swazibank.studentThymeleafApp;





import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="student")
public class Student {
	
   

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="student_status")
	private Boolean studentStatus;
	
	
	@Column(name="date_created")
	@CreationTimestamp
	@JsonFormat(pattern = "yyyy-MM-dd ")
    private LocalDateTime dateCreated;
	
	@Column(name="student_gpa")
	private double studentGpa;

	public Student() {
		
	}
	public Student(String lastName, String firstName, Boolean studentStatus, LocalDateTime dateCreated, double studentGpa) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.studentStatus = studentStatus;
		this.dateCreated = dateCreated;
		this.studentGpa = studentGpa;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public Boolean getStudentStatus() {
		return studentStatus;
	}


	public void setStudentStatus(Boolean studentStatus) {
		this.studentStatus = studentStatus;
	}


	public LocalDateTime getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}


	public double getStudentGpa() {
		return studentGpa;
	}


	public void setStudentGpa(double studentGpa) {
		this.studentGpa = studentGpa;
	}


	@Override
	public String toString() {
		return "Student [lastName=" + lastName + ", firstName=" + firstName + ", studentStatus=" + studentStatus
				+ ", dateCreated=" + dateCreated + ", studentGpa=" + studentGpa + "]";
	}

}
