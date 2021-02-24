package com.testyantra.employeedto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="laptop")
public class LaptopInfo {
	@Id
	@Column(name="lid")
	private int laptopId;
	@Column(name="lname")
	private String laptopName;
	
	public LaptopInfo(int laptopId, String laptopName) {
		this.laptopId = laptopId;
		this.laptopName = laptopName;
	}
	
	public LaptopInfo() {
		
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	@Override
	public String toString() {
		return "LaptopInfo [laptopId=" + laptopId + ", laptopName=" + laptopName + "]";
	}
	
	
	
	
}
