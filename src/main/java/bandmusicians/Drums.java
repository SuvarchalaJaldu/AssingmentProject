package bandmusicians;

public class Drums {

	    private String instrumentName;
	    private boolean hasHihat;
	    private String manufacturer;

	    public Drums() {
	    }

	    public Drums(String instrumentName, boolean hasHihat, String manufacturer) {
	        this.instrumentName = instrumentName;
	        this.hasHihat = hasHihat;
	        this.manufacturer = manufacturer;
	    }

	    public String getInstrumentName() {
	        return instrumentName;
	    }

	    public void setInstrumentName(String instrumentName) {
	        this.instrumentName = instrumentName;
	    }

	    public boolean isHasHihat() {
	        return hasHihat;
	    }

	    public void setHasHihat(boolean hasHihat) {
	        this.hasHihat = hasHihat;
	    }

	    public String getManufacturer() {
	        return manufacturer;
	    }

	    public void setManufacturer(String manufacturer) {
	        this.manufacturer = manufacturer;
	    }

	    @Override
	    public String toString() {
	        return instrumentName+"\n"+ "has hi-hat: "+ hasHihat+"\n"+"manufacturer: "+manufacturer+"\n";
	    }
	}

