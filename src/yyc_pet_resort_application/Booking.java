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
	
// This Is The Booking Class Other Constructor: 
	
	public Booking(String bookingID, String startDate, String endDate, Pet pet, Client client, BillingPayment[] payments) {
		this.bookingID = bookingID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.pet = pet;
		this.client = client;
		this.payments = payments;
	}
	
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
	
	public void addPayment(BillingPayment newPayment) {
        if (newPayment == null) {
            throw new IllegalArgumentException("Payment Cannot Be Nothing");
        }
        if (payments == null) {
            payments = new BillingPayment[1];
            payments[0] = newPayment;
        } else {
            BillingPayment[] newPayments = new BillingPayment[payments.length + 1];
            System.arraycopy(payments, 0, newPayments, 0, payments.length);
            newPayments[payments.length] = newPayment;
            payments = newPayments;
        }
    }

    public void removePayment(BillingPayment paymentToRemove) {
        if (paymentToRemove == null) {
            throw new IllegalArgumentException("Payment To Remove Cannot Be Nothing");
        }
        if (payments == null || payments.length == 0) {
            return; // If No payments to remove
        }

        int newLength = payments.length - 1;
        BillingPayment[] newPayments = new BillingPayment[newLength];
        int index = 0;
        boolean found = false;

        for (BillingPayment payment : payments) {
            if (!payment.equals(paymentToRemove) || found) {
                if (index < newLength) {
                    newPayments[index++] = payment;
                }
            } else {
                found = true;
            }
        }

        if (found) {
            payments = newPayments;
        }
    }
}
