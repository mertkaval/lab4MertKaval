package lab4;

import java.util.ArrayList;
import java.util.Collections;

public class Employees {
	ArrayList<HockeyPlayer> objHockeyPlayer = new ArrayList<HockeyPlayer>();
	ArrayList<Professor> objProfessor = new ArrayList<Professor>();
	ArrayList<Parent> objParent = new ArrayList<Parent>();
	ArrayList<GasStationAttendant> objGasStationAttendant = new ArrayList<GasStationAttendant>();
	public Employees() {
		
		objHockeyPlayer.add(new HockeyPlayer("Wayne Gretzky", 894));
		objHockeyPlayer.add(new HockeyPlayer("Who Ever", 0));
		objHockeyPlayer.add(new HockeyPlayer("Brent Gretzky", 1));
		objHockeyPlayer.add(new HockeyPlayer("Pavel Bure", 437));
		objHockeyPlayer.add(new HockeyPlayer("Jason Bourne", 0));
		
		objProfessor.add(new Professor("Albert Einstein", "Physics"));
		objProfessor.add(new Professor("Alan Turing", "Computer Science"));
		objProfessor.add(new Professor("Richard Feynman", "Physics"));
		objProfessor.add(new Professor("Tim Berners-Lee", "Computer Science"));
		objProfessor.add(new Professor("Kurt Godel", "Logic"));
		
		objParent.add(new Parent("Tiger Woods", 1));
		objParent.add(new Parent("Super Mom", 168));
		objParent.add(new Parent("Lazy Larry", 20));
		objParent.add(new Parent("Ex Hausted", 168));
		objParent.add(new Parent("Super Dad", 167));
		
		objGasStationAttendant.add(new GasStationAttendant("Joe Smith", 20));
		objGasStationAttendant.add(new GasStationAttendant("Tony Baloney", 100));
		objGasStationAttendant.add(new GasStationAttendant("Benjamin Franklin", 100));
		objGasStationAttendant.add(new GasStationAttendant("Mary Fairy", 101));
		objGasStationAttendant.add(new GasStationAttendant("Bee See", 1));
	}
	        

	
	public void sort(){
	
		Collections.sort(objHockeyPlayer);
		Collections.sort(objProfessor);
		Collections.sort(objParent);
		Collections.sort(objGasStationAttendant);
		
		
}
	public void print() {
		
		for(int i=0; i<objHockeyPlayer.size(); i++) {
		System.out.println(objHockeyPlayer.get(i));
		
		
	}
		for(int i=0; i<objProfessor.size(); i++) {
			System.out.println(objProfessor.get(i));
			
			
		}
		for(int i=0; i<objParent.size(); i++) {
			System.out.println(objParent.get(i));
			
			
		}
		for(int i=0; i<objGasStationAttendant.size(); i++) {
			System.out.println(objGasStationAttendant.get(i));
			
			
		}
}
	
}
