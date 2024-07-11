package yyc_pet_resort_application;

public class MedicationList {
	private Medication[] medicationList;
	
	//initial constructor; MUST be initialized with a Medication array.
	MedicationList(Medication[] meds) {
		this.medicationList = meds;
	}
	
	//adds a Medication object to the array
	public void addMedication(Medication medToBeAdded) {
		if (this.medicationList != null) {
			int n = this.medicationList.length;
			Medication newArr[] = new Medication[n + 1];
			
			for(int i = 0; i < n; i++) {
				newArr[i] = this.medicationList[i];
			}
			newArr[n] = medToBeAdded;
			this.medicationList = newArr;
		} else {
			Medication newArr[] = new Medication[1];
			this.medicationList = newArr;
			this.medicationList[0] = medToBeAdded;
		}
	}
	//removes a Medication object with its specified name, if not found returns "Does Not Exist"
	public void removeMedication(String medToBeRemoved) {
		int indexToRemove = -1;
		for (int i = 0; i < this.medicationList.length; i++) {
			if (medToBeRemoved.equals(this.medicationList[i].getName())) {
				indexToRemove = i;
				break;
			}	
		}
		if (indexToRemove == -1) {
			return; //Medication does not exist
		}
			
		Medication[] newArr = new Medication[this.medicationList.length - 1];
		for (int j = 0, n = 0; j < this.medicationList.length; j++) {
			if (j != indexToRemove) {
				newArr[n++] = this.medicationList[j];
			}
		}
		this.medicationList = newArr;
	}
		
		
	
	
	//Getter to retrieve names with instructions for each medicine.
	public String[] getMedicationListNamesWithInstructions() {
		String[] medNames = new String[this.medicationList.length];
		for (int i = 0; i < this.medicationList.length; i++) {
			medNames[i] = this.medicationList[i].getName() +" - "+ this.medicationList[i].getInstructions();
		}
		return medNames;
	}
	
	
	
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
