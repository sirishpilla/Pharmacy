package com.example.demo.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.pri_phy_patient;
import com.example.demo.dao.PatientDaoImpl;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientDaoImpl patientDao;

	@Override
	public List<pri_phy_patient> getAllPatients() {
		// TODO Auto-generated method stub
		return patientDao.getAllPatients();
	}

	@Override
	public pri_phy_patient findPatientById(String ssn) {
		// TODO Auto-generated method stub
		
		return patientDao.findPatientById(ssn);
	}

	@Override
	public void addPatient(pri_phy_patient patient) {
		// TODO Auto-generated method stub
		patientDao.addPatient(patient);
	}

	@Override
	public void updatePatient(pri_phy_patient patient) {
		// TODO Auto-generated method stub
		patientDao.updatePatient(patient);
	}

	@Override
	public void deletePatient(String ssn) {
		// TODO Auto-generated method stub
		patientDao.deletePatient(ssn);
		
	}

}
