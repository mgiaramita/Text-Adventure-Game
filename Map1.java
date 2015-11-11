//import java.util.*;
public class Map1 {

	private String map1[][] = new String[10][10];
	private int posX, posY;
	private boolean key, crystal;
	
	public Map1() {
		posX = 0;
		posY = 0;
		key = false;
		crystal = false;
		
		map1[0][0] = "Hello and welcome to the game. Type south or east to move from here";
		map1[1][0] = "You are in a hallway, continue east or west";
		map1[2][0] = "You have reached a large door, continue east to open it or go west to leave it ";
		map1[3][0] = "You are at the beginning of a large room, with a door to your west. You can go south or east from here";
		map1[4][0] = "The room connects to a hallway to the east, and continues to the south and west";
		map1[5][0] = "You are in a hallway. There is a room to your west, and the hall continues to the east";
		map1[6][0] = "The hallway runs to the east and west";
		map1[7][0] = "The hallway contiunes to the south or west";
		
		map1[0][1] = "The hallway runs north to south";
		map1[3][1] = "You are in the south-west corner of the room. You can go north or east from here";
		map1[4][1] = "The room connects to a hallway to the south, and continues to the north";
		map1[7][1] = "You hear a whisper that tells you not to continue in this direction. South to continue, north to go back.";
		
		map1[0][2] = "The hallway runs north to south. It also splits off to the east.";
		map1[1][2] = "Dead End, west to go back";
		map1[4][2] = "There is a door that requires a key to your south.The room is to the north.\n"
				   + "Do you have the key? Type open if so.";
		map1[7][2] = "In the center of the room there is a cylindrical pedistle. Inscriptions on the walls show a figure standing\n"
				   + "on the device. Do you wish to step onto the pedistle?\n"
				   + "Type yes to get on, or north to go back";
		
		map1[0][3] = "The hallway runs north to south";
		
		map1[0][4] = "You have reached an elevator. Type south to use it, type north to go up the hallway";
		
		map1[0][5] = "To take the elevator down type north. To the south there is a hallway.";
		map1[3][5] = "The hallway continues to the east and south";
		map1[4][5] = "You have found the exit to the dungeon. If you have the crystal the gates will open.\n"
				   + "If you the crystal type open. If not go back west.";
		map1[7][5] = "The hallway continues to the east and south";
		map1[8][5] = "You found the key, now you can open a locked door\n"
				   + "Type take to obtain the key";
		
		map1[0][6] = "The hallway leads to the east and to the north";
		map1[1][6] = "The hallway runs east to west";
		map1[2][6] = "Yes the hallway runs east to west, what more do you want";
		map1[3][6] = "Three choices: north, south or west";
		map1[7][6] = "The hallway runs north to south";
		
		map1[3][7] = "The hallway continues to the east and north";
		map1[4][7] = "The hallway runs east to west";
		map1[5][7] = "The hallway continues east to west";
		map1[6][7] = "The hallway runs east to west";
		map1[7][7] = "You have reached the main room. The path splits off in all directions. You can go north, south, east, or west";
		map1[8][7] = "The main room is to your west, the hallway continues to the east";
		map1[9][7] = "The hallway runs to the south and east";
		
		map1[7][8] = "The main room is to your north, the hallway continues to the south";
		map1[9][8] = "The hallway runs north to south";
		
		map1[2][9] = "Congrats, you beat a really simple game that I made in a few hours.";
		map1[7][9] = "The hallway continues to the east and north";
		map1[8][9] = "The hallway runs east to west";
		map1[9][9] = "The hallway continues to the north and west. It feel like you are going in a circle, how strange";
		
	}
	public void moveNorth() {
		if(posY != 0){                                              //Check for out of bounds exception
		    posY -= 1;
		    if(map1[posX][posY] != null) {
		        System.out.println(map1[posX][posY]);
		    }
		    else {
			    System.out.println("You cant go that way");         //Check for Walls
			    posY += 1;
		    }
		}
		else {
			System.out.println("You cant go that way");
		}
	}
	public void moveEast() {
		if(posX != 9) {
		    posX += 1;
		    if(map1[posX][posY] != null) {
		    	if(posX == 8 && posY == 5 && key == true){
		    		System.out.println("Dead end!\n" + "The hallway continues to the west.");    //Handles the key text disappearing
		    	}
		    	else{
		    		System.out.println(map1[posX][posY]);
		    	}
		    }
		    else {
			    System.out.println("You cant go that way");
			    posX -= 1;
		    }
		}
		else {
			System.out.println("You cant go that way");
		}
	}
	public void moveSouth() {
		if(posY != 9) {
		    posY += 1;
		    if(map1[posX][posY] != null) {
		        System.out.println(map1[posX][posY]);
		    }
		    else {
			    System.out.println("You cant go that way");
			    posY -= 1;
		    }
		}
		else {
			System.out.println("You cant go that way");
		}
	}
	public void moveWest() {
		if(posX != 0) {
		    posX -= 1;
		    if(map1[posX][posY] != null){
		        System.out.println(map1[posX][posY]);
		    }
	    	else {
			    System.out.println("You cant go that way");
			    posX += 1;
		    }
		}
		else {
			System.out.println("You cant go that way");
		}
	}
	
	
	public void printPos() {
		System.out.println(map1[posX][posY]);
	}
	
	
	public void yes() {
		if(posX == 7 && posY == 2) {                             //Teleporter
			posY = 7;
			System.out.println("You have been teleported to a different part of the dungeon");
			System.out.println(map1[posX][posY]);
		}
		else {
			System.out.println("Who are you talking to?");
		}
	}
	public void open() {
		if(posX == 4 && posY == 2 && key == true) {
			posY = 3;                                                                                              //crystal room
			crystal = true;
			System.out.println("You found the crystal! Now you can access the exit and escape the dungeon");
			System.out.println("Type north to leave crystal room");
		}
		else if(posX == 4 && posY == 2 && key == false) {
			System.out.println("You dont have the key");
		}
		else if(posX == 4 && posY == 5 && crystal == true) {
			posX = 2;                                                                                             //end room
			posY = 9;
			System.out.println(map1[posX][posY]);
		}
		else if(posX == 4 && posY == 5 && crystal == false) {
			System.out.println("You dont have the crystal");
		}
		else {
			System.out.println("Nice try");
		}
	}
	public void take() {
		if(posX == 8 && posY== 5 && key == false) {
			key = true;
			System.out.println("Key Obtained!");
		}
		else{
			System.out.println("Nice try");
		}
	}
}
