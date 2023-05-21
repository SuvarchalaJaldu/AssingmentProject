package bandmusicians;

import java.util.ArrayList;

/**
 * This class has Band attributes.
 *
 */
public class Band {

	private String bandName;
	private ArrayList<Musician> musicians;

	public Band() {
	}

	public Band(String bandName, ArrayList<Musician> musicians) {
		this.bandName = bandName;
		this.musicians = musicians;
	}

	public String getBandName() {
		return bandName;
	}

	public void setBandName(String bandName) {
		this.bandName = bandName;
	}

	public ArrayList<Musician> getMusicians() {
		return musicians;
	}

	public void setMusicians(ArrayList<Musician> musicians) {
		this.musicians = musicians;
	}

	@Override
	public String toString() {
		return "### Band Name: " + bandName + " ###\n" + "Musicians: \n"
				+ musicians.toString().replace("[", "").replace("]", "").replace(", ", "");
	}
}
