package com.gl.officedepartment.main;

import com.gl.officedepartment.model.AdminDepartment;
import com.gl.officedepartment.model.HrDepartment;
import com.gl.officedepartment.model.SuperDepartment;
import com.gl.officedepartment.model.TechDepartment;

public class Main {

	public static void main(String[] args) {
		
		SuperDepartment adminDept = new AdminDepartment();
			
			System.out.println("Welcome to " + adminDept.getDepartmentName());
			System.out.println(adminDept.getGetTodaysWork());
			System.out.println(adminDept.getGetWorkDeadline());
			System.out.println(adminDept.getIsTodayAHoliday());
			
			System.out.println("------------------------------------------------------------");
			
		HrDepartment hrDept = new HrDepartment();
		
			System.out.println("Welcome to " + hrDept.getDepartmentName());
			System.out.println(hrDept.getDoActivity());
			System.out.println(hrDept.getGetTodaysWork());
			System.out.println(hrDept.getGetWorkDeadline());
			System.out.println(hrDept.getIsTodayAHoliday());
			
			System.out.println("-------------------------------------------------------------");
			
		TechDepartment techDept = new TechDepartment();
		
			System.out.println("Welcome to " + techDept.getDepartmentName());
			System.out.println(techDept.getGetTodaysWork());
			System.out.println(techDept.getGetWorkDeadline());
			System.out.println(techDept.getGetTechStackInformation());
			System.out.println(techDept.getIsTodayAHoliday());
			
			
			
			

	}

}
