package work.main;


import java.util.Date;


public class Appointment {
	
	//creating variables
	String appointmentID;
	String appointmentDescription;
	Date date;
	
	//constructor for appointment
	public Appointment(String appointmentID, Date date, String appointmentDescription) {
		
		
		
		Date currentDate = new Date(); 
		
		//appointment ID not null and 10 or less
		if(appointmentID.length() > 0 && appointmentID.length() <= 10)
			this.appointmentID = appointmentID;
		else {
			System.out.println("The appointment ID needs to be 1 to 10 characters.");
	
		}
		
		

		
		
		//checking date, if it is in the future.
		if(date != null && currentDate.before(date))
			this.date = date; 
		else {
			System.out.println("Appointment date needs to be a future date.");

		}
		
		//Description should have 1 to 50 characters.
		if(appointmentDescription.length() > 0 && appointmentDescription.length() <= 50)
			this.appointmentDescription = appointmentDescription;
		
		else {
			System.out.println("There needs to be a descripition and it cannot have more than 50 characters.");

		}
	
		
		
	}

	public String getAppointmentID() {
		return appointmentID;
	}

	public void setAppointmentID(String appointmentID) {
		this.appointmentID = appointmentID;
	}

	public String getAppointmentDescription() {
		return appointmentDescription;
	}

	public void setAppointmentDescription(String appointmentDescription) {
		this.appointmentDescription = appointmentDescription;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	

}
