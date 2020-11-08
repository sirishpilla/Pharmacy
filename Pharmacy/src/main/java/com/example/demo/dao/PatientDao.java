package com.example.demo.dao;
 
import com.example.demo.Model.*;

import java.util.List;

public interface PatientDao {
	

 
 public List<pri_phy_patient> getAllPatients();
 
// public pri_phy_patient findPatientById(String ssn);
 
 public void addPatient(pri_phy_patient patient);
 
 public void updatePatient(pri_phy_patient patient);

pri_phy_patient findPatientById(String ssn);

void deletePatient(String ssn);
 
// public void deletePatient(String ssn);

}
