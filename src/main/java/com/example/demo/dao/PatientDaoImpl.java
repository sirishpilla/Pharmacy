package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.Model.*;

@Transactional
@Repository
public class PatientDaoImpl implements PatientDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<pri_phy_patient> getAllPatients() {
		String query = "SELECT * from pri_phy_patient";
		RowMapper<pri_phy_patient> rowMapper = new PatientRowMapper();
		List<pri_phy_patient> list = jdbcTemplate.query(query, rowMapper);

		return list;
	}
	// @Override
	/*
	 * public pri_phy_patient findPatientById(String ssn) { String query =
	 * "SELECT * FROM pri_phy_patient WHERE ssn = ?"; RowMapper<pri_phy_patient>
	 * rowMapper = new
	 * BeanPropertyRowMapper<pri_phy_patient>(pri_phy_patient.class);
	 * pri_phy_patient patient = jdbcTemplate.queryForObject(query, rowMapper, ssn);
	 * 
	 * return patient; }
	 */

	@Override
	public void addPatient(pri_phy_patient patient) {
		// TODO Auto-generated method stub
		// String query = "INSERT INTO pri_phy_patient(patient_ssn, patient_name,
		// patient_age,patient_address) VALUES(?, ?, ?, ?)";
		String query = "INSERT INTO pri_phy_patient(ssn,name, birth_date,address,phy_ssn) VALUES(?, ?, ?, ?,?)";
		jdbcTemplate.update(query, patient.getSsn(), patient.getName(), patient.getBirth_date(), patient.getAddress(),
				patient.getPhy_ssn());

	}

	@Override
	public void updatePatient(pri_phy_patient patient) {
		// TODO Auto-generated method stub
		String query = "UPDATE pri_phy_patient SET name=?, age=?, address=?, WHERE ssn=?";
		jdbcTemplate.update(query, patient.getName(), patient.getBirth_date(), patient.getAddress(), patient.getSsn());

	}

	@Override

	public pri_phy_patient findPatientById(String ssn) {
		String query = "SELECT * FROM pri_phy_patient WHERE ssn = ?";
		RowMapper<pri_phy_patient> rowMapper = new BeanPropertyRowMapper<pri_phy_patient>(pri_phy_patient.class);
		pri_phy_patient patient = jdbcTemplate.queryForObject(query, rowMapper, ssn);

		return patient;
	}

	@Override

	public void deletePatient(String ssn) {
		// TODO Auto-generated method stub
		String query = "DELETE FROM pri_phy_patient WHERE ssn=?";
		jdbcTemplate.update(query, ssn);

	}

	/*
	 * @Override public void deletePatient(String ssn) { // TODO Auto-generated
	 * method stub String query = "DELETE FROM pri_phy_patient WHERE ssn=?";
	 * jdbcTemplate.update(query, ssn);
	 * 
	 * }
	 */

}
