package com.gl.officedepartment.model;

public class HrDepartment extends SuperDepartment {
	
	String departmentName = " Hr Department";
	String getTodaysWork = "Fill today's timesheet and mark your attendance";
	String getWorkDeadline = "Complete by EOD";
	String doActivity = "team Lunch";
	
	public String getDepartmentName() {
		return departmentName;
	}
	public String getGetTodaysWork() {
		return getTodaysWork;
	}
	public String getGetWorkDeadline() {
		return getWorkDeadline;
	}
	public String getDoActivity() {
		return doActivity;
	}
}
