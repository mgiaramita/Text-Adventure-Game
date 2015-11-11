import java.util.*;
public class Driver {

	public static void main(String[] args) {
		Map1 game = new Map1();
		Scanner sc = new Scanner(System.in);
		game.printPos();
		System.out.println("Type quit to exit the game");
		
		int exit = 0;
		
		while(exit == 0) {
			String choice = sc.next();
		    switch(choice) {
		        case "E":
		        case "e":
		        case "East":
			    case "east":  game.moveEast();
			                  break;
			    case "W":
			    case "w":  
			    case "West":
			    case "west":  game.moveWest();
			                  break;
			    case "N":
			    case "n": 
			    case "North":
			    case "north": game.moveNorth();
			                  break;
			    case "S":     
			    case "s": 
			    case "South":
			    case "south": game.moveSouth(); 
			                  break;
			    case "Y":
			    case "y":
			    case "Yes":
			    case "yes":   game.yes();
			                  break;        
			    case "Open":
			    case "open":  game.open();
			                  break;
			    case "Take":
			    case "take":  game.take();
			                  break;
			    case "Quit":  
			    case "quit":  exit = 1;
			                  break;
		    }  
		}
		sc.close();
	}

}
