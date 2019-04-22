package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.FormData;

final class FormDataMapper implements RowMapper<FormData> {

	@Override
	public FormData mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		FormData form = new FormData(); 
		form.setId(rs.getInt("id"));
		form.setUserId(rs.getInt("userId"));
		form.setAnswerQuestion1(rs.getInt("answerQuestion1"));
		form.setAnswerQuestion2(rs.getInt("answerQuestion2"));
		form.setAnswerQuestion3(rs.getString("answerQuestion3"));
		form.setAnswerQuestion4(rs.getString("answerQuestion4"));
		return form; 
	}
}
