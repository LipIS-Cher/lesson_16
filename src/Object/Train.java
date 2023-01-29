package Object;

public class Train extends Transport{

    public Train(String brand, String model, String year, String country, String color, String maxSpeed, float fuelPerc) {
        super(brand, model, year, country, color, maxSpeed, fuelPerc);
    }

    @Override
    public void refill(){
        System.out.println("Тип топлива - дизель");
        setFuelPerc(100.00f);
        System.out.println("Количество топлива - " + getFuelPerc() + "%");
    }
}
