package yyc_pet_resort_application;

//This Is The Public Class Client:

public class Client {

// These Are The Private Data Members Of The Public Class Client:
	
	private String clientName;
	private String clientPhoneNumber;
	private String clientAddress;
	private Pet[] pets;
	private Booking[] bookings;

// This Is The Client Class Other Constructor: 
	
	public Client(String clientName, String clientPhoneNumber, String clientAddress, Pet[] pets, Booking[] bookings) {
		this.clientName = clientName;
		this.clientPhoneNumber = clientPhoneNumber;
		this.clientAddress = clientAddress;
		this.pets = pets;
		this.bookings = bookings; 
	}
	
// Getter Function/Methods: 
	
	public String getClientName() {
		return clientName;
	}
	
	public String getClientPhoneNumber() {
		return clientPhoneNumber;
	}
	
	public String getClientAddress() {
		return clientAddress;
	}
	
	public Pet[] getPets() {
		return pets;
	}

	public Booking[] getBookings() {
		return bookings;
	}
	
	
// Setter Functions/Methods: 
	
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	public void setClientPhoneNumber(String clientPhoneNumber) {
		this.clientPhoneNumber = clientPhoneNumber;
	}
	
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}
	
	public void setPets(Pet[] pets) {
		this.pets = pets;
	}
	
	public void setBookings(Booking[] bookings) {
		this.bookings = bookings;
	}
	
// Other Public Member Functions/Methods: 
	
	public void addPet(Pet pets) {
		
	}
	
	public void removePet(Pet pets) {
		
	}
	
	public void addBooking(Booking bookings) {
		
	}
	
	public void removeBooking(Booking bookings) {
		
	}
	
}
