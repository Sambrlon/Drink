public class main {
    public static void main(String[] args) {
        HotDrinkModel tea = new HotDrinkModel("Чай", 200, 85);
        HotDrinkView view = new HotDrinkView();
        HotDrinkController controller = new HotDrinkController(tea, view);

        controller.printDrinkDetails();
    }
}
