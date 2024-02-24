package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {
	private static final int maxTrucks = 5;
	private static FoodTruck[] foodTrucks = new FoodTruck[maxTrucks];
	private static int tCount = 0;

	public static void main(String[] args) {
		FoodTruckApp foodTApp = new FoodTruckApp();
		foodTApp.run();
	}

	Scanner kb = new Scanner(System.in);

	public void run() {
		System.out.println(" !!!! Welcome to the Food Truck App !!!!/n");

		while (tCount < maxTrucks) {

			System.out.println("Please enter the name of the Food Truck: ");
			String name = kb.nextLine();

			System.out.print("Pleas enter type of food served: ");
			String foodType = kb.nextLine();

			System.out.print("Please give the Food Truck a rating from 1 to 5: ");
			int rating = kb.nextInt();
			kb.nextLine();

			foodTrucks[tCount++] = new FoodTruck(name, foodType, rating);
		}
		menu(kb);
	}

	private void menu(Scanner kb) {
		while (true) {
			System.out.println("Please choose from the menu bellow : ");
			System.out.println();
			System.out.println("**************** Menu ***************");
			System.out.println("* 1. List all food trucks           *");
			System.out.println("* 2. Display average rating         *");
			System.out.println("* 3. See the #1 rated Food Truck    *");
			System.out.println("* 4. Quit                           *");
			System.out.println("*************************************");

			int userIn = kb.nextInt();

			switch (userIn) {
			case 1:
				allFoodTrucks();
				break;
			case 2:
				totalAverageRating();
				break;
			case 3:
				highestRatedTruck();
				break;
			case 4:
				System.out.println("Quitting the program. Goodbye!");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please enter a valid option.");

			}
		}

	}

	private void allFoodTrucks() {
		System.out.println("\nList of Food Trucks:");
		for (int i = 0; i < tCount; i++) {
			System.out.println(foodTrucks[i]);
		}
	}

	private void totalAverageRating() {
		int totalRating = 0;
		for (int i = 0; i < tCount; i++) {
			totalRating += foodTrucks[i].getRating();
		}

		double averageRating = (double) totalRating / tCount;
		System.out.println("\nAverage Rating: " + averageRating);
	}

	private static void highestRatedTruck() {
		if (tCount == 0) {
			System.out.println("No food trucks entered yet.");
			return;
		}

		FoodTruck highestRatedTruck = foodTrucks[0];
		for (int i = 1; i < tCount; i++) {
			if (foodTrucks[i].getRating() > highestRatedTruck.getRating()) {
				highestRatedTruck = foodTrucks[i];
			}
		}

		System.out.println("\nHighest Rated Food Truck: " + highestRatedTruck);
	}

}
