package com.gl.officedepartment.model;

public class TechDepartment extends SuperDepartment {
	
	String departmentName = "Tech Department";
	String getTodaysWork = "Complete coding of module 1";
	String getWorkDeadline = "Complete by EOD";
	String getTechStackInformation = "core Java";
	
	public String getDepartmentName() {
		return departmentName;
	}
	public String getGetTodaysWork() {
		return getTodaysWork;
	}
	public String getGetWorkDeadline() {
		return getWorkDeadline;
	}
	public String getGetTechStackInformation() {
		return getTechStackInformation;
	}
	
	
	
	

}
