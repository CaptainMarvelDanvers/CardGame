/*
 * Use scan.readLine() when reading menu alternatives. Use string.charAt(int index) 
 * to get a specific character from the input string. 
 */

import java.util.Scanner;

public class MenuExample {

	private Scanner scan;

    public MenuExample() {
    	scan = new Scanner(System.in);
    }
    
    // main loop
    public void run() {
    	char choice = ' ';
    	String answer;
    	
    	do {
    		printMenu();
    		answer = scan.nextLine();
    		answer = answer.toUpperCase();
    		choice = answer.charAt(0); // first character
    		
    		switch(choice) {
    			case 'A':	doThis(); break;
    			case 'B':	doThat(); break;
    			case 'X':	System.out.println("Bye, bye!"); break;
    			default: 	System.out.println("Unknown command");
    		}
    		
    	} while(choice != 'X');
    }

    public void doThis() {
    	System.out.println("Doing this...");
    }

    public void doThat() {
    	System.out.println("Doing that...");
    }
    
    public void printMenu() {
    	System.out.println("---Menu---");
    	System.out.println("A Do This");
    	System.out.println("B Do That");
    	System.out.println("X Exit");
    	System.out.println("----------");
    }
    
    public static void main(String[] args) {
    	MenuExample menu = new MenuExample();
    	menu.run();
    }
}