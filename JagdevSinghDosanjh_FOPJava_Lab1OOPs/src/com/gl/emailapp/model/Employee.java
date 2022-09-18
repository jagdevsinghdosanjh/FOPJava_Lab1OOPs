package com.gl.emailapp.model;
/**
 * @author jagdevsingh
 *
 */
public class Employee {
/**
	 * @param firstName
	 * @param lastName
*/
private String firstName, lastName, dept, emailId, password;
public Employee(String firstName, String lastName){
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
/**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}
/**
 * @param firstName the firstName to set
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
/**
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}
/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}
/**
 * @return the dept
 */
public String getDept() {
	return dept;
}
/**
 * @param dept the dept to set
 */
public void setDept(String dept) {
	this.dept = dept;
}
/**
 * @return the emailId
 */
public String getEmailId() {
	return emailId;
}
/**
 * @param emailId the emailId to set
 */
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}

}