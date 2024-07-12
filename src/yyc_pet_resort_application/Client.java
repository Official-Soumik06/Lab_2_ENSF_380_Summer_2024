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
	
	public void addPet(Pet newPet) {
        if (newPet == null) {
            throw new IllegalArgumentException("Pet Cannot Be Nothing");
        }
        if (pets == null) {
            pets = new Pet[1];
            pets[0] = newPet;
        } else {
            Pet[] newPets = new Pet[pets.length + 1];
            System.arraycopy(pets, 0, newPets, 0, pets.length);
            newPets[pets.length] = newPet;
            pets = newPets;
        }
    }

    public void removePet(Pet petToRemove) {
        if (petToRemove == null) {
            throw new IllegalArgumentException("Pet To Remove Cannot Be Nothing");
        }
        if (pets == null || pets.length == 0) {
            return; // If No Pets To Remove
        }

        int newLength = pets.length - 1;
        Pet[] newPets = new Pet[newLength];
        int index = 0;
        boolean found = false;

        for (Pet pet : pets) {
            if (!pet.equals(petToRemove) || found) {
                if (index < newLength) {
                    newPets[index++] = pet;
                }
            } else {
                found = true;
            }
        }

        if (found) {
            pets = newPets;
        }
    }

    public void addBooking(Booking newBooking) {
        if (newBooking == null) {
            throw new IllegalArgumentException("Booking Cannot Be Nothing");
        }
        if (bookings == null) {
            bookings = new Booking[1];
            bookings[0] = newBooking;
        } else {
            Booking[] newBookings = new Booking[bookings.length + 1];
            System.arraycopy(bookings, 0, newBookings, 0, bookings.length);
            newBookings[bookings.length] = newBooking;
            bookings = newBookings;
        }
    }

    public void removeBooking(Booking bookingToRemove) {
        if (bookingToRemove == null) {
            throw new IllegalArgumentException("Booking To Remove Cannot Be Nothing");
        }
        if (bookings == null || bookings.length == 0) {
            return; // If No Bookings To Remove
        }

        int newLength = bookings.length - 1;
        Booking[] newBookings = new Booking[newLength];
        int index = 0;
        boolean found = false;

        for (Booking booking : bookings) {
            if (!booking.equals(bookingToRemove) || found) {
                if (index < newLength) {
                    newBookings[index++] = booking;
                }
            } else {
                found = true;
            }
        }

        if (found) {
            bookings = newBookings;
        }
    }
}
