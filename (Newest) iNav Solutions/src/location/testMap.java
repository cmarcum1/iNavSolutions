/* INAVSolutions 2013
 * Uriah Sypolt 
 * 
 */
package location;

import java.util.ArrayList;
import java.util.List;

import location.PointOfInterest;
import location.Path;

public class testMap {

	public void testFloorSetup() {
		// map
		// class 801
		// ...|
		// ...v
		// 5--------2--------4
		// | .......|....... |
		// |....... |....... |
		// | .......1....... |<-class 802
		// | .......|....... |
		// | .......|....... |
		// 7--------3--------6
		// ............^
		// ............|
		// .......class 803
		//
		List<PointOfInterest> lPOI = new ArrayList<PointOfInterest>();
		List<PointOfInterest> lRoom = new ArrayList<PointOfInterest>();

		// rooms
		// rooms is the number of rooms
		// floor is the floor you are on

		int room = 7;
		int floor = 8;

		int i = floor * 100; // floor number
		int j = i + room; // number to go to

		for (; i < j + 1; i++) {
			lRoom.add(new PointOfInterest("class", i));
		}

		// intersections
		// intersec is the number of intersections you need

		int intersec = 7;

		j = i + intersec;
		for (; i < j + 1; i++) {
			lPOI.add(new PointOfInterest("intersection", i));
		}

		// halls
		new Path("north", 2, lPOI.get(1), lPOI.get(2));
		new Path("south", 2, lPOI.get(1), lPOI.get(3));
		new Path("east", 2, lPOI.get(2), lPOI.get(4));
		new Path("west", 2, lPOI.get(2), lPOI.get(5));
		new Path("east", 2, lPOI.get(3), lPOI.get(6));
		new Path("west", 2, lPOI.get(3), lPOI.get(7));
		new Path("south", 4, lPOI.get(4), lPOI.get(6));
		new Path("west", 4, lPOI.get(3), lPOI.get(7));

		// to classes
		new Path("west", 1, lPOI.get(2), lRoom.get(1));// class 801
		new Path("east", 2, lPOI.get(3), lRoom.get(3));// class 802
		new Path("south", 2, lPOI.get(4), lRoom.get(2));// class 803
	}
}