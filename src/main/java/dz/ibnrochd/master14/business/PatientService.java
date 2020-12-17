package dz.ibnrochd.master14.business;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.model.Patient;

	@Service
	@Transactional
	public class PatientService {
	 
	    @Autowired
	    private IPatientService iPatientService;
	     
	    public List<Patient> listAll() {
	        return iPatientService.findAll();
	    }
	     
	    public void save(Patient patient) {
	    	iPatientService.save(patient);
	    }
	     
	    public Patient get(int id) {
	        return iPatientService.findById((int) id).get();
	    }
	     
	    public void delete(int id) {
	    	iPatientService.deleteById((int) id);
}
}