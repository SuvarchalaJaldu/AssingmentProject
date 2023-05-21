package bandmusicians;

public class Piano {

    private String instrumentName;
    private int numberOfKeys;
    private String manufacturer;
    private boolean isAcoustic;

    public Piano() {
    }

    public Piano(String instrumentName, int numberOfKeys, String manufacturer, boolean isAcoustic) {
        this.instrumentName = instrumentName;
        this.numberOfKeys = numberOfKeys;
        this.manufacturer = manufacturer;
        this.isAcoustic = isAcoustic;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isAcoustic() {
        return isAcoustic;
    }

    public void setAcoustic(boolean acoustic) {
        isAcoustic = acoustic;
    }

    @Override
    public String toString() {
        return instrumentName+"\n"+"-number of keys: "+numberOfKeys+"\n"+"-manufacturer: "+manufacturer+"\n"+"-is acoustic: "+isAcoustic+"\n";
    }
}
