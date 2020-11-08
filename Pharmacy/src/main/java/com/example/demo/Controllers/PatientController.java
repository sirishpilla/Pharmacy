package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Model.pri_phy_patient;
import com.example.demo.Service.PatientServiceImpl;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	private PatientServiceImpl patientservice;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)

	public ModelAndView getAllEmployees() {
		ModelAndView model = new ModelAndView();
		List<pri_phy_patient> list = patientservice.getAllPatients();

		model.addObject("patient_list", list);
		model.setViewName("patient_list");
		return model;
	}

	@RequestMapping(value = "/update/{ssn}", method = RequestMethod.GET)
	public ModelAndView editPatient(@PathVariable String ssn) {
		ModelAndView model = new ModelAndView();

		pri_phy_patient patient = patientservice.findPatientById(ssn);
		model.addObject("patientForm", patient);

		model.setViewName("patient_form");
		return model;
	}

	@RequestMapping(value = "/add"/* ,method = RequestMethod.GET */)
	public ModelAndView addPatient() {
		ModelAndView model = new ModelAndView();

		pri_phy_patient patient = new pri_phy_patient();
		model.addObject("patientForm", patient);

		model.setViewName("patient_form");
		return model;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveOrUpdate(@ModelAttribute("patientForm") pri_phy_patient patient) {
		/*if (patient.getSsn() != null) {
			patientservice.updatePatient(patient);
		} else {*/
			patientservice.addPatient(patient);
		

		return new ModelAndView("redirect:/patient/list");
	}

	@RequestMapping(value = "/delete/{ssn}", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(@PathVariable("ssn") String ssn) {
		patientservice.deletePatient(ssn);

		return new ModelAndView("redirect:/patient/list");
	}
}