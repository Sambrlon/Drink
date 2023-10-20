interface VendingMachine {
    HotDrink getProduct(String name, int volume, int temperature);
}

class HotDrinkVendingMachine implements VendingMachine {
    @Override
    public HotDrink getProduct(String name, int volume, int temperature) {
        return new HotDrinkWithTemperature(name, volume, temperature);
    }
}
