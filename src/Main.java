import Object.Transport;
import Object.Car;
import Object.Bus;
import Object.Train;

public class Main {

    public static void main(String[] args) {

        Car Audi = new Car("Audi", "RS-7", "2020", "German", "black", "350", 45.45f);

        Bus Hyundai = new Bus("Hyundai", "bus", "2010", "South Korea", "blue", "200", "BusStation", "Oleg", "50", 75.12f);

        Train Loco = new Train("Locomotive", "train", "1990", "Russia", "black", "280", 28.55f);

        Audi.gettingInformation();
        Audi.refill();
        Audi.gettingInformation();
        Hyundai.gettingInformation();
        Loco.gettingInformation();
        Loco.refill();
    }
}