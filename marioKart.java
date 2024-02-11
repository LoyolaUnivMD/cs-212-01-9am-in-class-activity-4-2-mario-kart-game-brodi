//Programmers:  Brodi Reidel
//Course:  CS212
//Due Date:  Feb 8
//Lab Assignment:  Mario Kart
//Problem Statement:  create game
//Data In:  ask user for player name and character name
//Data Out:  speed, boost and opponent
//Credits: 
import java.util.Scanner; // Import Scanner class

public class MarioKartPlayer {
    public static void MarioKartPlayer(String[] args) {
        Scanner input = new Scanner(System.in);
        

	
		System.out.println("Welcome player!! Whats your name?");
		String player_name = input.next();
		System.out.println("Choose a character. Mario - Luigi - Toad - Bowser - Princess Peach");
		String character = input.next();
		if (character.equals("Mario") || character.equals("Luigi")){
		    System.out.println("Hello " + player_name + "Your speed is 23mph with a 25 yard boost as " + character);
		}else if (character.equals("Princes Peach") || character.equals("Toad")){
		    System.out.println("Hello " + player_name + "Your speed is 20mph with a 35 yard boost as " + character);
		}else if (character.equals("Bowser")){
		    System.out.println("Hello " + player_name + "Your speed is 18mph with a 50 yard boost as " + character);
		}else{
		    System.out.println("Invalid choice!");
		}
		System.out.print("Your racing Yoshi to the Oreo Towers.");
        System.out.print("Yoshi's speed is 21 mph and he has a boost of 30 yards.");
    }
}
