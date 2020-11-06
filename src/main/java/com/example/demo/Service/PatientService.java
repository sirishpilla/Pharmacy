package com.example.demo.Service;


import java.util.List;

import com.example.demo.Model.*;
public interface PatientService {
	 public List<pri_phy_patient> getAllPatients();
	 
	 public pri_phy_patient findPatientById(String ssn);
	 
	 public void addPatient(pri_phy_patient patient);
	 
	 public void updatePatient(pri_phy_patient patient);
	 
	 public void deletePatient(String ssn);

}
