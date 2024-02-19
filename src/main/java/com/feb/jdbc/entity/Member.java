package com.feb.jdbc.entity;

import org.apache.ibatis.type.Alias;

@Alias("Member")
public class Member {
	String memberId;
	String passwd;
	String email;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", passwd=" + passwd + ", email=" + email + "]";
	}
}
