package yyc_pet_resort_application;

public class FeedingInformation {
	private String foodName;
	private String instructions;
	
	//Constructors
	FeedingInformation(String foodName, String instructions) {
		this.foodName = foodName;
		this.instructions = instructions;
	}
	FeedingInformation() {}
	
	//setters
	public void setFoodName(String name) {
		this.foodName = name;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	
	//getters
	public String getFoodName() {
		return this.foodName;
	}
	public String getInstructions() {
		return this.instructions;
	}
}
