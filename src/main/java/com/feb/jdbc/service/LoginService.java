package com.feb.jdbc.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.feb.jdbc.dao.LoginDao;
import com.feb.jdbc.entity.Member;

@Service
public class LoginService {

	@Autowired
	private LoginDao loginDao;
	
	public boolean login(HashMap<String, String> params) {
		String memberId = params.get("memberId");
		Member member = loginDao.login(memberId);
		if(ObjectUtils.isEmpty(member)) {
			return false;
		}
		return true;
	}
	
	public int join(HashMap<String, String> params) {
		return loginDao.join(params);
	}
}
