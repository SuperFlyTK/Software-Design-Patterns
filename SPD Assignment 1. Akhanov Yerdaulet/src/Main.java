public class Main {
    public static void main(String[] args) {
        Car car1 = new Car.Builder()
                .brand("BMW")
                .model("X5")
                .year(2023)
                .color("Black")
                .tires("Summer")
                .doors(4)
                .build();

        Car car2 = new Car.Builder()
                .brand("Toyota")
                .model("Camry")
                .year(2018)
                .color("White")
                .tires("Winter")
                .doors(4)
                .build();

        System.out.println("Before update: " + car1);
        car1.setColor("Red");
        car1.setTires("Winter");

        System.out.println("After update: " + car1 + '\n');

        System.out.println("Before update: " + car2);
        car2.setColor("Blue");
        car2.setTires("Summer");

        System.out.println("After update: " + car2);
    }
}
