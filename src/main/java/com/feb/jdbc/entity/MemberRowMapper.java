package com.feb.jdbc.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.SingleColumnRowMapper;

public class MemberRowMapper extends SingleColumnRowMapper<Member> {
	
	public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
		Member member = new Member();
		member.setMemberId(rs.getString("member_id"));
		member.setPasswd(rs.getString("passwd"));
		member.setEmail(rs.getString("email"));
		return member;
	}
}