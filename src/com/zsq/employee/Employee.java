package com.zsq.employee;

public class Employee {
	private Integer empno;
	private String ename;
	private String department;
	private String job;
	private float salary;
	public Employee(Integer empno, String ename, String department, String job, float salary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.department = department;
		this.job = job;
		this.salary = salary;
	}
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getdepartment() {
		return department;
	}
	public void setdepartment(String department) {
		this.department = department;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
}
