package bandmusicians;

	public class Guitar{

	    private String instrumentName;
	    private int numberOfStrings;
	    private String manufacturer;
	    private String stringSize;

	    public Guitar() {
	    }

	    public Guitar(String instrumentName, int numberOfStrings, String manufacturer, String stringSize) {
	        this.instrumentName = instrumentName;
	        this.numberOfStrings = numberOfStrings;
	        this.manufacturer = manufacturer;
	        this.stringSize = stringSize;
	    }

	    public String getInstrumentName() {
	        return instrumentName;
	    }

	    public void setInstrumentName(String instrumentName) {
	        this.instrumentName = instrumentName;
	    }

	    public int getNumberOfStrings() {
	        return numberOfStrings;
	    }

	    public void setNumberOfStrings(int numberOfStrings) {
	        this.numberOfStrings = numberOfStrings;
	    }

	    public String getManufacturer() {
	        return manufacturer;
	    }

	    public void setManufacturer(String manufacturer) {
	        this.manufacturer = manufacturer;
	    }

	    public String getStringSize() {
	        return stringSize;
	    }

	    public void setStringSize(String stringSize) {
	        this.stringSize = stringSize;
	    }

	    @Override
	    public String toString() {
	        return instrumentName+"\n"+"-number of strings: "+numberOfStrings+"\n"+"-manufacturer: "+manufacturer+"\n"+"-string size: "+stringSize+"\n";
	    }
	}

