package dz.ibnrochd.master14.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dz.ibnrochd.master14.business.PatientService;
import dz.ibnrochd.master14.business.TraitementService;
import dz.ibnrochd.master14.model.Patient;
import dz.ibnrochd.master14.model.Traitement;


@Controller
public class AppController {
	
	@Autowired
	private PatientService patientService;
	
	@Autowired
	private TraitementService traitementService;
	
	
	
		
	@RequestMapping("/traitements")
	public String viewHomePage(Model model) {
	    List<Traitement> listtraitement = traitementService.listAll() ;
	    model.addAttribute("listtraitement", listtraitement);
	     
	    return "listTraitementsView";
	}
	
	@RequestMapping("/patients")
	public String viewHomePage1(Model model) {
	    List<Patient> listpatients = patientService.listAll();
	    		model.addAttribute("listpatients", listpatients);
	     
	    return "listPatientsView";
	    
	    }
	//@RequestMapping("/new")
	//public String showNewProductPage2(Model model) {
	  //  Patient patient = new Patient();
	    //model.addAttribute("patient", patient);
	     
	    //return "new_patient";
	//}

	public PatientService getPatientService() {
		return patientService;
	}

	public void setPatientService(PatientService patientService) {
		this.patientService = patientService;
	}
	
	@RequestMapping("/delete/{id}")
	public String deletePatient(@PathVariable(name="id") int id) {
		patientService.delete(id);;
	    return  "redirect:/";    
	    
	    }
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("patient") Patient patient) {
		patientService.save(patient);
	     
	    return "redirect:/";
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("mpatient");
	    Patient patient = patientService.get(id);
	    mav.addObject("patient", patient);
	     
	    return mav;
	    
	    
	}
	
	// @GetMapping("/international")
	  //  public String getInternationalPage() {
	    //    return "international";
	    //}
	}
	
	
	//@RequestMapping(value = "/delete", method = RequestMethod.GET)
	//public String handleDeletePatient(@RequestParam(name="id")int id) {
	  //  System.out.println(id);
	    //System.out.println("test");
	    //return "redirect:/external";
	//}
	
	//@RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
	//public String index(Model model) {
	//model.addAttribute("listPatients", iPatientService.findAll()); 
	//return "index"; // HTML
	    
	//}
	//@RequestMapping(value = {"/"}, method = RequestMethod.GET )
	//public String showNewTraitementPage(Model model) {
		//model.addAttribute("listTraitements", iTraitementService.findAll());
		
		//return "listTraitementsView";
		
	//}
	//@RequestMapping(value = {"/delete/{id}"}, method = RequestMethod.DELETE)
		//public String deleteTraitement(@PathVariable(name = "id") int id) {
	    	//iTraitementService.deleteById(id);
			//return "redirect:/";		
		//}
		
		
		
	//@GetMapping(value = "/Patient")
    //public List<Patient> getAllPatient() {
      //  return iPatientService.findAll() ;
	//}
	
    //@PostMapping("/Patient")
    //Patient createOrSaveEmployee(@RequestBody Patient newPatient) {
      //  return iPatientService.save(newPatient);
	//}
   

  
//    @PostMapping("/Traitement")
  //  Traitement createOrSaveTraitement(@RequestBody Traitement newTraitement) {
    //     return iTraitementService.save(newTraitement);


//}

	
