public class Car {

    private final String brand;
    private final String model;
    private final int year;
    private String color;
    private String tires;
    private final int doors;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.tires = builder.tires;
        this.doors = builder.doors;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getTires() {
        return tires;
    }

    public int getDoors() {
        return doors;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + year + "), "
                + "Color: " + color + ", "
                + "Tires: " + tires + ", "
                + "Doors: " + doors;
    }

    public static class Builder {
        private String brand;
        private String model;
        private int year;
        private String color;
        private String tires;
        private int doors;

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder tires(String tires) {
            this.tires = tires;
            return this;
        }

        public Builder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}