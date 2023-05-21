package bandmusicians;

public class Synthesizer {

    private String instrumentName;
    private int numberOfKeys;
    private boolean hasLED;
    private String manufacturer;

    public Synthesizer() {
    }

    public Synthesizer(String instrumentName, int numberOfKeys, boolean hasLED, String manufacturer) {
        this.instrumentName = instrumentName;
        this.numberOfKeys = numberOfKeys;
        this.hasLED = hasLED;
        this.manufacturer = manufacturer;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public boolean isHasLED() {
        return hasLED;
    }

    public void setHasLED(boolean hasLED) {
        this.hasLED = hasLED;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return instrumentName+"\n"+"-number of keys: "+numberOfKeys+"\n"+"-has LED: "+hasLED+"\n"+"-manufacturer: "+manufacturer+"\n";
    }
}
