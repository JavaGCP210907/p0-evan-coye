package com.revature.models;

import java.util.List;
import java.util.Scanner;

import com.revature.dao.DiscDao;

public class Menu {
	
	DiscDao dDao = new DiscDao();
	
	
	public void displayMenu() {
		
		boolean displayMenu = true;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
		System.out.println("Welcome to the Interactive Disc Bag!");
		System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
		
		while(displayMenu) {
			
			System.out.println("----------------------------------------------");
			System.out.println("How would you like to interact with your bag?");
			System.out.println("----------------------------------------------");
			
			//Menu options 
			
			System.out.println("AllDiscs ==> Lits out all discs in your bag!");
			System.out.println("AddDisc ==> Add a new disc to your bag!");
			System.out.println("UpdateDisc ==> Change a property on any disc");
			System.out.println("RemoveDisc ==> Remove a disc from your bag!");
			System.out.println("SpeedCheck ==> Get all discs with a certain speed!");
			System.out.println("NewBrand ==> Add a new brand and type to the Identities table!");
			System.out.println("Exit ==> Exits from your bag!");
			
			
			String input = scan.nextLine();
			
			switch(input) {
			
			case "AllDiscs": {
				
				List<Disc> discs = dDao.getDiscs();
				
				for(Disc d : discs) {
					System.out.println(d);
				}
				
				
				break;
			}
			
			case "AddDisc": {
				
				break;
			}
			
			case "UpdateDisc": {
				
				break;
			}
			
			case "RemoveDisc": {
				
				break;
			}
			
			case "SpeedCheck": {
				
				break;
			}
			
			case "NewBrand":{
				
				break;
			}
			
			case "Exit": {
				displayMenu = false;
				System.out.println("See ya next time!");
				break;
			}
			
			default:{
				System.out.println("DOES NOT COMPUTE. PLEASE SEE MENU");
				break;
			}
			}//end of switch statement 
			
		}//end of while loop
		
		System.out.println("Thanks for using the Interactive Disc Bag!");
		scan.close();
		
	}

}
