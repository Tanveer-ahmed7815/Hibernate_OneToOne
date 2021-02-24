package com.testyantra.employeedto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Table(name="school")
public class School {
	@Id
	@Column(name="school_code")
	private int schoolCode;
	@Column(name="school_name")
	private String schoolName;
	
	@OneToOne
	@JoinColumn(name="principal_id",referencedColumnName="principal_id")
	private Principal principal;

	public School(int schoolCode, String schoolName, Principal principal) {
		this.schoolCode = schoolCode;
		this.schoolName = schoolName;
		this.principal = principal;
	}

	public School() {
		
	}

	public int getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(int schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Principal getPrincipal() {
		return principal;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	@Override
	public String toString() {
		return "School [schoolCode=" + schoolCode + ", schoolName=" + schoolName + ", principal=" + principal + "]";
	}
	
	
}
