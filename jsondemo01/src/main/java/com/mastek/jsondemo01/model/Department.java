package com.mastek.jsondemo01.model;

import java.io.Serializable;

public class Department implements Serializable {

	private static final long serialVersionUID = 2777482149324490730L;
	int deptid;
	String deptname;

	public Department() {

	}

	public Department(int deptid, String deptname) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

}
