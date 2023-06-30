package com.demospring.SpringbootmysqlEx.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String studentname;
	private String studentemail;
	private String studentaddress;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentemail() {
		return studentemail;
	}
	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}
	public String getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}
	public Student(long id, String studentname, String studentemail, String studentaddress) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.studentemail = studentemail;
		this.studentaddress = studentaddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString()
	{
		return "Student [id=" + id + ", studentname=" + studentname + ", studentemail=" + studentemail
				+ ", studentaddress=" + studentaddress + "]";
	}
	
	

}
