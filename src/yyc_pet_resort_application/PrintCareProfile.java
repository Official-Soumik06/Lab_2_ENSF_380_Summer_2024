package yyc_pet_resort_application;

public class PrintCareProfile {
	public static void printAllData(CareProfile careProfile) {
		// Print basic pet information
        Pet pet = careProfile.getPet();
        System.out.println("Pet Name: " + pet.getPetName());
        System.out.println("Pet Age: " + pet.getPetAge());
        System.out.println("Pet Type: " + pet.getPetType());
        System.out.println("Pet Species: " + pet.getPetSpecies());

        // Print feeding instructions
        FeedingInformation feedingInstructions = careProfile.getFeedingInstructions();
        System.out.println("Feeding Instructions: " + feedingInstructions.toString()); // Assuming FeedingInformation has a meaningful toString implementation

        // Print medication list
        MedicationList medicationList = careProfile.getMedicationList();
        String[] medNames = medicationList.getMedicationListNamesWithInstructions(); // Assuming this method exists and returns medication names with instructions
        System.out.println("Medications:");
        for (String name : medNames) {
            System.out.println(name);
        }
	}
}
