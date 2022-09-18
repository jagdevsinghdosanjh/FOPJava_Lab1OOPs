package com.gl.emailapp.main;
/**
 * @author jagdevsingh
 *
 */
import java.util.Scanner;

import com.gl.emailapp.model.Employee;
import com.gl.emailapp.service.CredentialService;
import com.gl.emailapp.service.CredentialServiceImpl;

public class DriverClass {
	public static String[] depts= {"Technical", "Admin","Human Resource","Legal"};
	public static String[] deptsabbr= {"tech","admin","hr","lg"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CredentialService service=new CredentialServiceImpl("greatlearning.in");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter First Name:");
		String fName=input.next();
		System.out.println("Enter Last Name:");
		String lName=input.next();
		Employee emp=new Employee(fName,lName);
		System.out.println("Please Enter the Department from the following:");
		for(int j=1;j<=depts.length;j++)
		System.out.println(j+". "+depts[j-1]);
		int deptNumber=input.nextInt();
		String emailId=service.generateEmailId(fName,lName,deptsabbr[deptNumber-1]);
		emp.setEmailId(emailId);
		String password=service.generatePassword();
		emp.setPassword(password);
		service.displayCredentials(emp);
		input.close();


	}

}
