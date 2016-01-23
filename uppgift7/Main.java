package com.arcada.uppgift7;


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args){
		drinkMake();

	}
	public static void drinkMake() { 

		System.out.println("Choose your drink:  1) Hot water 2) Coffee 3) Café Latte 4) Cappuchino 5) Esperesso 6) Check Status 7) Refill 8) Exit ");
		System.out.println("");

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		try{
			String chooseDrink = br.readLine();
			int convertInt = Integer.parseInt(chooseDrink);

			Drink drink = null;
			Drink drink2 = null;
			Drink drink3 = null;
			Drink drink4 = null;
			Drink drink5 = null;
			


			if(convertInt == 1){
				drink = new Vatten();
				drink.checkifDrinkAvailable();
				drink.makeDrink();
				drinkMake();
			}
			if(convertInt == 2){
				drink = new Kaffe();
				drink.checkifDrinkAvailable();
				drink.makeDrink();
				drinkMake();
			}
			if(convertInt == 3){
				drink = new Latte();
				drink.checkifDrinkAvailable();
				drink.makeDrink();
				drinkMake();
			}
			if(convertInt == 4){
				drink = new Cappuchino();
				drink.checkifDrinkAvailable();
				drink.makeDrink();
				drinkMake();
			}
			if(convertInt == 5){
				drink = new Esperesso();
				drink.checkifDrinkAvailable();
				drink.makeDrink();
				drinkMake();

			}
			if(convertInt == 6){
				drink = new Vatten();
				drink2 = new Kaffe();
				drink3 = new Latte();
				drink4 = new Cappuchino();
				drink5 = new Esperesso();
				System.out.println("Water left: "+drink.numberInt()+" cups");
				System.out.println("Coffee left: "+drink2.numberInt()+" cups");
				System.out.println("Cafe Latte left: "+drink3.numberInt()+" cups");
				System.out.println("Cappuchino left: "+drink4.numberInt()+" cups");
				System.out.println("Esperesso left: "+drink5.numberInt()+" cups");
				System.out.println("");
				System.out.println("Returning to menu");
				drinkMake();
						}
			if(convertInt == 7){
			drink = new Vatten();
			drink.refillDrink();
			
			drink2 = new Kaffe();
			drink2.refillDrink();
			
			drink3 = new Latte();
			drink3.refillDrink();
			
			drink4 = new Cappuchino();
			drink4.refillDrink();
			
			drink5 = new Esperesso();
			drink5.refillDrink();
			System.out.println("Refilled cups...");
			System.out.println("");
			drinkMake();
			}
			
			if(convertInt == 8){
				System.out.println("Exiting the program...");
				System.out.println("");
				System.out.println("Terminated");
				System.exit(0);
			}
			else{
				System.out.println("Please try again...");
				System.out.println("");
				drinkMake();
			}
		}
		catch(Exception e){
			System.out.println("Please try again...");
			System.out.println("");
			drinkMake();
		} 

	}
}


