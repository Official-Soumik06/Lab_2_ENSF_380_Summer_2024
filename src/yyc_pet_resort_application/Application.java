package yyc_pet_resort_application;

import java.util.Scanner;

public class Application {

	// Testing method
	public static void main(String[] args) {
		/*
		 * System.out.println("Medicine/MedicineList CLASS Tests: ");
		 * // Step 1: Create Medication objects
		 * Medication med1 = new Medication("Medicine A", "Instructions A");
		 * Medication med2 = new Medication("Medicine B", "Instructions B");
		 * Medication med3 = new Medication("Xiranar", "Administer Twice Daily");
		 * 
		 * // Step 2: Initialize a Medication[] array with these objects
		 * Medication[] meds = {med1, med2};
		 * 
		 * // Step 3: Create a MedicationList object using the array
		 * MedicationList medList = new MedicationList(meds);
		 * medList.addMedication(med3);
		 * 
		 * // Step 4: Call the getMedicationListNames method
		 * String[] medNames = medList.getMedicationListNamesWithInstructions();
		 * 
		 * // Step 5: Iterate through the returned array of names and print them
		 * for(String name : medNames) {
		 * System.out.println(name);
		 * }
		 * 
		 * //Step6: Remove Medicine A and reprint the list
		 * medList.removeMedication("Medicine A");
		 * medNames = medList.getMedicationListNamesWithInstructions();
		 * for(String name : medNames) {
		 * System.out.println(name);
		 * }
		 * System.out.println("");
		 */

		/*
		 * Note that if PrintCareProfile functions then all the pet related classes are
		 * properly implemented.
		 *
		 * System.out.println("printAllData Test:");
		 * // Create necessary objects for testing
		 * FeedingInformation feedingInstructions = new FeedingInformation("Food A",
		 * "Instructions A"); // Assuming constructor parameters
		 * Medication med1 = new Medication("Medicine A", "Instructions A");
		 * Medication med2 = new Medication("Medicine B", "Instructions B");
		 * Medication[] meds = {med1, med2};
		 * MedicationList medicationList = new MedicationList(meds);
		 * Pet pet = new Pet("Buddy", "5", "Golden Retriever", "Dog", null, null); //
		 * Assuming CareProfile and Client are not required for Pet constructor
		 * CareProfile careProfile = new CareProfile(feedingInstructions,
		 * medicationList, pet);
		 * 
		 * // Call the printAllData method
		 * PrintCareProfile.printAllData(careProfile);
		 */
		Scanner scan = new Scanner(System.in);
		Booking[] bookings = new Booking[1000];
		int counter = 0;
		System.out.println("YYC Pet Resort Bookkeeping Application"
				+ "\nWhat would you like to do?");
		while (true) {
			System.out.println("1. Enter a new booking."
					+ "\n2. Manage existing booking."
					+ "\n3. Set payment."
					+ "\n4. Close Program.");
			int choice = scan.nextInt();
			switch (choice) {
				case 1:
					bookings[counter] = newBooking();
					counter++;
					continue;
				case 2:
					scan.nextLine();
					System.out.println("Enter booking ID:");
					String bookingID = scan.nextLine();

					int i = 0;
					int found = 0;

					for (; i < counter; i++) {
						if (bookings[i].getBookingID().equals(bookingID)) {
							manageBooking(bookings[i]);
							found++;
							break;
						}
					}
					if (found == 0) {
						System.out.println("Booking not found.");
					}
					continue;
				case 3:
					scan.nextLine();
					System.out.println("Enter booking ID:");
					bookingID = scan.nextLine();

					i = 0;
					for (; i < counter; i++) {
						if (bookings[i].getBookingID().equals(bookingID)) {
							System.out.println("Enter payment date:");
							String paymentDate = scan.nextLine();

							System.out.println("Enter payment method:");
							String paymentMethod = scan.nextLine();

							System.out.println("Enter payment ID: ");
							String paymentID = scan.nextLine();

							System.out.println("Enter payment amount:");
							String payment = scan.nextLine();
							bookings[i].addPayment(
									new BillingPayment(paymentID, payment, paymentDate, paymentMethod, bookings[i]));
							break;
						}
					}
					
					continue;
				case 4:
					System.out.println("Closing Program...");
					scan.close();
					return;
			}
		}
	}

	public static void manageBooking(Booking booking) {

		System.out.print(
				"Would you like to manage the pet profile, the client profile, the booking details, or print the pet care profile? (P/C/B/Pr): ");
		Scanner scan = new Scanner(System.in);
		String response = scan.nextLine();

		if (response.equals("P")) {
			System.out.print("Would you like to manage the pet's feeding instructions or medication list? (F/M): ");
			response = scan.nextLine();
			if (response.equals("F")) {
				System.out.print("Enter new food brand name: ");
				String foodBrand = scan.nextLine();
				System.out.print("Enter new food instructions: ");
				String foodInstructions = scan.nextLine();
				booking.getPet().getCareProfile().getFeedingInstructions().setFoodName(foodBrand);
				booking.getPet().getCareProfile().getFeedingInstructions().setInstructions(foodInstructions);
			} else if (response.equals("M")) {
				System.out.print("Would you like to add or remove a medication? (A/R): ");
				response = scan.nextLine();
				if (response.equals("A")) {
					System.out.print("Enter medication name: ");
					String medName = scan.nextLine();
					System.out.print("Enter medication instructions: ");
					String medInstructions = scan.nextLine();
					booking.getPet().getCareProfile().getMedicationList()
							.addMedication(new Medication(medName, medInstructions));
					System.out.println("Medication added.");
				} else if (response.equals("R")) {
					System.out.print("Enter medication name to remove: ");
					String medName = scan.nextLine();
					booking.getPet().getCareProfile().getMedicationList().removeMedication(medName);
					System.out.println("Medication removed.");
				}
			}
		} else if (response.equals("C")) {
			System.out.print("Would you like to change the client name, phone number, or address? (N/P/A): ");
			response = scan.nextLine();
			if (response.equals("N")) {
				System.out.print("Enter new client name: ");
				String clientName = scan.nextLine();
				booking.getClient().setClientName(clientName);
			} else if (response.equals("P")) {
				System.out.print("Enter new client phone number: ");
				String clientPhone = scan.nextLine();
				booking.getClient().setClientPhoneNumber(clientPhone);
			} else if (response.equals("A")) {
				System.out.print("Enter new client address: ");
				String clientAddress = scan.nextLine();
				booking.getClient().setClientAddress(clientAddress);
			}
		} else if (response.equals("B")) {
			System.out.print("Would you like to change the booking ID, start date, or end date? (I/S/E): ");
			response = scan.nextLine();
			if (response.equals("I")) {
				System.out.print("Enter new booking ID: ");
				String bookingID = scan.nextLine();
				booking.setBookingID(bookingID);
			} else if (response.equals("S")) {
				System.out.print("Enter new start date: ");
				String startDate = scan.nextLine();
				booking.setStartDate(startDate);
			} else if (response.equals("E")) {
				System.out.print("Enter new end date: ");
				String endDate = scan.nextLine();
				booking.setEndDate(endDate);
			}
		} else if (response.equals("Pr")) {
			PrintCareProfile.printAllData(booking.getPet().getCareProfile());
		}
	}

	public static Booking newBooking() {
		Scanner scan = new Scanner(System.in);

		// get booking information
		System.out.print("Enter booking ID: ");
		String bookingID = scan.nextLine();
		System.out.print("Enter start date (YYYY-MM-DD): ");
		String startDate = scan.nextLine();
		System.out.print("Enter end date (YYYY-MM-DD): ");
		String endDate = scan.nextLine();

		// get client information
		System.out.print("Enter client name: ");
		String clientName = scan.nextLine();
		System.out.print("Enter client phone number: ");
		String clientPhone = scan.nextLine();
		System.out.print("Enter client address: ");
		String clientAddress = scan.nextLine();

		// get pet information
		System.out.print("Enter pet name: ");
		String petName = scan.nextLine();
		System.out.print("Enter pet age: ");
		String petAge = scan.nextLine();
		System.out.print("Enter pet type: ");
		String petType = scan.nextLine();
		System.out.print("Enter pet species: ");
		String petSpecies = scan.nextLine();
		System.out.print("Enter pet food brand name: ");
		String petFoodBrand = scan.nextLine();
		System.out.print("Enter pet food instructions: ");
		String petFoodInstructions = scan.nextLine();

		// get medication information
		System.out.println("Does the pet require medication? (Y/N)");
		String response = scan.nextLine();
		String[] medNames = new String[1];
		String[] medInstructions = new String[1];
		if (response.equals("Y")) {
			while (true) {
				System.out.print("Enter medication name: ");
				String medNameToAdd = scan.nextLine();
				System.out.print("Enter medication instructions: ");
				String medInstructionsToAdd = scan.nextLine();
				medNames[medNames.length - 1] = medNameToAdd;
				medInstructions[medInstructions.length - 1] = medInstructionsToAdd;

				System.out.println("Would you like to add another medication? (Y/N)");
				response = scan.nextLine();
				if (response.equals("N")) {
					break;
				} else if (response.equals("Y")) {
					String[] newMedNames = new String[medNames.length + 1];
					String[] newMedInstructions = new String[medInstructions.length + 1];
					for (int i = 0; i < medNames.length; i++) {
						newMedNames[i] = medNames[i];
						newMedInstructions[i] = medInstructions[i];
					}
					medNames = newMedNames;
					medInstructions = newMedInstructions;
				}
			}
		}

		// create objects
		FeedingInformation feedingInstructions = new FeedingInformation(petFoodBrand, petFoodInstructions);
		Medication[] meds = new Medication[medNames.length];
		for (int i = 0; i < medNames.length; i++) {
			meds[i] = new Medication(medNames[i], medInstructions[i]);
		}
		Pet[] pets = new Pet[1];
		MedicationList medicationList = new MedicationList(meds);
		Pet pet = new Pet();
		CareProfile careProfile = new CareProfile();
		Client client = new Client();
		Booking booking = new Booking(bookingID, startDate, endDate, pet, client);

		// set object values
		pet.setPetName(petName);
		pet.setPetAge(petAge);
		pet.setPetType(petType);
		pet.setPetSpecies(petSpecies);
		pet.setCareProfile(careProfile);
		pets[0] = pet;

		careProfile.setFeedingInstructions(feedingInstructions);
		careProfile.setMedicationList(medicationList);
		careProfile.setPet(pet);

		client.setClientName(clientName);
		client.setClientPhoneNumber(clientPhone);
		client.setClientAddress(clientAddress);
		client.setPets(pets);

		// add booking to bookings array
		return booking;
	}
}
