package Object;

public class Car extends Transport {

    public Car(String brand, String model, String year, String country, String color, String maxSpeed, float fuelPerc) {
        super(brand, model, year, country, color, maxSpeed, fuelPerc);
    }

    public void refill(){
        System.out.println("Тип топлива - бензин");
        setFuelPerc(100.00f);
        System.out.println("Количество топлива - " + getFuelPerc() + "%");
    }
}
