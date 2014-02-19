/* INAVSolutions 2013
 * Uriah Sypolt 
 * 
 */
package location;

public class Path {
	private String direction;
	private int weight;
	private PointOfInterest start;
	private PointOfInterest end;

	public Path(String direction, int weight, PointOfInterest start, PointOfInterest end) {
		this.direction = direction;
		this.weight = weight;
		this.start = start;
		this.end = end;

	}

	public String getDirection() {
		return direction;
	}

	public int getWeight() {
		return weight;
	}

	public PointOfInterest getStart() {
		return start;
	}

	public PointOfInterest getEnd() {
		return end;
	}
}
