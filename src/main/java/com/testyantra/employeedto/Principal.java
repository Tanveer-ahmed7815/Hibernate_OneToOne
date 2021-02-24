package com.testyantra.employeedto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="principal")
public class Principal {
	@Id
	@Column(name="principal_id")
	private int principalId;
	@Column(name="principal_name")
	private String principalName;
	
	public Principal(int principalId, String principalName) {
		this.principalId = principalId;
		this.principalName = principalName;
	}
	public Principal() {
		
	}
	public int getPrincipalId() {
		return principalId;
	}
	public void setPrincipalId(int principalId) {
		this.principalId = principalId;
	}
	public String getPrincipalName() {
		return principalName;
	}
	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}
	@Override
	public String toString() {
		return "Principal [principalId=" + principalId + ", principalName=" + principalName + "]";
	}
	
	
}
