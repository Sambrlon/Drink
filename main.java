public class main {
    public static void main(String[] args) {
        HotDrinkWithTemperature tea = new HotDrinkWithTemperature("Чай", 200, 85);
        HotDrinkWithTemperature coffee = new HotDrinkWithTemperature("Кофе", 150, 90);

        VendingMachine machine = new HotDrinkVendingMachine();
        HotDrink receivedDrink = machine.getProduct("Чай", 200, 85);

        System.out.println("Полученный напиток: " + receivedDrink.getName() + ", объем: " + receivedDrink.getVolume() + " мл, температура: " + ((HotDrinkWithTemperature) receivedDrink).getTemperature() + "°C");
    }
}
