package dz.ibnrochd.master14;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Sb002Application implements CommandLineRunner {
	
	
	
	

	public static void main(String[] args) {
	SpringApplication.run(Sb002Application.class, args);
	}

	public void run(String... args) throws Exception {
	}
}

		//@Autowired
		//PatientRepository patientRepository;
			
		//@Autowired
		//ConsultationRepository consultationRepository;
		
		//@Autowired
		//LigneConsultationRepository ligneConsultationRepository;
		
		//@Autowired
		//RendezVousRepository rendezVousRepository;
		
		//@Autowired
		//TraitementRepository traitementRepository;
		
		// TODO : déclarer les autres repository de la même façon que PatientRepository
		
		//System.out.println("---------------------------récupérer la liste de tous les patients puis afficher leurs noms------------------------------------");
		// TODO : récupérer la liste de tous les patients puis afficher leurs noms
		//List<Patient> L2=patientRepository.findAll();
		//for(Patient l2:L2)
		//System.out.println(l2.getNom()+"  "+l2.getPrenom());
		
		
		
		//System.out.println("---------------------------rechercher les patients ayant le nom \"Yahi\" puis leurs prénoms------------------------------------");	
		// TODO : rechercher les patients ayant le nom "Yahi" puis leurs prénoms
		
		
		//List<Patient> L3 = patientRepository.findBynom("Yahi");
		
		//for(Patient l3:L3)
			//	System.out.println(l3.getId()+"  "+l3.getNom()+"  "+l3.getPrenom());
		
		
		// TODO : créer un nouveau patient (valeurs au choix)  PUIS enregistrer-le
		//System.out.println("----------------------------créer un nouveau patient (valeurs au choix)  PUIS enregistrer-le-----------------------------------");
		
		//Date d3 = new Date(119,1,22);
		
		
		//System.out.println(d2);
		// String st="2015-03-31";
		 
		// SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
		// 		 System.out.println(f1);
		//	Date d = new Date(0);
	     //   System.out.println(d);
	        
	    //    Calendar c = Calendar.getInstance();
	    //    System.out.println(c);
		//Date d1 = new Date(54,10,1); 
		
	         
	    //patientRepository.save(new Patient(11,"ALi","Ammar","M" , d1,"122333","Bab Ezzouar"));
		//System.out.println("Patient ALi Ammar est Ajouté");
		
		//List<Patient> L7=patientRepository.findAll();
		//for(Patient l2:L7)
		//System.out.println(l2.getNom()+"  "+l2.getPrenom());
		
		// TODO : rechercher la consultation ayant id=3 
		
		
		//System.out.println("--------------------------rechercher la consultation ayant id=3 -------------------------------------");
		
		//Optional<Patient> L4 = patientRepository.findById(3);
		//System.out.println(L4);
		
			               	
	
		
		// TODO : parcourir les lignes de la consultation trouvée et afficher les noms des médicaments
	
	

