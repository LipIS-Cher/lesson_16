import Object.Transport;
import Object.Car;
import Object.Bus;

public class Main {

    public static void main(String[] args) {

        Car Audi = new Car("Audi", "RS-7", "2020", "German", "black", "350");

        Bus Hyundai = new Bus("Hyundai", "bus", "2010", "South Korea", "blue", "200", "BusStation", "Oleg", "50");

        Audi.gettingInformation();
        Hyundai.gettingInformation();

    }
}