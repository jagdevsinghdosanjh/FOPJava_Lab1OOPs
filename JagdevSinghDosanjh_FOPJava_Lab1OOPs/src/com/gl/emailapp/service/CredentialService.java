package com.gl.emailapp.service;
/**
 * @author jagdevsingh
 *
 */
import com.gl.emailapp.model.Employee;
public interface CredentialService {
	public String generateEmailId(String fName, String lName, String dept);
	public String generatePassword();
	void displayCredentials(Employee emp);

}