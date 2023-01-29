package Object;

public class Bus extends Transport {

    public String institution;

    public String nameDriver;

    public String numberOfSits;

    public Bus(String brand, String model, String year, String country, String color, String maxSpeed, String institution, String nameDriver, String numberOfSits) {
        super(brand, model, year, country, color, maxSpeed);

        setInstitution(institution);
        setNameDriver(nameDriver);
        setNumberOfSits(numberOfSits);
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        if (institution != null && !institution.isEmpty() && !institution.isBlank()) {
            this.institution = institution;
        }
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public void setNameDriver(String nameDriver) {
        if (nameDriver != null && !nameDriver.isEmpty() && !nameDriver.isBlank()) {
            this.nameDriver = nameDriver;
        }
    }

    public String getNumberOfSits() {
        return numberOfSits;
    }

    public void setNumberOfSits(String numberOfSits) {
        if (numberOfSits != null && !numberOfSits.isEmpty() && !numberOfSits.isBlank()) {
            this.numberOfSits = numberOfSits;
        }
    }

    public void gettingInformation(){
        System.out.println("Марка - " + getBrand() + ", модель - " + getModel() + ", год выпуска - " + getYear() + "г., страна производителя - " + getCountry() + ", цвет - " + getColor() + ", максимальная скорость - " + getMaxSpeed() + "км/ч, предназначен для " + getInstitution() + ", водитель - " + getNameDriver() + ", количество мест - " + getNumberOfSits() + ".");
    }
}
