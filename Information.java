public class Information {
    private String address;

    private int temp;

    private String weather;

    public Information(String address, int temp, String weather) {
        this.address = address;
        this.temp = temp;
        this.weather = weather;
    }

    public String getAddress() {
        return address;
    }

    public int getTemp() {
        return temp;
    }

    public String getWeather() {
        return weather;
    }
}