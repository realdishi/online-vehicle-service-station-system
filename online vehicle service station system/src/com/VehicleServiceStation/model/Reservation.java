
/**
 * VEHICLE SERVICE AND FUEL SATATION MANAGEMENT SYSTEM
 * @author yasith wimukthi
 * IT 19966922
 * 
 * Y2S1 2.2
 * OOP
 *
 */
package com.VehicleServiceStation.model;


public class Reservation {
	
	int reservationID;
	String vehicleNo;
	String brand;
	String model;
	String fuelType;
	String category;
	String date;
	int userID;
	
	
	// DEFAULT CONSTRUCTOR
	public Reservation() {
		super();
	}
	
	//OVERLOADED CONSTRUCTOR FOR PRIVATE FIELDS WITHOUT reservationID
	public Reservation(String vehicleNo, String brand, String model, String fuelType, String category, String date,
			int userID) {
		super();
		this.vehicleNo = vehicleNo;
		this.brand = brand;
		this.model = model;
		this.fuelType = fuelType;
		this.category = category;
		this.date = date;
		this.userID = userID;
	}

	
	//OVERLOADED CONSTRUCTOR FOR ALL PRIVATE FIELDS
	public Reservation(int reservationID, String vehicleNo, String brand, String model, String fuelType,
			String category, String date, int userID) {
		super();
		this.reservationID = reservationID;
		this.vehicleNo = vehicleNo;
		this.brand = brand;
		this.model = model;
		this.fuelType = fuelType;
		this.category = category;
		this.date = date;
		this.userID = userID;
	}

	public int getReservationID() {
		return reservationID;
	}

	public void setReservationID(int reservationID) {
		this.reservationID = reservationID;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}
		

}


