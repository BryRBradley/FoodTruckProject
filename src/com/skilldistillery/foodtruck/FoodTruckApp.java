package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {
	private static int maxTrucks = 5;
	private static FoodTruck[] foodTrucks = new FoodTruck[maxTrucks];
	private static int tCount = 0;

	public static void main(String[] args) {
		FoodTruckApp foodTApp = new FoodTruckApp();
		foodTApp.run();
	}

	public void run() {
		Scanner kb = new Scanner(System.in);
		while (tCount > maxTrucks) {
			System.out.println(" !!!! Welcome to the Food Truck App !!!!/n");
			System.out.println("Please enter the name of the Food Truck: ");

		}
//		FoodTruck t1 = new FoodTruck();
//		FoodTruck t2 = new FoodTruck();
//		FoodTruck t3 = new FoodTruck();
//		FoodTruck t4 = new FoodTruck();
//		FoodTruck t5 = new FoodTruck();

	}

}
