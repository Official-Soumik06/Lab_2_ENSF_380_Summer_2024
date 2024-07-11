package yyc_pet_resort_application;

public class Medication {
	private String medName;
	private String instructions;
	
	//constructors
	Medication(String medName, String instructions) {
		this.medName = medName;
		this.instructions = instructions;
	}
	Medication() {}
	
	//setters
	public void setName(String name) {
		this.medName = name;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	
	//getters
	public String getName() {
		return this.medName;
	}
	public String getInstructions() {
		return this.instructions;
	}
}
