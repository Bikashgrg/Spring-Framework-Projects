package com.bikash.bean;

public class Employee {
	int empid;
	String ename;
	Address address;
	
	public Employee() {}
	
	// constructor injection
	public Employee(Address address) {
		this.address = address;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddress() {
		return address;
	}
	
	// Setter injection
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", address=" + address + "]";
	}

	public void setInit() {
		System.out.println("--Object created--");
	}
	public void setDestroy() {
		System.out.println("--Object destroyed--");
	}
	
}
