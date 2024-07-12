package yyc_pet_resort_application;

public class Pet {
	
//These Are The Pet Classes Private Data Members: 
	
	private String petName;
	private String petAge;
	private String petType;
	private String petSpecies;
	private CareProfile careProfile;
	private Client owner;
	
//This Is The Pet Classes Constructor: 
	
	public Pet(String petName, String petAge, String petType, String petSpecies, CareProfile careProfile, Client owner) {
		this.petName = petName;
		this.petAge = petAge;
		this.petType = petType;
		this.petSpecies = petSpecies;
		this.careProfile = careProfile;
		this.owner = owner; 
	}
	Pet() {}
	
	//Getter Public Member Functions/Methods:
	
	public String getPetName() {
		return petName;
	}
	
	public String getPetAge() {
		return petAge;
	}
	
	public String getPetType() {
		return petType;
	}
	
	public String getPetSpecies() {
		return petSpecies;
	}
	
	public CareProfile getCareProfile() {
		return careProfile;
	}
	
	public Client getOwner() {
		return owner;
	}
	
	//Setter Public Member Functions/Methods:
	
	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	public void setPetAge(String petAge) {
		this.petAge = petAge;
	}
	
	public void setPetType(String petType) {
		this.petType = petType;
	}
	
	public void setPetSpecies(String petSpecies) {
		this.petSpecies = petSpecies;
	}
	
	public void setCareProfile(CareProfile careProfile) {
		this.careProfile = careProfile;
	}
	
	public void setOwner(Client owner) {
		this.owner = owner;
	}
	
}
