package yyc_pet_resort_application;

// Public Class Booking:

public class Booking {

// Private Data Members: 
	
	private String bookingID;
	private String startDate;
	private String endDate;
	private Pet pet;
	private Client client;
	private BillingPayment[] payments;
	
// Getter Public Member Functions/Methods: 
	
	public String getBookingID() {
		return bookingID;
	}
	
	public String getStartDate() {
		return startDate;
	}
	
	public String getEndDate() {
		return endDate;
	}
	
	public Pet getPet() {
		return pet;
	}
	
	public Client getClient() {
		return client;
	}
	
	public BillingPayment[] getPayments() {
		return payments;
	}
	
// Setter Member Functions/Methods: 
	
	public void setBookingID(String bookingID) {
		this.bookingID = bookingID;
	}
	
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public void setBillingPayments(BillingPayment[] payments) {
		this.payments = payments;
	}
	
// Other Public Functions/Methods
	
	public void addPayment(BillingPayment payment) {
		
	}
	
	public void removePayment(BillingPayment payment) {
		
	}
	
}
