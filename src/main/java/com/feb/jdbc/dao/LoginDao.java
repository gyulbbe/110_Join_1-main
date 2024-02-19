package com.feb.jdbc.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.feb.jdbc.entity.Member;

@Repository
public interface LoginDao {
	
	public Member login(String memberId);
	
	public int join(HashMap<String, String> params);
}
