package com.personsdataapp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User1")
public class User1 {
	@Id
	int userId;
	String userName;
	String userMailId;
	String userMobile;
	public User1() {
		super();
	}
	public User1(int userId, String userName, String userMailId, String userMobile) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMailId = userMailId;
		this.userMobile = userMobile;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMailId() {
		return userMailId;
	}
	public void setUserMailId(String userMailId) {
		this.userMailId = userMailId;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	@Override
	public String toString() {
		return "User1 [userId=" + userId + ", userName=" + userName + ", UserMailId=" + userMailId + ", userMobile="
				+ userMobile + "]";
	}
	
	
	
}
