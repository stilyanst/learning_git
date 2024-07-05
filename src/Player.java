import java.util.Scanner;

public class Player {
	
	String name;
	String mark;
	
	Player(String name, String mark){
		this.name = name;
		this.mark = mark;
	}
	
	int chooseMarkSpot (Scanner sc) {
		System.out.printf("%s choose your mark spot: ", this.name);
		int tempPlace = Integer.parseInt(sc.nextLine());
		return tempPlace - 1;
	}
}
