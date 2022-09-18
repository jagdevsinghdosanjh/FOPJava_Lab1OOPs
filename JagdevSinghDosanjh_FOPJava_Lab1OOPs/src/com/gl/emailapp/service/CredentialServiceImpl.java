package com.gl.emailapp.service;
/**
 * @author jagdevsingh
 *
 */
import java.util.Random;

import com.gl.emailapp.model.Employee;

public class CredentialServiceImpl implements CredentialService {
private String domain;

public CredentialServiceImpl(String domain) {
	super();
	this.domain = domain;
}

@Override
public String generateEmailId(String fName, String lName, String dept) {
	// TODO Auto-generated method stub
	return fName+lName+"@"+dept+"."+domain;
}

@Override

public String generatePassword() {
	// TODO Auto-generated method stub
	Random rand=new Random();
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<8;i++)
	{
		int n=rand.nextInt(127-32)+32;
		sb.append((char)n);
	}
		return sb.toString();
}

public void displayCredentials(Employee emp) {
	// TODO Auto-generated method stub
	System.out.println("Welcome to Great Learning!!! "+emp.getFirstName());
	System.out.println("Your Credentials are:");
	System.out.println("Email Id:"+emp.getEmailId());
	System.out.println("Password:"+emp.getPassword());
}
}