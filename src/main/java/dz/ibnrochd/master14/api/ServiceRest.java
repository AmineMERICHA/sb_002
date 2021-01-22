package dz.ibnrochd.master14.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dz.ibnrochd.master14.business.PatientService;
import dz.ibnrochd.master14.business.TraitementService;
import dz.ibnrochd.master14.model.Patient;
import dz.ibnrochd.master14.model.Traitement;

@RestController
public class ServiceRest {
	@Autowired
	private PatientService patientService;
	
	@Autowired
	private TraitementService traitementService;

	public PatientService getPatientService() {
		return patientService;
	}

	public void setPatientService(PatientService patientService) {
		this.patientService = patientService;
	}

	public TraitementService getTraitementService() {
		return traitementService;
	}

	public void setTraitementService(TraitementService traitementService) {
		this.traitementService = traitementService;
	}


	
	@GetMapping(value = "/patient/api")
    public List<Patient> getAllPatient() {
    return patientService.listAll() ;
	}
	
	@GetMapping(value = "/traitement/api")
    public List<Traitement> getAlltraitement() {
    return traitementService.listAll() ;
	}
	
	@PostMapping("/addpatient/api")
	public void add(@RequestBody Patient patient) {
		patientService.save(patient);
	}
	
	//@PutMapping("/patients/api/{id}")
	//public ResponseEntity<?> update(@RequestBody Patient patient, @PathVariable Integer id) {
	 //try {
	   //     Patient existPatient = patientService.get(id);
	     //   patientService.save(patient);
	       // return new ResponseEntity<>(HttpStatus.OK);
	    //} catch (NoSuchElementException e) {
	    //    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    //}      
	    
	//@DeleteMapping("/patients/api/{id}")
	//public void delete (@PathVariable Integer id) {
	//	 patientService.delete(id);
	  //  }
	
	@RequestMapping(value = "/patients/api/{id}", method = RequestMethod.DELETE)
    public void delete() {
	}
	
	
	@RequestMapping(value = "/patients/api/{id}", method = RequestMethod.PUT)
	    public void updateById(@PathVariable("id") Long id, @RequestBody Patient patient) {
    }
	

}