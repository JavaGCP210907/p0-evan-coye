package com.revature.models;

import java.util.InputMismatchException;

import java.util.List;
import java.util.Scanner;

import com.revature.dao.DiscDao;
import com.revature.dao.IdentityDao;


public class Menu {
	
	DiscDao dDao = new DiscDao();
	IdentityDao iDao = new IdentityDao();
	
	
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
			
			System.out.println("AllDiscs ==> List out all discs in your bag!");
			System.out.println("AddDisc ==> Add a new disc to your bag!");
			System.out.println("UpdatePlastic ==> Replacement disc with new plastic? Update your disc accordingly!");
			System.out.println("RemoveDisc ==> Remove a disc by id from your bag!");
			System.out.println("SpeedCheck ==> Get all discs with a certain speed!");
			System.out.println("NewBrand ==> Add a new brand and type to your disc identities!");
			System.out.println("Exit ==> Exits from your bag!");
			
			
			String input = scan.nextLine();
			
			switch(input) {
			
			case "AllDiscs": {
				
				List<Disc> discs = dDao.getDiscs();
				
				for(Disc d : discs) {
					System.out.println(d);
				}
				
				//log.info("USER RETRIVED LIST OF ALL DISCS");
				
				break;
			}
			
			case "AddDisc": {
				
			try{
				System.out.println("Enter disc name:");
				String dname = scan.nextLine();
		
				System.out.println("Enter disc speed");
				int speed = scan.nextInt();
				scan.nextLine();
			
				System.out.println("Enter disc glide:");
				int glide = scan.nextInt();
				scan.nextLine();
				
				System.out.println("Enter disc turn:");
				int turn = scan.nextInt();
				scan.nextLine();
				
				System.out.println("Enter disc fade:");
				int fade = scan.nextInt();
				scan.nextLine();
				
				System.out.println("Enter disc plastic type:");
				String plastic = scan.nextLine();
				
				System.out.println("Choose a disc identity from the following list");
				System.out.println("Don't see an id match? Use the menu option NewBrand to insert the one you need!");
				
				List<Identity> idList = iDao.allIdentities();
				
				for(Identity i : idList) {
					System.out.println(i);
				}
				
				int id = scan.nextInt();
				
				
				Disc d = new Disc(dname, speed, glide, turn, fade, plastic, id);
				
				dDao.addDisc(d);
			}catch(InputMismatchException e) {
				System.out.println("Make sure speed, glide, turn and fade are numerical values! To start over type AddDisc");
				e.printStackTrace();
				
			}finally {
				scan.nextLine();
			}
				
				break;
			}
			
			case "UpdatePlastic": {
				System.out.println("Enter the name of the disc with a new plastic!");
				String dname = scan.nextLine();
				
				System.out.println("What kind of plastic is it now?");
				String plastic = scan.nextLine();
				
				dDao.updateDiscPlastic(dname, plastic);
				
				//log.info("USER UPDATED THE PLASTIC OF A DISC");
				
				break;
			}
			
			case "RemoveDisc": {
				System.out.println("Enter the id number of the disc you want to delete!");
				int id = scan.nextInt();
				scan.nextLine();
				
				dDao.removeDisc(id);
				
				System.out.println("The disc with id number " + id + " has been removed");
				
				//log.warn("USER REMOVED A DISC");
				
				break;
			}
			
			case "SpeedCheck": {
				System.out.println("What speed are you looking for?");
				int speedInput = scan.nextInt();
				scan.nextLine();
				
				List<Disc> discBySpeed = dDao.getSpeed(speedInput);
				
				for(Disc d : discBySpeed) {
					System.out.println(d);
				}
				
				break;
			}
			
			case "NewBrand":{
				System.out.println("What is the brand name of your disc?");
				String brand = scan.nextLine();
				
				System.out.println("What kind of disc is it?");
				String type = scan.nextLine();
				
				Identity i = new Identity(brand, type);
				
				iDao.addBrand(i);
				
				
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
