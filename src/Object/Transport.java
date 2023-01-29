package Object;

public abstract class Transport {
    final String brand;

    final String model;

    final String year;

    final String country;

    public String color;

    public String maxSpeed;

    protected float fuelPerc;

    public Transport(String brand, String model, String year, String country, String color, String maxSpeed, float fuelPerc) {
        if (brand == null){
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null){
            this.model = "default";
        } else {
            this.model = model;
        }
        if (year == null){
            this.year = "2000";
        } else {
            this.year = year;
        }
        if (country == null){
            this.country = "default";
        } else {
            this.country = country;
        }
        if (color == null){
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (maxSpeed == null){
            this.maxSpeed = "150";
        } else {
            this.maxSpeed = maxSpeed;
        }
        if (fuelPerc < 0.00f || fuelPerc > 100.00f){
            this.fuelPerc = 0.00f;
        } else {
            this.fuelPerc = fuelPerc;
        }
    }

    public abstract void refill();
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()){
            this.color = color;
        }
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        if (maxSpeed != null && !maxSpeed.isEmpty() && !maxSpeed.isBlank()){
            this.maxSpeed = maxSpeed;
        }
    }

    public float getFuelPerc() {
        return fuelPerc;
    }

    public void setFuelPerc(float fuelPerc) {
        this.fuelPerc = fuelPerc;
    }

    @Override
    public String toString() {
        return brand + model + year + country + color + maxSpeed + fuelPerc;
    }

    public void gettingInformation(){
        System.out.println("Марка - " + getBrand() + ", модель - " + getModel() + ", год выпуска - " + getYear() + "г., страна производителя - " + getCountry() + ", цвет - " + getColor() + ", максимальная скорость - " + getMaxSpeed() + "км/ч, уровень топлива - " + getFuelPerc() + "%.");
    }
}
