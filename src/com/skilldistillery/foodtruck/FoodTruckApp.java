package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {
	private static final int totalTrucks = 5;
	private static FoodTruck[] foodTrucks = new FoodTruck[totalTrucks];
	private static int tCount = 0;

	public static void main(String[] args) {
		FoodTruckApp foodTApp = new FoodTruckApp();
		foodTApp.run();
	}

	Scanner kb = new Scanner(System.in);

	public void run() {
		System.out.println(" !!!! Welcome to the Food Truck App !!!!\n");
		System.out.println(" You will be asked to enter a name, food type and give a rating for 5 Food trucks.\n ");
		System.out.println("If at any point you would like to skip to the main menu enter QUIT for a name\n");

		while (tCount < totalTrucks) {
			System.out.println("Please enter the name of the Food Truck: ");
			String name = kb.nextLine();
			if (name.equalsIgnoreCase("quit")) {
				break;
			} else {
				System.out.print("\nPleas enter type of food served: ");
				String foodType = kb.nextLine();
				System.out.print("Please give the Food Truck a rating from 1 to 5: ");
				int rating = kb.nextInt();
				foodTrucks[tCount++] = new FoodTruck(name, foodType, rating);
			}
			kb.nextLine();
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
				System.out.println("Thank you for using our App!");
				System.exit(0);
			default:
				System.out.println("Selection not found, choose another menu option.");

			}
		}

	}

	private void allFoodTrucks() {
		System.out.println("\nFood Trucks: ");
		for (int t = 0; t < tCount; t++) {
			System.out.println(foodTrucks[t].toString());
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

	private void highestRatedTruck() {
		if (tCount == 0) {
			System.out.println("No data entered, Please rate the food trucks.");
			return;
		}

		FoodTruck highestRatedTruck = foodTrucks[0];
		for (int t = 1; t < tCount; t++) {
			if (foodTrucks[t].getRating() > highestRatedTruck.getRating()) {
				highestRatedTruck = foodTrucks[t];
			}
		}
		System.out.println();
		System.out.println("Highest Rated Food Truck: " + highestRatedTruck);
	}
}
