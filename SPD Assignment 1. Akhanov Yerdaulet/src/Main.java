public class Main {
    public static void main(String[] args) {
        Car car1 = new Car.Builder()
                .brand("BMW")
                .model("X5")
                .year(2023)
                .color("Black")
                .doors(4)
                .build();

        Car car2 = new Car.Builder()
                .brand("Toyota")
                .model("Camry")
                .year(2018)
                .color("Black")
                .doors(4)
                .build();

        System.out.println(car1);
        System.out.println(car2);
    }
}
