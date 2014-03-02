package Location;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Hashmap {
 public static HashMap<String,LocationInfo> LocationDB = new HashMap<String,LocationInfo>();
 
	public Hashmap() {

	}

	public static String getLocations() {
		String s = "";

		for (LocationInfo info : LocationDB.values()) {
			s += info.toString();
		}
		return s;
	}

	public static ArrayList getLocationsArrayList(boolean type) {
		ArrayList<String> locationsArrayList = new ArrayList<String>();
		for (LocationInfo info : LocationDB.values()) {
		if (type){
			locationsArrayList.add(info.partialInfoToString());
		} 
			else{
				locationsArrayList.add(info.allInfoToString());	
			}
		}
		return locationsArrayList;
	}
	
	public static ArrayList sortTimesVisited(){
		ArrayList<String> locationsArrayList = getLocationsArrayList(true);
		int[] temparr = new int[locationsArrayList.size()];
		ArrayList<LocationInfo> tempAR = new ArrayList<LocationInfo>();
		String[] PlaceHolder = new String[locationsArrayList.size()];
		int i = 0,j=0, phCount=0;
		
		for(LocationInfo info: LocationDB.values()){
			temparr[i] = info.getTimesVisited();
			i++;
		}
		Arrays.sort(temparr);
		
		for(int x =0;x<temparr.length;x++){
			for (LocationInfo info : LocationDB.values()) {
				if(info.getTimesVisited()==temparr[j]){
					boolean repeat = false;
					for(int z=0;z<PlaceHolder.length;z++){
						if(PlaceHolder[z].equals(info.getName())){
							repeat = true;
						}
					}
					if(!repeat){
						PlaceHolder[phCount] = info.getName();
						tempAR.add(info);
					}
				}
			}
		}
		return null;
	}
	
	public static int getSize() {
		return LocationDB.size();
	}

	public static void populate(LocationInfo info) {
		LocationDB.put(info.getName(), info);
	}

	public static LocationInfo getStoredLocation(String name) {
		return LocationDB.get(name);
	}
	
	public static String[] inOrderGet(int num){
		int count = 0;
		for(LocationInfo info: LocationDB.values()){
			if(count == num){
				return info.ArrayToString();
			}
		}
		return null;
	}
	
}
