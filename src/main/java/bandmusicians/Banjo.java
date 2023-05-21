package bandmusicians;

public class Banjo {

    private String instrumentName;
    private int numberOfString;
    private String manufacturer;
    private String stringSize;

    public Banjo() {
    }

    public Banjo(String instrumentName, int numberOfString, String manufacturer, String stringSize) {
        this.instrumentName = instrumentName;
        this.numberOfString = numberOfString;
        this.manufacturer = manufacturer;
        this.stringSize = stringSize;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public int getNumberOfString() {
        return numberOfString;
    }

    public void setNumberOfString(int numberOfString) {
        this.numberOfString = numberOfString;
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
        return instrumentName +"\n" +"-number of string: "+ numberOfString +"\n"+ "-manufacturer: "+manufacturer +"\n"+ "-string size: "+stringSize+"\n";
    }
}