package yyc_pet_resort_application;

public class CareProfile {
	//CareProfile data
	private FeedingInformation feedingInstructions;
	private MedicationList medicationList;
	private Pet pet;
	
	//basic initializing constructor
	CareProfile(FeedingInformation instructions, MedicationList medicationList
			, Pet pet) {
		this.feedingInstructions = instructions;
		this.medicationList = medicationList;
		this.pet = pet;
	}
	CareProfile() {}
	
	//setters
	public void setFeedingInstructions(FeedingInformation feedingInstructions) {
		this.feedingInstructions = feedingInstructions;
	}
	public void setMedicationList(MedicationList medlist) {
		this.medicationList = medlist;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	//getters
	public FeedingInformation getFeedingInstructions() {
		return this.feedingInstructions;
	}
	public MedicationList getMedicationList() {
		return this.medicationList;
	}
	public Pet getPet(Pet pet) {
		return this.pet;
	}
	
	
}
