package com.skilldistillery.foodtruck;

public class FoodTruck {

	private static int nextTruckId = 0;
	private int tId = 0;
	private String truckName = "";
	private String foodType = "";
	private double truckRating = 0.0;

	public FoodTruck(String name, String food, double rating) {
		this.tId = nextTruckId++;
		this.truckName = name;
		this.foodType = food;
		this.truckRating = rating;
	}

	public int getId() {
		return tId;
	}

	public void setiD(int ID) {
		this.tId = ID;
	}

	public String getName() {
		return truckName;
	}

	public void setName(String name) {
		this.truckName = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getRating() {
		return truckRating;
	}

	public void setRating(int rating) {
		this.truckRating = rating;
	}

	public String toString() {
		return "\nFoodTruck " + "ID: " + tId + "\n Truck Name: " + truckName + "\n FoodType: " + foodType
				+ "\n Truck rating: " + truckRating;
	}

}
