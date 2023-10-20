public class HotDrinkModel {
    private String name;
    private int volume;
    private int temperature;

    public HotDrinkModel(String name, int volume, int temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }
}
