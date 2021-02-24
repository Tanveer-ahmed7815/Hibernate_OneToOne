package com.testyantra.employeedto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="employeeOtherInfo")
public class EmployeeOtherInfo {
	@Id
	@Column(name="id")
	private int employeeOtherId;
	@Column(name="aadhaar")
	private String aadhaarCard;
	@Column(name="pan")
	private String panCard;
	
	public EmployeeOtherInfo(int employeeOtherId, String aadhaarCard, String panCard) {
		this.employeeOtherId = employeeOtherId;
		this.aadhaarCard = aadhaarCard;
		this.panCard = panCard;
	}
	
	public EmployeeOtherInfo() {
		
	}

	public int getEmployeeOtherId() {
		return employeeOtherId;
	}

	public void setEmployeeOtherId(int employeeOtherId) {
		this.employeeOtherId = employeeOtherId;
	}

	public String getAadhaarCard() {
		return aadhaarCard;
	}

	public void setAadhaarCard(String aadhaarCard) {
		this.aadhaarCard = aadhaarCard;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	@Override
	public String toString() {
		return "EmployeeOtherInfo [employeeOtherId=" + employeeOtherId + ", aadhaarCard=" + aadhaarCard + ", panCard="
				+ panCard + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aadhaarCard == null) ? 0 : aadhaarCard.hashCode());
		result = prime * result + employeeOtherId;
		result = prime * result + ((panCard == null) ? 0 : panCard.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeOtherInfo other = (EmployeeOtherInfo) obj;
		if (aadhaarCard == null) {
			if (other.aadhaarCard != null)
				return false;
		} else if (!aadhaarCard.equals(other.aadhaarCard))
			return false;
		if (employeeOtherId != other.employeeOtherId)
			return false;
		if (panCard == null) {
			if (other.panCard != null)
				return false;
		} else if (!panCard.equals(other.panCard))
			return false;
		return true;
	}
	
	
	
}
