package com.arcada.uppgift7;

public class Latte extends Drink {
	static int liquidLeft = 30;
	public void makeDrink(){
		   if(liquidLeft > 0){
		System.out.println("making latte...");
		liquidLeft -= 1;
		System.out.println("liquid left: " +liquidLeft+" cups");
		System.out.println("");
		   }
		   else{
			  System.out.println("No liquid left");
		   }

return;
		
	}
    @Override public int refillDrink() {
        liquidLeft += 10;
    	return liquidLeft;
    }
    @Override public int numberInt() {
        return liquidLeft;
    }
	public boolean checkifDrinkAvailable(){
return false;
	}
	
}
