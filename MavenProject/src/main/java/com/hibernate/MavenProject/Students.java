package com.hibernate.MavenProject;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Students {

	@Id
	private int id;
	private String name;
	private String branch;
	public Students(int id, String name, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Students() {
		super();
	}
	
	
}
