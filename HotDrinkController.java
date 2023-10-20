public class HotDrinkController {
    private HotDrinkModel model;
    private HotDrinkView view;

    public HotDrinkController(HotDrinkModel model, HotDrinkView view) {
        this.model = model;
        this.view = view;
    }

    public void updateDrinkDetails(String name, int volume, int temperature) {
        model = new HotDrinkModel(name, volume, temperature);
    }

    public void printDrinkDetails() {
        view.printDrinkDetails(model.getName(), model.getVolume(), model.getTemperature());
    }
}
