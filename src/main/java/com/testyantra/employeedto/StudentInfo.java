package com.testyantra.employeedto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentInfo {
	@Id
	@Column(name="sid")
	private int studentId;
	@Column(name="name")
	private String studentName;
	
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)//automatically persists the referenced class i.e laptop
	@JoinColumn(name="lid",referencedColumnName="lid")
	private LaptopInfo laptopInfo;
	
	public StudentInfo(int studentId, String studentName, LaptopInfo laptopInfo) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		this.laptopInfo = laptopInfo;
	}
	
	public StudentInfo() {
		
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	

	public LaptopInfo getLaptopInfo() {
		return laptopInfo;
	}

	public void setLaptopInfo(LaptopInfo laptopInfo) {
		this.laptopInfo = laptopInfo;
	}

	@Override
	public String toString() {
		return "StudentInfo [studentId=" + studentId + ", studentName=" + studentName + ", laptopInfo=" + laptopInfo
				+ "]";
	}

	
	
	
	
	
}
