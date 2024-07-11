package yyc_pet_resort_application;

public class Application {

	//Testing method
		public static void main(String[] args) {
			// Step 1: Create Medication objects
	        Medication med1 = new Medication("Medicine A", "Instructions A");
	        Medication med2 = new Medication("Medicine B", "Instructions B");
	        Medication med3 = new Medication("Xiranar", "Administer Twice Daily");
	        
	        // Step 2: Initialize a Medication[] array with these objects
	        Medication[] meds = {med1, med2};
	        
	        // Step 3: Create a MedicationList object using the array
	        MedicationList medList = new MedicationList(meds);
	        medList.addMedication(med3);
	        
	        // Step 4: Call the getMedicationListNames method
	        String[] medNames = medList.getMedicationListNamesWithInstructions();
	        
	        // Step 5: Iterate through the returned array of names and print them
	        for(String name : medNames) {
	            System.out.println(name);
	        }
	        
	        //Step6: Remove Medicine A and reprint the list
	        medList.removeMedication("Medicine A");
	        medNames = medList.getMedicationListNamesWithInstructions();
	        for(String name : medNames) {
	        	System.out.println(name);
	        }
		}
}
