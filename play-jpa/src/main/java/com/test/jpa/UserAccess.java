package com.test.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the UserAccess database table.
 * 
 */
@Entity
@Table(name="UserAccess")
@NamedQuery(name="UserAccess.findAll", query="SELECT u FROM UserAccess u")
public class UserAccess implements Serializable {
	private static final long serialVersionUID = 1L;
	private String userID;
	private String userName;
	private String userPassword;
	private String userRole;

	public UserAccess() {
	}


	@Column(name="UserID", nullable=false, length=10)
	public String getUserID() {
		return this.userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}


	@Column(name="UserName", nullable=false, length=30)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	@Column(name="UserPassword", nullable=false, length=30)
	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	@Column(name="UserRole", nullable=false, length=20)
	public String getUserRole() {
		return this.userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

}