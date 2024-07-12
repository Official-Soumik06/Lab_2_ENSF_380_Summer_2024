package yyc_pet_resort_application;

// Public Class BillingPayment:

public class BillingPayment {
	
// Private Data Members
	
	private String paymentID;
	private String paymentAmount;
	private String paymentDate;
	private String paymentType;
	private Booking booking;
	
// This Is The BillingPayment Class Other Constructor:
	
	public BillingPayment(String paymentID, String paymentAmount, String paymentDate, String paymentType, Booking booking) {
		this.paymentID = paymentID;
		this.paymentAmount = paymentAmount; 
		this.paymentDate = paymentDate;
		this.paymentType = paymentType;
		this.booking = booking;
	}
	
// Getter Member Functions/Methods:
	
	public String getPaymentID() {
		return paymentID;
	}

	public String getPaymentAmount(){
		return paymentAmount;
	}
	
	public String getPaymentDate() {
		return paymentDate;
	}
	
	public String getPaymentType() {
		return paymentType;
	}
	
	public Booking getBooking() {
		return booking;
	}
	
// Setter Member Function/Method: 
	
	public void setPaymentID(String paymentID) {
		this.paymentID = paymentID;
	}
	
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount; 
	}
	
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	
}

