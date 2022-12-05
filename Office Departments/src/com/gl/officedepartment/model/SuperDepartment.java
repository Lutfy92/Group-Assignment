package com.gl.officedepartment.model;

public class SuperDepartment {

	String departmentName = "Super Department";
	String getTodaysWork = " No Work as of now";
	String getWorkDeadline = "Nil";
	String isTodayAHoliday = " Today is not a holiday";
	
	public String getDepartmentName() {
		return departmentName;
	}
	public String getGetTodaysWork() {
		return getTodaysWork;
	}
	public String getGetWorkDeadline() {
		return getWorkDeadline;
	}
	public String getIsTodayAHoliday() {
		return isTodayAHoliday;
	}
}
