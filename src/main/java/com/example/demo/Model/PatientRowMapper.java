package com.example.demo.Model;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class PatientRowMapper implements RowMapper<pri_phy_patient> {

	@Override
	 public pri_phy_patient mapRow(ResultSet rs, int rowNum) throws SQLException {
	  pri_phy_patient patient = new pri_phy_patient();
	  patient.setSsn(rs.getString("ssn")); //employee_id near patient_ssn
	  patient.setName(rs.getString("name"));//first_name near patient_name
	  patient.setAddress(rs.getString("address"));//last_name near patient_address
	  patient.setBirth_date((rs.getDate("birth_date")));
	//  employee.setPhone(rs.getString("phone"));
	//  employee.setJobTitle(rs.getString("job_title"));
	  return patient;
	 }

	}

