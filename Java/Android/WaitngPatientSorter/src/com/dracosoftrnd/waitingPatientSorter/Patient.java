package com.dracosoftrnd.waitingPatientSorter;

import java.util.Date;

public class Patient {
	
	public String firstName;
	public String lastName;
	public Date appointmentTime;
	public Date checkinTime;
	public Date effectiveTime;
	
	
	public Patient(String fName, String lName, Date appointmentTime, Date checkinTime)
	{
		this.firstName = fName;
		this.lastName = lName;
		this.appointmentTime = appointmentTime;
		this.checkinTime = checkinTime;
		long difference = appointmentTime.getTime() - checkinTime.getTime();
		this.effectiveTime.setTime(appointmentTime.getTime() - difference);
	}
	
	
	public void loadTestData()
	{
		Patient a = new Patient("Josh", "Newton", new Date(Date.UTC(2012, 12, 8, 8, 0, 0)), appointmentTime);
		
		
	}
}