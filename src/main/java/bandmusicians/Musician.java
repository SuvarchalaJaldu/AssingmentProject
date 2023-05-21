package bandmusicians;

/**
 * This class has Musician attributes.
 *
 */
public class Musician {

	private String musianName;
	private Object instrument;

	public Musician() {
	}

	public Musician(String musianName, Object instrument) {
		this.musianName = musianName;
		this.instrument = instrument;
	}

	public String getMusianName() {
		return musianName;
	}

	public void setMusianName(String musianName) {
		this.musianName = musianName;
	}

	public Object getInstrument() {
		return instrument;
	}

	public void setInstrument(Object instrument) {
		this.instrument = instrument;
	}

	@Override
	public String toString() {
		return "Musician Name: " + musianName + "\n" + "Instrument: " + instrument + "\n";
	}
}
