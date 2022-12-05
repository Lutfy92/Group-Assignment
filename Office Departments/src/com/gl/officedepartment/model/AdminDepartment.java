package com.gl.officedepartment.model;

public class AdminDepartment extends SuperDepartment {
	
	String departmentName = " Admin Department";
	String getTodaysWork = "Complete your documents Submission";
	String getWorkDeadline = "Complete by EOD";
	
	public String getDepartmentName() {
		return departmentName;
	}
	public String getGetTodaysWork() {
		return getTodaysWork;
	}
	public String getGetWorkDeadline() {
		return getWorkDeadline;
	}
}
