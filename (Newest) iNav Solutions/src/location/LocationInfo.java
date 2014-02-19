package location;
import java.util.*;

public class LocationInfo {
	
	String name;
	String streetAddress;
	int zipCode;
	String state;
	int timesVisited;
	
	public LocationInfo(String[] location){
		//Map mp = new Map();
		String name = location[0];
		String streetAddress = location[1];
		int zipCode = (Integer.valueOf(location[2]));
		String state = location[3];
		int timesVisited = (Integer.valueOf(location[4]));
	}
	public static void createDB(){
		for(int i=1;i<5;i++){
			CreateLocation(i);
		}
	}
	public static void CreateLocation(int value){
		String[] location = new String[7];
		if(value ==1){
			location[0] = "Elevator";
			location[1] = "Morgantown";
			location[2] = "26505";
			location[3] =  "WV";
			location[4] = "1";	
		}
		if(value ==2){
			location[0] = "801 ESB";
			location[1] = "Morgantown";
			location[2] = "26505";
			location[3] =  "WV";
			location[4] = "1";	
		}
		if(value ==3){
			location[0] = "813 ESB";
			location[1] = "Morgantown";
			location[2] = "26505";
			location[3] =  "WV";
			location[4] = "1";	
		}
		if(value ==4){
			location[0] = "817 ESB";
			location[1] = "Morgantown";
			location[2] = "26505";
			location[3] =  "WV";
			location[4] = "1";	
		}
		if(value ==5){
			location[0] = "822 ESB";
			location[1] = "Morgantown";
			location[2] = "26505";
			location[3] =  "WV";
			location[4] = "1";	
		}
		LocationInfo info = new LocationInfo(location);
		Hashmap.populate(info);
	}
	
	public String getName(){
		return name;
	}
	
	public String getStreetAddress(){
		return streetAddress;	
	}
	
	public Integer getZipCode(){
		return zipCode;
	}
	
	public String getState(){
	return state;	
	}
	
	public Integer getTimesVisited(){
		return timesVisited;	
	}
	
	public String allInfoToString(){
		return "Name" + name + "Street Address: " + streetAddress + " State: " + state +  " Zip code: " + zipCode + " Times Visited: " + timesVisited;
	}
	public String partialInfoToString(){
		return "Name" + name + "Street Address: "  + streetAddress + " State: " + state +  " Zip code: " + zipCode;
	}
	public  String[] ArrayToString(){
		//String[] temp = {this.name,this.streetAddress +this.state +this.zipCode};
		String[] temp = {"Hello", "Austin"};
		return temp;
	}
	// insert getMap();
	}
	

